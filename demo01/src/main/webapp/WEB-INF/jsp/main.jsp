<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 2020/9/28
  Time: 9:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div align="center">
    <h1 align="center">图书借阅系统</h1>
    图书分类：
    <select class="fenlei">
        <option value="0">请选择</option>
        <option value="1">小说</option>
        <option value="2">文学</option>
        <option value="3">传记</option>
        <option value="4">艺术</option>
        <option value="5">少儿</option>
        <option value="6">经济</option>
        <option value="7">管理</option>
        <option value="8">科技</option>
    </select>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    图书名称：
    <input type="text" class="mingcheng"/>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    是否借阅：
    <select class="jieyue">
        <option value="01">请选择</option>
        <option value="0">未借阅</option>
        <option value="1">已借阅</option>
    </select>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <input type="button" class="chaxun" value="查询"/>
    <table border="1" width="700" class="table-fenye">
        <div align="center" style="margin-left: 450px">当前用户：${users.usercode}&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a
                href="/logout">退出</a></div>
        <tr style="background-color:darkgrey;text-align: center">
            <td>图书编号</td>
            <td>图书分类</td>
            <td>图书名称</td>
            <td>作者</td>
            <td>出版社</td>
            <td>操作</td>
        </tr>
    </table>
    <p></p>
    <table class="table" width="500" border="1" align="center">
        <tr align="center">
            <td><a href="javascript:void(0)" class="shou">第一页</a></td>
            <td><a href="javascript:void(0)" class="shang">上一页</a></td>
            <td class="ye">1/1</td>
            <td><a href="javascript:void(0)" class="xia">下一页</a></td>
            <td><a href="javascript:void(0)" class="wei">最后一页</a></td>
            <td>共<span class="zong"></span>条数据</td>
        </tr>
    </table>
</div>
<script type="text/javascript" src="/statics/js/jquery-3.4.1.min.js"></script>
<script type="text/javascript" src="/statics/js/index2.js"></script>
</body>
</html>
