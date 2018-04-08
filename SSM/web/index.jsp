<%@ page language="java" contentType="text/html;charset=utf-8"  pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="zh">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>EnTaroAdunZ</title>
<link rel="stylesheet" href="js/css/bootstrap.min.css">

    <link href="js/css/font-awesome.min.css" rel="stylesheet" media="screen">
    <link rel="stylesheet" href="js/css/sidebar-menu.css">
    <style type="text/css">
        html,body{
            height:100%;

        }
        .main-sidebar{
            position: absolute;
            top: 0;
            left: 0;
            height: 100%;
            min-height: 100%;
            width: 100%;
            z-index: 810;
            background-color: #222d32;
        }

        .logo-lg{
            display: block;
            color: #fff;
            font-size: 20px;
            line-height: 50px;
            text-align: center;
            font-weight: 300;
            font-family: Helvetica, 'Hiragino Sans GB', 'Microsoft Yahei', '微软雅黑', Arial, sans-serif;
        }
        .navbarLeft .logo-lg b{

            font-weight: 800;
        }


    </style>
    <script type="text/javascritp">


    </script>
</head>
<body>

<div class="row "  style="height:8%;background-color:#367fa9">
    <div class="col-md-2 "  ><span class="logo-lg"><b>检修管理系统</b></span></div>
    <div class="col-md-10"></div>
</div>
<div class="row"  style="height:92%;">
    <div class="col-md-2" style="background-color:#367fa9;height:100%">
        <aside class="main-sidebar">
            <section id="div_menu" class="sidebar">
            </section>
        </aside>
    </div>
    <div class="col-md-10">
        <br>


        <form name="personsForm"   method="post">
            姓名：<input type="text" name="personCustom.pname">
            <input type="button" value="查询" onclick="query()">
        </form>


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
            <tbody>
            <tr>
                <td>data</td><td>data</td><td>data</td><td>data</td><td>data</td><td>data</td><td>data</td><td>data</td><td>data</td><td>data</td><td>data</td>
            </tr>                <tr>
                <td>data</td><td>data</td><td>data</td><td>data</td><td>data</td><td>data</td><td>data</td><td>data</td><td>data</td><td>data</td><td>data</td>
            </tr>
            </tbody>
        </table>
    </div>
</div>
<script src="js/jquery-2.1.1.min.js"></script>
<script src="js/sidebar-menu.js"></script>
<script src="js/haha.js"></script>


</body>
</html>