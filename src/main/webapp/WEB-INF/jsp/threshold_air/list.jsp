<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ 
	page language="java" 
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false"
%>
	<script type="text/javascript">
	 function deleteThreshold() {
         var thresholds =[];
         $("input[name='id']:checked").each(function(){
        	 thresholds.push($(this).val());
         });
         if(thresholds.length>0){
        	 $.ajax({
     			url:"../threshold_air/deleteThreshold.do",
     			type:"post",
     			data:{thresholds:thresholds},
     			traditional: true,
     			success:function(data){
     				if(data.status=="0000000"){
     					alert("删除成功");
     					pageList(1,10);
     				}else{
     					alert("删除失败");
     				}
     			},
     			error:function(){
     				alert(data.status + " : " + data.statusText + " : " + data.responseText);
     			}
     		});
         }else{
        	 alert('至少选择一个需要删除的因子。');
         }
     }
	 
	 function editThreshold() {
		 var thresholds =[];
         $("input[name='id']:checked").each(function(){
        	 thresholds.push($(this).val());
         });
         if(thresholds.length ==1){
        	 window.open("../threshold_air/detail.do?id="+thresholds[0])
         }else{
        	 alert('请选择一个需要编辑的因子。');
         }
	}
	</script>
 <p class="content_head_form">
    <span class="content_title_form">报警阀值列表</span>
        <span class="btnbox">
           	 <a class="btn2 btn_search" href="javascript:searchBoxToggle()">搜索</a>
             <a class="btn2 btn_add" href="../threshold_air/detail.do" target="_blank">添加</a>
             <a class="btn2 btn_delete" href="javascript:deleteThreshold()">删除</a>
             <a class="btn2 btn_edit" href="javascript:editThreshold()">编辑</a>
             <a class="btn2 btn_refresh" href="javascript:openUrl('../threshold_air/list.do','contentbox')">刷新</a>
        </span>
    <br class="clearfix"/>
</p>
<!--搜索栏-->
<form action="../threshold_air/table.do" name="frmSearch" id="frmSearch" method="post">
	<div class="searchbox" >
		<jsp:include page="searchbox.jsp"></jsp:include>
	</div>
	<input type="hidden" name="rows" value="<c:out value="${param.rows}" default="10"/>">
	<input type="hidden" name="page" value="<c:out value="${param.page}" default="1"/>">
</form>
<!--表格数据-->
<div class="tablebox" id="tablebox">
     <jsp:include page="/threshold_air/table.do"></jsp:include>
</div>