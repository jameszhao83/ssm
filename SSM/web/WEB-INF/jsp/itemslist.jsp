<%@ page language="java" contentType="text/html;charset=utf-8"  pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
        "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html >
<
<link rel="stylesheet" href="./js/css/bootstrap.min.css">
<link rel="stylesheet" href="./js/css/bootstrap-theme.css">
<script type="text/javascript">
        function query() {
            document.itemsForm.action="queryByItemName.action";
            document.itemsForm.submit();
        }
        function batchDeleteItems() {
            document.itemsForm.action="batchDeleteItems.action";
            document.itemsForm.submit();
        }
        
        
</script>
<form name="itemsForm"   method="post">
商品名称：<input type="text" name="itemsCustom.name">
<input type="button" value="查询" onclick="query()">
        <input type="button" value="批量删除" onclick="batchDeleteItems()">

<hr>
<table class="table  table-striped  table-bordered  table-hover  table-condensed">
        <tr >
                <td class="bg-success">选择</td><td class="bg-success">商品名称</td><td class="bg-success">商品价格</td><td class="bg-success">生产日期</td><td class="bg-success">商品描述</td><td class="bg-success">操作</td>
        </tr>
        <c:forEach items="${itemslist}" var="item">
<tr>
        <td><input type="checkbox" name="items_Ids" value="${item.id}"/></td>
        <td>${item.name}</td> <td>${item.price}</td>
        <td><fmt:formatDate value="${item.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/></td> <td>${item.detail}</td>
        <td><a href="findItemsById.action?id=${item.id}">修改</a></td>


</tr>



        </c:forEach>
</table>
</form>


<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.4.4.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.js"/>
</html>
