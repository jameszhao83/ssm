<%@ page language="java" contentType="text/html;charset=utf-8"  pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html >

<link rel="stylesheet" href="../js/css/bootstrap.min.css">
<link rel="stylesheet" href="../js/css/bootstrap-theme.css">
<script type="text/javascript">



</script>
<form name="itemsForm"  action="updateSystemInfo.action"  method="post">
    <<input type="hidden" name="id" value="${systeminfo.id}">
    <hr>
    <table>
        <tr> <td class="bg-success">系统名称</td>   <td><input name="systemname" value="${systeminfo.systemname}"/></td></tr>
        <tr> <td class="bg-success">部署类型</td>   <td><input name="devoloopmenttype"  value="${systeminfo.devoloopmenttype}"/></td></tr>
        <tr> <td class="bg-success">系统负责人</td> <td><input name="systemman"  value="${systeminfo.systemman}"/></td></tr>
        <tr> <td class="bg-success">备岗</td>      <td><input name="secendman"  value="${systeminfo.secendman}"/></td></tr>
        <tr> <td class="bg-success">系统简介</td>   <td><input name="systemintro"  value="${systeminfo.systemintro}"/></td></tr>
        <tr> <td class="bg-success">系统类型</td>   <td><input name="systemtype"  value="${systeminfo.systemtype}"/></td></tr>
        <tr> <td class="bg-success">系统级别</td>   <td><input name="systemlevel"  value="${systeminfo.systemlevel}"/></td></tr>
        <tr> <td class="bg-success">支撑人员</td>   <td><input name="systemsupportman1"  value="${systeminfo.systemsupportman1}"/></td></tr>
        <tr> <td class="bg-success">支撑人员</td>   <td><input name="systemsupportman2"  value="${systeminfo.systemsupportman2}"/></td></tr>
        <tr> <td class="bg-success">支撑人员</td>   <td><input name="systemsupportman3"  value="${systeminfo.systemsupportman3}"/></td></tr>
        <tr> <td class="bg-success">支撑人员</td>   <td><input name="systemsupportman4"  value="${systeminfo.systemsupportman4}"/></td></tr>
        <tr><td class="bg-success">支撑人员</td>    <td><input name="systemsupportman5" value="${systeminfo.systemsupportman5}"/></td></tr>
        <tr><td class="bg-success">支撑人员</td>    <td><input name="systemsupportman6"  value="${systeminfo.systemsupportman6}"/></td></tr>
    </table>
    <button type="submit" value="" >提交</button>

</form>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.4.4.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.js"/>
</html>
