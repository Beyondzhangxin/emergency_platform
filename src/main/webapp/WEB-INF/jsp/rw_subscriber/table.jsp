<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ 
	page language="java" 
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false"
%>
<table class="datetable" border="0" cellpadding="0" cellspacing="0" width="100%">
<thead>
<tr>
	<th><input type="checkbox" onClick="javascript:selectAll(this)"></th>
    <th>序号</th>
    <th>订阅者</th>
    <th>消息类型</th>
    <th>推送邮箱</th>
    <th>推送手机</th>
    <th>更新时间</th>
</tr>
</thead>
<tbody>
	<c:set var="index" value="0"></c:set>
	<c:forEach var="subscriber"  items="${subscribers}">
		<c:set var="index" value="${index+1}"></c:set>
		<tr>
		  <td><input type="checkbox" name="id" value="${subscribers.id}"></td>
		  <td>${index}</td>
		  <td><a class="link_wz" href="../threshold_bound/detail.do?id=${subscribers.id}" target="_blank">${subscribers.name}</a></td>
		  <td>${subscribers.unit}</td>
		  <td>${subscribers.min}</td>
		  <td>${subscribers.max}</td>
		  <td>${subscribers.remark}</td>
		  </tr>
	</c:forEach>
 </tbody>
<tfoot>
	<tr>
    <td colspan="9" class="tiaoye_td" style="line-height:34px; background:#f0f4fa;">
		<jsp:include page="../pub/pager.jsp"></jsp:include>
    </td>
   </tr>
</tfoot>
</table>