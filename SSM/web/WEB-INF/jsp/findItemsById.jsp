<%@ page language="java" contentType="text/html;charset=utf-8"  pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
        "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html >
<h1>this is items detail page</h1>
this is items detail page
dfasf

<form action="updateItems.action" method="post" enctype="multipart/form-data">
        <input type="hidden" name="id" value="${items.id}">
<table>
        <tr><td>name</td><td><input name="name" value="${items.name}"/></td></tr>
        <tr><td>price</td><td><input  name="price" value="${items.price}" /></td></tr>
        <tr><td>detail</td><td><input  name="detail" value="${items.detail}" /></td></tr>
        <tr><td>pic</td><td>
        <c:if test="${items.pic !=null}">
            <img src="/pic/${items.pic}"  width="100" height="100"/>
        </c:if>
            <br/>
            <input type="file"  name="items_pic"/>
        </td>
        </tr>
        <tr><td>createTime</td><td><input  name="createTime" value="<fmt:formatDate value="${items.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" /></td></tr>
</table>

        <button type="submit" value="">提交</button>
</form>
</html>
