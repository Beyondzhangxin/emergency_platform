<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ 
	page language="java" 
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false"
%>

<div class="search_item">
    <span class="search_name">因子名称</span>
    <input type="text" class="txtinput " name="name">
</div>
<div class="search_item">
    <span class="search_name">报警设置</span>
	<input type="radio" name="reportSet" value="1">未设置
	<input type="radio" name="reportSet" value="2">已设置
</div>

<br class="clearfix"/>
<div style="text-align:center;">
    <input type="button" class="btn btn_emPlans"  value="搜索" onclick="pageList(1,10)">
</div>
