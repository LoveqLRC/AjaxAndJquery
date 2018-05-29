<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/28
  Time: 16:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<input type="button" value="send" onclick="onClick()">


</body>
<script type="text/javascript">
    function onClick() {
        xmlHttp = null;
        if (window.XMLHttpRequest) {
            xmlHttp = new XMLHttpRequest();
        } else if (window.ActiveXObject) {
            xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
        }

        xmlHttp.onreadystatechange = function () {
            if (xmlHttp.readyState === 4 && xmlHttp.status === 200) {
                alert(xmlHttp.responseText)
            }
        };
        xmlHttp.open("post", "${pageContext.request.contextPath}/postAjax?username=张三");

        xmlHttp.setRequestHeader("content-type", "application/x-www-form-urlencoded");
        xmlHttp.send("password=一二三")

    }

</script>
</html>
