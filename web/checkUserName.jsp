<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/29
  Time: 9:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="#">
    <table>


        <tr>
            <td>用户名</td>
            <td><input type="text" name="username" onblur="checkUserName(this)"></td>
            <td><span id="username_msg"></span></td>
        </tr>
        <tr>
            <td>密码:</td>
            <td><input type="text" name="password"></td>
            <td></td>
        </tr>
        <tr>
            <td colspan='3'><input type="submit" id="sub"></td>
        </tr>
    </table>

</form>

</body>
<script type="text/javascript">
    function checkUserName(obj) {
        xmlHttp = null;
        if (window.XMLHttpRequest) {
            xmlHttp = new XMLHttpRequest();
        } else if (window.ActiveXObject) {
            xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
        }
        xmlHttp.onreadystatechange = function (ev) {
            if (xmlHttp.readyState == 4 && xmlHttp.status == 200) {
                if (xmlHttp.responseText == 1) {
                    document.getElementById("username_msg").innerHTML = "<font color='green'>用户名可以使用</font>";
                    document.getElementById("sub").disable = false;
                } else {
                    document.getElementById("username_msg").innerHTML = "<font color='red'>用户名已被占用</font>";
                    document.getElementById("sub").disabled = true;
                }
            }
        }
        xmlHttp.open("get", "${pageContext.request.contextPath}/checkUserName?username=" + obj.value);

        xmlHttp.send()

    }
</script>
</html>
