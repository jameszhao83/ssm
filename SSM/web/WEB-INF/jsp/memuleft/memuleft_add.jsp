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
<form name="itemsForm"  action="saveMemuleft.action"  method="post">


<hr>
        <table>

                 <tr> <td class="bg-success">节点名</td> <td><input name="nodename"/><td><tr>
            <tr> <td class="bg-success">节点地址</td> <td><input name="nodeurl"/><td><tr>
                 <tr> <td class="bg-success">是否子节点</td> <td><input name="isleat"/><td><tr>
                 <tr> <td class="bg-success">父节点ID</td> <td><input name="parentid"/><td><tr>
        </tr>
        </table>
        <button type="submit" value="" >提交</button>


</form>

<table class="table1">
    <tr>
        <td></td>
        <td></td>
    </tr>
    <tr>
        <td></td>
        <td></td>
    </tr>
    <tr>
        <td></td>
        <td></td>
    </tr>
</table>


<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.4.4.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.js"/>
</html>
