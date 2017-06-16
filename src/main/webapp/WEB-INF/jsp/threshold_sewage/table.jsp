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
    <th>因子名称</th>
    <th>数据单位</th>
    <th>一级报警值（H）</th>
    <th>二级报警值（HH）</th>
    <th>备注说明</th>
</tr>
</thead>
<tbody>
	<c:set var="index" value="0"></c:set>
	<c:forEach var="threshold"  items="${thresholdList}">
		<c:set var="index" value="${index+1}"></c:set>
		<tr>
		  <td><input type="checkbox" name="id" value="${threshold.id}"></td>
		  <td>${index}</td>
		  <td><a class="link_wz" href="../threshold_sewage/detail.do?id=${threshold.id}" target="_blank">${threshold.name}</a></td>
		  <td>${threshold.unit}</td>
		  <td>${threshold.min}</td>
		  <td>${threshold.max}</td>
		  <td>${threshold.remark}</td>
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