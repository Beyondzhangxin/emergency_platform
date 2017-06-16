<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ 
	page language="java" 
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false"
%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html;charset=utf-8" />
<title>报警推送设置</title>
<link href="../css/project.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="../js/jquery.min.js"></script>
<script type="text/javascript" src="../js/all.js"></script>
<script type="text/javascript">
function save(){
	formData = new FormData($("#frmDetail")[0]);
    $.ajax({  
        url : "../rw_email_server/save.do",  
        type : "POST",  
        data :formData,
        processData: false,
        contentType: false,
        dataType: "json",
        success : function(data) 
        {  
        	if(data.status=="0000000"){
        		alert("保存成功");
        		openUrl('../rw_email_server/list.do','contentbox');
        	}else if(data.status=="DTVY002"){
        		alert("邮箱连接验证失败");
        	}else if(data.status=="DTVY001"){
        		if(data.emailServer)
        			$("#emailServer_msg").html(data.emailServer);
        		if(data.email)
        			$("#email_msg").html(data.email);
        		if(data.emailPassword)
        			$("#emailPassword_msg").html(data.emailPassword);
        	}else
            	alert(data.message);  
        },  
        error : function(data) {  
        	alert(data.status + " : " + data.statusText + " : " + data.responseText);  
        }  
   });  
}
</script>
</head>
<body>
<!--内容区-->
<div class="mainbox">
	<div class="contentbox">
        <p class="content_head_form">
            <span class="content_title_form">服务器</span>
            <span class="btnbox">
            	<a class="btn2 btn_save" href="javascript:save()">保存</a>
				<a class="btn2 btn_refresh" href="javascript:openUrl('../rw_email_server/list.do','contentbox')">刷新</a>
            </span>
            <br class="clearfix"/>
        </p>
  		<form action="save.do" id="frmDetail" name="frmDetail"  method="post">
        <table class="formtable" border="0" cellpadding="0" cellspacing="0" width="95%">
            <tr>
                <td width="20%" class="txtright"><b class="must">*</b>发送邮件服务器(SMTP)</td>
                <td width="30%">
                    <input type="text" class="txtinput"  id="emailServer" name="emailServer">
                    &nbsp;<span id="emailServer_msg" style="color: red"></span>
                </td>
                
                <td width="20%" class="txtright"> <b class="must">*</b>邮箱地址</td>
                <td width="30%">
                    <input type="text" class="txtinput"  id="email" name="email">
                    &nbsp;<span id="email_msg" style="color: red"></span>
                </td>
            </tr>
            <tr>
                <td width="20%" class="txtright"><b class="must">*</b>邮箱密码/授权码</td>
                <td width="30%">
                 <input type="text" class="txtinput"  id="emailPassword" name="emailPassword">
                    &nbsp;<span id="emailPassword_msg" style="color: red"></span>
                </td>
            </tr>
        </table>
        </form>
    </div>
</div>

</body>
</html>
