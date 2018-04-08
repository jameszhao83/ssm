<%@ page language="java" contentType="text/html;charset=utf-8"  pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
        "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html >

<script type="text/javascript">

        function batchUpdateItems() {
            document.itemsForm.action="itemsBatchUpdateSave.action";
            document.itemsForm.submit();
        }
</script>
<form name="itemsForm"   method="post">
        <input type="button" value="批量修改保存" onclick="batchUpdateItems()">
<hr>
<table>
        <tr>
                <td>商品名称</td><td>商品价格</td><td>生产日期</td><td>商品描述</td>
        </tr>
        <c:forEach items="${itemslist}" var="item" varStatus="status">
<tr>
        <td>
                <input type="hidden" name="itemsCustoms[${status.index}].id" value="${item.id}"/>
                <input type="text" name="itemsCustoms[${status.index}].name" value="${item.name}"/></td>
        <td> <input type="text" name="itemsCustoms[${status.index}].price"  value="${item.price}"/></td>
        <td> <input type="text" name="itemsCustoms[${status.index}].createTime"  value="<fmt:formatDate value="${item.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"/></td>
         <td><input type="text" name="itemsCustoms[${status.index}].detail"  value="${item.detail}"/></td>



</tr>
        </c:forEach>
</table>
</form>
</html>
