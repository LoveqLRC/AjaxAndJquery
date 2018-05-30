<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/29
  Time: 15:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="jquery/jquery-1.11.3.min.js"></script>
    <script type="text/javascript">
        $(function () {
            $("#tid").keyup(
                function () {
                    var val = $(this).val();
                    if (val != null && val != "") {
                        $("#did").html("");
                        $.post("${pageContext.request.contextPath}/searchKw", "kw=" + val, function (d) {
                            if (d != "") {

                                var arr = d.split(",");
                                $(arr).each(function () {
                                    $("#did").append($("<div>" + this + "</div>"));
                                });
                                $("#did").show();
                            }
                        });
                    } else {
                        //内容为空的时候 将div隐藏
                        $("#did").hide();
                    }
                }
            );
        })

    </script>
</head>
<body>
<center>
    <div>
        <div>
            <input name="kw" id="tid"><input type="button" value="搜索">
        </div>
        <div id="did" style="border: 1px solid red;width: 171px;position:relative;left:-34px;display:none"></div>
    </div>
</center>
</body>
</html>
