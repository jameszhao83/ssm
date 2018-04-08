<%@ page language="java" contentType="text/html;charset=utf-8"  pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE>
<html >
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width,initial-scale=1">
<link rel="stylesheet" href="../js/css/bootstrap.min.css">
<link rel="stylesheet" href="../js/css/bootstrap-theme.css">
<script type="text/javascript">

    function query() {
        document.reconditionForm.action="queryReconditionList.action";
        document.reconditionForm.submit();
    }
    function batchDeleteItems() {
        document.reconditionForm.action="batchDeleteItems.action";
        document.reconditionForm.submit();
    }


</script>
</head>
<body>
<nav class="navbar navbar-default" role="navigation">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="">aaa</a>
        </div>
    </div>
    <ul class="nav navbar-nav">
        <li class="active"><a href="#">bbb</a></li>
        <li ><a href="#">ccc</a></li>
    </ul>



</nav>


        <form name="reconditionForm"   method="post">
                姓名：<input type="text" >
                <input type="button" value="查询" onclick="query()">



<hr>
<table class="table  table-striped  table-bordered  table-hover  table-condensed">
        <tr>
                <th class="bg-success">系统名称</th>
                <th class="bg-success">部署类型</th>
                <th class="bg-success">系统负责人</th>
                <th class="bg-success">备岗</th>
                <th class="bg-success">系统简介</th>
                <th class="bg-success">系统类型</th>
                <th class="bg-success">系统级别</th>
                <th class="bg-success">支撑人员</th>
                <th class="bg-success">支撑人员</th>
                <th class="bg-success">支撑人员</th>
                <th class="bg-success">支撑人员</th>
                <th class="bg-success">支撑人员</th>
                <th class="bg-success">支撑人员</th>
                <th class="bg-success">操作</th>
        </tr>

        <c:forEach items="${systeminfos}" var="item" varStatus="status">
<tr>
        <td>${item.systemname}</td>
        <td>${item.devoloopmenttype}</td>
        <td>${item.systemman}</td>
        <td>${item.secendman}</td>
        <td>${item.systemintro}</td>
        <td>${item.systemtype}</td>
        <td>${item.systemlevel}</td>
        <td>${item.systemsupportman1}</td>
        <td>${item.systemsupportman2}</td>
        <td>${item.systemsupportman3}</td>
        <td>${item.systemsupportman4}</td>
        <td>${item.systemsupportman5}</td>
        <td>${item.systemsupportman6}</td>
        <td><a href="findSystemInfoById.action?id=${item.id}">修改</a>&nbsp;&nbsp;<a href="deleteSystemInfoById.action?id=${item.id}">删除</a></td>

</tr>



        </c:forEach>
</table>
</form>

</body>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.4.4.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.js"/>
</html>
