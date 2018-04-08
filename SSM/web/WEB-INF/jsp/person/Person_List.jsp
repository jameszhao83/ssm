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
        document.personsForm.action="queryPersonList.action";
        document.personsForm.submit();
    }
    function batchDeleteItems() {
        document.personsForm.action="batchDeleteItems.action";
        document.personsForm.submit();
    }


</script>
        <form name="personsForm"   method="post">
                姓名：<input type="text" name="personCustom.pname">
                <input type="button" value="查询" onclick="query()">



<hr>
<table class="table  table-striped  table-bordered  table-hover  table-condensed">
        <tr >
                <td class="bg-success">选择</td>
                <td class="bg-success">序号</td>
                <td class="bg-success">姓名</td>
                <td class="bg-success">类型</td>
                <td class="bg-success">单位</td>
                <td class="bg-success">电话</td>

                <td class="bg-success">办公地点</td>
                <td class="bg-success">终端ip</td>
                <td class="bg-success">服务部门</td>
            <td class="bg-success">项目名称</td>
                <td class="bg-success">操作</td>
        </tr>
        <c:forEach items="${personsList}" var="item" varStatus="status">
<tr>
        <td><input type="checkbox" name="items_Ids" value="${item.id}"/></td>
        <td>${status.index + 1}</td>
        <td>${item.pname}</td>
        <td>${item.ptype}</td>
       <td>${item.pcomp}</td>
        <td>${item.phone}</td>

        <td>${item.officeaddress}</td>
        <td>${item.teminalip}</td>
        <td>${item.servicedep}</td>
    <td>${item.projectname}</td>
        <td><a href="findPersonById.action?id=${item.id}">修改</a>&nbsp;&nbsp;<a href="deletePersonById.action?id=${item.id}">删除</a></td>


</tr>



        </c:forEach>
</table>
</form>


<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.4.4.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.js"/>
</html>
