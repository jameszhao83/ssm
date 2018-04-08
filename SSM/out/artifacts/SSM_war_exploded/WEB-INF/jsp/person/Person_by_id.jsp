<%@ page language="java" contentType="text/html;charset=utf-8"  pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
        "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html >
<
<link rel="stylesheet" href="../js/css/bootstrap.min.css">
<link rel="stylesheet" href="../js/css/bootstrap-theme.css">
<script type="text/javascript">

        
        
</script>
<form name="itemsForm"  action="updatePerson.action"  method="post">
商品名称：
        <input type="hidden" name="id" value="${person.id}"/>
<hr>
        <table>
                <tr><td>pName</td><td><input name="pname" value="${person.pname}"/></td></tr>
                <tr><td>pType</td><td><input  name="ptype"  value="${person.ptype}" /></td></tr>
                <tr><td>pComp</td><td><input  name="pcomp"  value="${person.pcomp}" /></td></tr>
                <tr><td>passWord</td><td><input  name="password"  value="${person.password}"  /></td></tr>
                <tr><td>userName</td><td><input  name="username"  value="${person.username}" /></td></tr>
                <tr><td>userName</td><td><input  name="phone"  value="${person.phone}" /></td></tr>
                <tr><td>userName</td><td><input  name="telephone"  value="${person.telephone}" /></td></tr>
                <tr><td>scope</td><td><input  name="scope"   value="${person.scope}" /></td></tr>
                <tr><td>entrytime</td><td><input  name="entrytime"   value="${person.entrytime}" /></td></tr>
                <tr><td>leavetime</td><td><input  name="leavetime"   value="${person.leavetime}" /></td></tr>
                <tr><td>projectname</td><td><input  name="projectname"   value="${person.projectname}" /></td></tr>
                <tr><td>officeaddress</td><td><input  name="officeaddress"   value="${person.officeaddress}" /></td></tr>
                <tr><td>teminalip</td><td><input  name="teminalip"   value="${person.teminalip}" /></td></tr>
                <tr><td>servicedep</td><td><input  name="servicedep"   value="${person.servicedep}" /></td></tr>
        </table>
        <button type="submit" value="">提交</button>
</form>


<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.4.4.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.js"/>
</html>
