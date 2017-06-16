/*** 
*<p>Title: HttpRESTClient</p>
* <p>Description: </p>
* <p>Company: </p> 
* @author  joyu
* @date  2017年6月12日
*/
package com.aiidc.sps.ep.utility;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;

import org.apache.commons.httpclient.DefaultHttpMethodRetryHandler;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.params.HttpMethodParams;
import org.apache.commons.httpclient.util.HttpURLConnection;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

/**
 * @author joyu
 * @date 2017年6月12日
 */
public class HttpRESTClient {
	
	
    public  static String SERVER_URL = "http://192.168.1.207:8080/restsample/sqlrest/";
    private static String SERVER_SECRET = "xxxxxxxxxxxxxxxxx";//链接服务器秘钥
	
    /**
     * 
     * <p>Description: 基于spring http 的 rest 调用</p>
     * @author joyu
     * @param serverUrl
     * @param resourcePath
     * @return
     */
	public static String  springRestClient(String serverUrl,String resourcePath) {
		String jsonString="";
		if(serverUrl==null || serverUrl.length()<1){
			serverUrl = SERVER_URL;
		}
	    HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);        
        //String encodedToken = "Basic "+Base64.encodeBase64String("xiejy:xiejy".getBytes());
        //headers.set("Authorization",encodedToken );
        
        HttpEntity<String> entity = new HttpEntity<String>("", headers);
        RestTemplate restTemplate = new RestTemplate();
        //解决中文乱码问题
        resetCnMessageConverter(restTemplate);
        //String resourcePath = "/task/{taskId}";
        ResponseEntity<String> responseEntity = restTemplate
                .exchange(serverUrl + resourcePath, HttpMethod.GET, entity, String.class,"60838", "1000");
        if (responseEntity.getStatusCode() == HttpStatus.OK) {
        	jsonString = responseEntity.getBody();
            //System.out.println(responseEntity.getBody());
        }
        else
        {
        	jsonString = responseEntity.getStatusCode().toString();
            //System.out.println(responseEntity.getStatusCode());                    
        }
		return jsonString;
	}
	/**
	 * 
	 * <p>Description: 需要认证的服务器请求请用下面这个方法</p>
	 * @author joyu
	 * @return
	 */
	public static String  getRemoteJsonData(String serverUrl,String resourcePath){
		String jsonString ="";
		
		try {
			
            String authPath = serverUrl + "authorization/auth/xiejy/xiejy";
			
            HttpURLConnection conn = (HttpURLConnection) new URL(authPath).openConnection();
            conn.setRequestProperty("Accept", "application/json");
            conn.setConnectTimeout(5000);
            conn.setRequestMethod("GET");
            int code = conn.getResponseCode();
            //调用web服务
            if (code == 200) {
                InputStream inStream1 = conn.getInputStream();
                jsonString = getResponseString(inStream1);
                //System.out.println(jsonResult);
                //解析返回的json
/*                JSONObject jObj = new JSONObject(jsonResult);
                String personId = jObj.getJSONObject("Response").getString("personId");
                String sessionId = jObj.getJSONObject("Response").getString("sessionid");
                String path = SERVER_URL + "/rest/businesses/person/" + personId + "/member";
                URL url = new URL(path);
                conn = (HttpURLConnection) url.openConnection();
                conn.setRequestProperty("Accept", "application/json");
                conn.setRequestProperty("sessionId", sessionId);
                conn.setRequestProperty("personId", personId);
                conn.setConnectTimeout(5000);
                conn.setRequestMethod("GET");
                //调用web服务
                if (conn.getResponseCode() == 200) {
                    InputStream inStream = conn.getInputStream();
                    jsonResult = getResponseString(inStream);
                 }*/
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
		return jsonString;
	}
	
	
	  /**
     * get方式
     * @param url
     * @return json string
     */
    public static String getHttp(String url) {
        String responseMsg = "";
        HttpClient httpClient = new HttpClient();
        GetMethod getMethod = new GetMethod(url);
        getMethod.getParams().setParameter(HttpMethodParams.RETRY_HANDLER,new DefaultHttpMethodRetryHandler());
        try {
            httpClient.executeMethod(getMethod);
            InputStream in = getMethod.getResponseBodyAsStream();
            responseMsg = getResponseString( in);
        } catch (HttpException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //释放连接
            getMethod.releaseConnection();
        }
        return responseMsg;
    }

	private static String getResponseString( InputStream in)
			throws IOException, UnsupportedEncodingException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
		String responseMsg;
		int len = 0;
		byte[] buf = new byte[1024];
		while((len=in.read(buf))!=-1){
		    out.write(buf, 0, len);
		}
		responseMsg = out.toString("UTF-8");
		out.close();
		in.close();
		return responseMsg;
	}

    /**
     * post方式
     * @param url
     * @param para  map形式的参数
      * @return json string
     */
    public static String postHttp(String url,Map<String, String> para) {
        String responseMsg = "";
        HttpClient httpClient = new HttpClient();
        httpClient.getParams().setContentCharset("utf-8");
        PostMethod postMethod = new PostMethod(url);
        if(para!=null){
	        for (Map.Entry<String, String>enty :para.entrySet()) {
	        	postMethod.addParameter(enty.getKey(),enty.getValue());
			}
        }
        //postMethod.addParameter(type, code);
        //postMethod.addParameter("client_id", "");
        //postMethod.addParameter("client_secret", SERVER_SECRET);
        try {
            httpClient.executeMethod(postMethod);
            InputStream in = postMethod.getResponseBodyAsStream();
            responseMsg = getResponseString( in);
        } catch (HttpException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            postMethod.releaseConnection();
        }
        return responseMsg;
    }
    /*
         *初始化RestTemplate，RestTemplate会默认添加HttpMessageConverter
         * 添加的StringHttpMessageConverter非UTF-8
         * 所以先要移除原有的StringHttpMessageConverter，
         * 再添加一个字符集为UTF-8的StringHttpMessageConvert
         * */
    private static void resetCnMessageConverter(RestTemplate restTemplate) {
	    	List<HttpMessageConverter<?>> converterList = restTemplate.getMessageConverters();
	    	HttpMessageConverter<?> converterTarget = null;
	    	for (HttpMessageConverter<?> item : converterList) {
	    		if (item.getClass() == StringHttpMessageConverter.class) {
	    			converterTarget = item;
	    			break;
	    		}
	    	}
		
	    	if (converterTarget != null) {
	    		converterList.remove(converterTarget);
	    	}
	    	HttpMessageConverter<?> converter = new StringHttpMessageConverter(StandardCharsets.UTF_8);
	    	converterList.add(converter);
    	}
}
