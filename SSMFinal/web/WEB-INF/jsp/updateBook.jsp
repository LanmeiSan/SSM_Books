<%--
  Created by IntelliJ IDEA.
  User: 1329669644
  Date: 2020/6/1
  Time: 10:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改书籍</title>
    <%--    bootstrop美化--%>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>修改书籍</small>
                </h1>
            </div>
        </div>

        <form action="${pageContext.request.contextPath}/book/updateBook" method="post">
            <%--出现的问题：我们提交了修改的SQL请求。但是修改失败
            初次考虑：事务问题，配置事务完成，依旧失败
            看一下SQL语句能否执行成功：SQL执行失败，修改未完成
            *前端传递隐藏域--%>
            <input type="hidden" name="bookID" value="${books.bookID}">
            <div class="form-group">
                <label >书籍名称：</label>
                <input type="text" name="bookName" class="form-control" value="${books.bookName}" required>
            </div>
            <div class="form-group">
                <label >书籍数量：</label>
                <input type="text" name="bookCounts" class="form-control" value="${books.bookCounts}" required>
            </div>
            <div class="form-group">
                <label>书籍描述：</label>
                <input type="text" name="detail" class="form-control" value="${books.detail}" required>
            </div>
            <div class="form-group">
                <input type="submit" class="form-control" value="修改"  >
            </div>

        </form>
    </div>
</div>
</body>
</html>
