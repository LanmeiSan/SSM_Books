<%--
  Created by IntelliJ IDEA.
  User: 1329669644
  Date: 2020/6/1
  Time: 10:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>增加书籍</title>
    <%--    bootstrop美化--%>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>新增书籍</small>
                </h1>
            </div>
        </div>
        <form action="${pageContext.request.contextPath}/book/addBook" method="post">
            <div class="form-group">
                <label >书籍名称：
                    <span style="color: red;font-weight: bold">
                        ${error_addBook}
                    </span>
                </label>
                <input type="text" name="bookName" class="form-control"  required>
            </div>
            <div class="form-group">
                <label >书籍数量：</label>
                <input type="text" name="bookCounts" class="form-control" required>
            </div>
            <div class="form-group">
                <label>书籍描述：</label>
                <input type="text" name="detail" class="form-control"  required>
            </div>
            <div class="form-group">
                <input type="submit" class="form-control" value="添加"  >
            </div>
            <div class="form-group">
                <a class="form-control" href="${pageContext.request.contextPath}/book/allBook" style="text-align: center;text-decoration:none">返回</a>
            </div>
        </form>
    </div>
</div>
</body>
</html>
