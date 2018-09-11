<%--
  Created by IntelliJ IDEA.
  User: nf147
  Date: 2018/8/10
  Time: 8:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<form action="HelloServlet.do" method="get">
    <input type="submit" value="get提交">
</form>
<form action="HelloServlet.do" method="post">
    <input type="submit" value="post">
</form>
<script>

    fetch("http://localhost:9999/HelloServlet.do", {
        method: 'put'
    }).then(function (resp) {
        resp.text().then(function (value) {
            console.log(value);
        })
    });

</script>
</body>
</html>
