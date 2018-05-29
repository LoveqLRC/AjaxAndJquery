<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/28
  Time: 16:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<input value="click" type="button" onclick="onClick()">
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

        xmlHttp.open("get", "${pageContext.request.contextPath}/getAjax?username=张三");

        xmlHttp.send()
    }
</script>
</html>
