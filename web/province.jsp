<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/29
  Time: 17:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="jquery/jquery-1.11.3.min.js"></script>
    <script type="text/javascript">
        $(function () {
            $.get("${pageContext.request.contextPath}/selectPro", function (d) {
                var proId = $("#proId");
                $(d).each(function () {
                    proId.append($("<option value="+this.provinceid+">"+this.name+"</option>"));
                });
            }, "json");
        })
    </script>
</head>
<body>
<select name="province" id="proId">
    <option>省份</option>

</select>
<select name="city" id="cityId">
    <option>请选择</option>
</select>

</body>
</html>
