<%@ page language="java" contentType="text/html;charset=utf-8"  pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
        "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html >
<h1>this is items insert page</h1>
this is items insert page


<form action="saveItem.action" method="post"  enctype="multipart/form-data">

<table>
        <tr><td>name</td><td><input name="itemsCustom.name" /></td></tr>
        <tr><td>price</td><td>

                <input type="file"  name="items_pic"/>


        </td></tr>
        <tr><td>detail</td><td><input  name="itemsCustom.detail" /></td></tr>
        <tr><td>price</td><td><input  name="itemsCustom.price"  /></td></tr>
        <tr><td>createTime</td><td><input  name="itemsCustom.createTime"  /></td></tr>
</table>

        <button type="submit" value="">提交</button>
</form>
</html>
