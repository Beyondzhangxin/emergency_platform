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
<title>报警阀值设置</title>
<link href="../css/project.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="../js/jquery.min.js"></script>
<script type="text/javascript" src="../js/all.js"></script>
<script type="text/javascript">
function save(){
	formData = new FormData($("#frmDetail")[0]);
    $.ajax({  
        url : "../threshold_bound/save.do",  
        type : "POST",  
        data :formData,
        processData: false,
        contentType: false,
        dataType: "json",
        success : function(data) 
        {  
        	if(data.status=="0000000"){
        		$("#saveId").val(data.saveId);
        		alert("保存成功");
        	}
        	else if(data.status=="DTVY001"){
        		if(data.name)
        			$("#name_msg").html(data.name);
        		if(data.min)
        			$("#min_msg").html(data.message);
        		if(data.max)
        			$("#max_msg").html(data.message);
        		if(data.unit)
        			$("#unit_msg").html(data.unit);
        	}else
            	alert(data.message);  
        },  
        error : function(data) {  
        	alert(data.status + " : " + data.statusText + " : " + data.responseText);  
        }  
   });  
}

function saveAndClose(){
	formData = new FormData($("#frmDetail")[0]);
    $.ajax({  
        url : "../threshold_bound/save.do",  
        type : "POST",  
        data :formData,
        processData: false,
        contentType: false,
        dataType: "json",
        success : function(data) 
        {  
        	if(data.status=="0000000"){
        		alert("保存成功");
        		window.close();
        	}
        	else if(data.status=="DTVY001"){
        		if(data.name)
        			$("#name_msg").html(data.name);
        		if(data.min)
        			$("#min_msg").html(data.message);
        		if(data.max)
        			$("#max_msg").html(data.message);
        		if(data.unit)
        			$("#unit_msg").html(data.unit);
        	}
        	else
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
            <span class="content_title_form">报警阀值设置详细</span>
            <span class="btnbox">
            	<a class="btn2 btn_refresh" href="javascript:history.go(0)">刷新</a>
            	<a class="btn2 btn_save" href="javascript:save()">保存</a>
				<a class="btn2 btn_save" href="javascript:saveAndClose()">保存并关闭</a>
				<a class="btn2 btn_close" href="javascript:window.close()">关闭</a>
            </span>
            <br class="clearfix"/>
        </p>
      
  		<form action="save.do" id="frmDetail" name="frmDetail"  method="post">
  		 <input type="hidden" class="txtright" id="saveId" name="id" value="${threshold.id }">
        <table class="formtable" border="0" cellpadding="0" cellspacing="0" width="100%">
            <tr>
                <td width="15%" class="txtright"><b class="must">*</b>因子名称</td>
                <td width="35%">
                    <input type="text" class="txtinput"  id="name" name="name" value="${threshold.name }">
                    &nbsp;<span id="name_msg" style="color: red"></span>
                </td>
                
                <td width="15%" class="txtright"> <b class="must">*</b>数据单位</td>
                <td width="35%">
                    <input type="text" class="txtinput"  id="unit" name="unit" value="${threshold.unit }">
                    &nbsp;<span id="unit_msg" style="color: red"></span>
                </td>
            </tr>
            <tr>
                <td width="15%" class="txtright"><b class="must">*</b>一级报警值（H）</td>
                <td width="35%">
                 <input type="text" class="txtinput"  id="min" name="min" value="${threshold.min }">
                    &nbsp;<span id="min_msg" style="color: red"></span>
                </td>
                
                <td width="15%" class="txtright"><b class="must">*</b>二级报警值（HH）</td>
                <td width="35%">
                  <input type="text" class="txtinput"  id="max" name="max" value="${threshold.max }">
                    &nbsp;<span id="max_msg" style="color: red"></span>
                </td>
            </tr>
            <tr>
                <td width="15%" class="txtright">备注说明</td>
                <td colspan="3">
                  <textarea style="width:77%;" class="formarea"  id="remark" name="remark" >${threshold.remark }</textarea>
                </td>
            </tr>
        </table>
        </form>
    </div>
</div>

</body>
</html>
