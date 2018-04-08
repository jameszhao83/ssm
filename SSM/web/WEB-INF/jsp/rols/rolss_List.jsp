<%@ page language="java" contentType="text/html;charset=utf-8"  pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
        "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html >

<link rel="stylesheet" href="../js/css/bootstrap.min.css">
<link rel="stylesheet" href="../js/css/bootstrap-theme.css">
<script type="text/javascript">

    function query() {
        document.rolsForm.action="queryRolsList.action";
        document.rolsForm.submit();
    }
    function batchDeleteItems() {
        document.rolsForm.action="batchDeleteItems.action";
        document.rolsForm.submit();
    }


</script>
        <form name="rolsForm"   method="post">
                姓名：<input type="text" >
                <input type="button" value="查询" onclick="query()">



<hr>
<table class="table  table-striped  table-bordered  table-hover  table-condensed">
        <tr >

                <td class="bg-success">选择</td>
                <td class="bg-success">序号</td>
                <td class="bg-success">id</td>
                <td class="bg-success">编号</td>
                <td class="bg-success">创建时间</td>

                <td class="bg-success">是否总部客服审批</td>
        </tr>
        <c:forEach items="${rolssList}" var="item" varStatus="status">
<tr>
        <td><input type="checkbox" name="items_Ids" value="${item.id}"/></td>
        <td>${status.index + 1}</td>
        <td>${item.id}</td>
        <td>${item.nu}</td>
        <td><a href="findPersonById.action?id=${item.id}">修改</a>&nbsp;&nbsp;<a href="deletePersonById.action?id=${item.id}">删除</a></td>

</tr>



        </c:forEach>
</table>
</form>


<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.4.4.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.js"/>
</html>
