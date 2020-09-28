<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2020/9/27
  Time: 22:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
    <h1>图书借阅系统</h1>
    <form action="/BookInfo" method="post">
        <p>图书分类：
            <select name="bookType">
                <option value="0">--请选择--</option>
                <option value="1">小说</option>
                <option value="2">文艺</option>
                <option value="3">传说</option>
                <option value="4">艺术</option>
                <option value="5">少儿</option>
                <option value="6">经济</option>
                <option value="7">管理</option>
                <option value="8">科技</option>

            </select>
            图书名称：
            <input type="text" name="bookName">
            是否借阅：
            <select name="isBorrow">
                <option value="2">--请选择--</option>
                <option value="1">以借阅</option>
                <option value="0">未借阅</option>
            </select>
            <input type="submit" value="查询">
        </p>
    </form>
    <p>当前用户：${sessionScope.users.userCode}&nbsp;&nbsp;&nbsp;&nbsp;<a href="/close">退出</a></p>
    <table border="1px">
        <tr>
            <td>图书编号</td>
            <td>图书分类</td>
            <td>图书名称</td>
            <td>作者</td>
            <td>出版社</td>
            <td>操作</td>
        </tr>
        <c:forEach items="${pageInfo.list}" var="list">
            <tr>
                <td>${list.bookCode}</td>
                <td>${list.bookType}</td>
                <td>${list.bookName}</td>
                <td>${list.bookAtuthor}</td>
                <td>${list.publishPress}</td>
                <td>
                    <c:if test="${list.isBorrow==1}">
                        <a style="color: red">以借阅</a>
                    </c:if>
                    <c:if test="${list.isBorrow==0}">
                        <a href="#">申请借阅</a>
                    </c:if>
                </td>
            </tr>
        </c:forEach>
    </table>
    <div>
        <span>
            <form action="/BookInfo" method="post">
            <a href="/BookInfo?pageIndex=${pageInfo.prePage}">上一页</a>
                <c:forEach items="${pageInfo.navigatepageNums}" var="i">
                    <a href="/BookInfo?pageIndex=${i}">${i}</a>
                </c:forEach>
            <a href="/BookInfo?pageIndex=${pageInfo.nextPage}">下一页</a>
            共${pageInfo.pages}页
                到第<input type="text" name="pageIndex" style="width: 50px">页
                <input type="submit" value="确定">
            </form>
        </span>
    </div>
</center>
</body>
</html>
