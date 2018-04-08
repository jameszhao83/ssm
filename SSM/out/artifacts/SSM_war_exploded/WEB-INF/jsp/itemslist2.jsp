<%@ page language="java" contentType="text/html;charset=utf-8"  pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
        "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html >
<h1>this is itemslist  2</h1>
<table>
        <tr>
                <td>商品名称</td><td>商品价格</td><td>生产日期</td><td>商品描述</td><td>操作</td>
        </tr>
        <c:forEach items="${itemslist}" var="item">
<tr>
        <td>${item.name}</td> <td>${item.price}</td> <td>${item.createTime}</td> <td>${item.detail}</td> <td></td>


</tr>



        </c:forEach>
</table>

</html>
