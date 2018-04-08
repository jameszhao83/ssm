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
        document.reconditionForm.action="queryReconditionList.action";
        document.reconditionForm.submit();
    }
    function batchDeleteItems() {
        document.reconditionForm.action="batchDeleteItems.action";
        document.reconditionForm.submit();
    }


</script>
        <form name="reconditionForm"   method="post">
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
                <td class="bg-success">检修开始时间</td>
                <td class="bg-success">检修结束时间</td>
                <td class="bg-success">是否通过会审</td>
                <td class="bg-success">创建人</td>
                <td class="bg-success">监护人</td>
                <td class="bg-success">审核人</td>
                <td class="bg-success">检修类型</td>
                <td class="bg-success">检修级别</td>
                <td class="bg-success">检修内容</td>
                <td class="bg-success">影响范围</td>
                <td class="bg-success">是否国网信通审批</td>
                <td class="bg-success">是否灾备审批</td>
                <td class="bg-success">是否国网营销审批</td>
                <td class="bg-success">是否检修窗口</td>
                <td class="bg-success">是否停运</td>
                <td class="bg-success">运行方式是否发生变化</td>
                <td class="bg-success">风险等级评估</td>
                <td class="bg-success">时长编号</td>
                <td class="bg-success">是否总部客服审批</td>
        </tr>
        <c:forEach items="${reconditionsList}" var="item" varStatus="status">
<tr>
        <td><input type="checkbox" name="items_Ids" value="${item.id}"/></td>
        <td>${status.index + 1}</td>
        <td>${item.id}</td>
        <td>${item.nu}</td>
        <td>${item.createtime}</td>
        <td>${item.rstarttime}</td>
        <td>${item.rendtime}</td>
        <td>${item.confirm}</td>
        <td>${item.createman}</td>
        <td>${item.watchman}</td>
        <td>${item.auditman}</td>
        <td>${item.rtype}</td>
        <td>${item.rleve}</td>
        <td>${item.rcontext}</td>
        <td>${item.scope}</td>
        <td>${item.sgccconfirm}</td>
        <td>${item.dpconfirm}</td>
        <td>${item.sgccsdconfirm}</td>
        <td>${item.rwindow}</td>
        <td>${item.isdown}</td>
        <td>${item.isruntypechange}</td>
        <td>${item.risk}</td>
        <td>${item.timecode}</td>
        <td>${item.sgcccsconfirm}</td>
        <td><a href="findPersonById.action?id=${item.id}">修改</a>&nbsp;&nbsp;<a href="deletePersonById.action?id=${item.id}">删除</a></td>

</tr>



        </c:forEach>
</table>
</form>


<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.4.4.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.js"/>
</html>
