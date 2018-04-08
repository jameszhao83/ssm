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
<form name="itemsForm"  action="saveRecondition.action"  method="post">


<hr>
        <table>
                 <tr> <td class="bg-success">编号</td><td><input name="nu"/><td><tr>
                 <tr> <td class="bg-success">创建时间</td> <td><input name="createtime"/><td><tr>
            <tr> <td class="bg-success">检修工作名称</td> <td><input name="rname"/><td><tr>
                 <tr> <td class="bg-success">检修开始时间</td> <td><input name="rstarttime"/><td><tr>
                 <tr> <td class="bg-success">检修结束时间</td> <td><input name="rendtime"/><td><tr>
                 <tr> <td class="bg-success">是否通过会审</td> <td><input name="confirm"/><td><tr>
                 <tr> <td class="bg-success">创建人</td> <td><input name="createman"/><td><tr>
                 <tr> <td class="bg-success">监护人</td> <td><input name="watchman"/><td><tr>
                 <tr> <td class="bg-success">审核人</td> <td><input name="auditman"/><td><tr>
                 <tr> <td class="bg-success">检修类型</td> <td><input name="rtype"/><td><tr>
                 <tr> <td class="bg-success">检修级别</td> <td><input name="rleve"/><td><tr>
                 <tr><td class="bg-success">检修内容</td> <td><input name="rcontext"/><td><tr>
                 <tr><td class="bg-success">影响范围</td> <td><input name="scope"/><td><tr>
                 <tr><td class="bg-success">是否国网信通审批</td> <td><input name="sgccconfirm"/><td><tr>
                 <tr><td class="bg-success">是否灾备审批</td> <td><input name="dpconfirm"/><td><tr>
                 <tr><td class="bg-success">是否国网营销审批</td> <td><input name="sgccsdconfirm"/><td><tr>
                 <tr> <td class="bg-success">是否检修窗口</td> <td><input name="rwindow"/><td><tr>
                 <tr> <td class="bg-success">是否停运</td> <td><input name="isdown"/><td><tr>
                 <tr><td class="bg-success">运行方式是否发生变化</td> <td><input name="isruntypechange"/><td><tr>
                 <tr> <td class="bg-success">风险等级评估</td> <td><input name="risk"/><td><tr>
                 <tr><td class="bg-success">时长编号</td> <td><input name="timecode"/><td><tr>
                 <tr><td class="bg-success">是否总部客服审批</td> <td><input name="sgcccsconfirm"/><td><tr>
                 </table>
        <button type="submit" value="" >提交</button>



</form>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.4.4.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.js"/>
</html>
