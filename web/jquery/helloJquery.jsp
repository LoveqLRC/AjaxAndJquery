<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/29
  Time: 10:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/juqery/jquery-1.11.3.min.js"></script>
    <script type="text/javascript">
        $(function () {
            $("#btn").click(function () {
                var url = "${pageContext.request.contextPath}/jquery";
                // var params = "username=扎那个三";
                var params = {"username": "扎那个三"};
                //load方式
                /* $(this).load(url,params,function(d){
                    alert(d);
                }); */

                //get方式
                /* $.get(url,params,function(d){
                    alert(d)
                }); */

                //post方式
                /* $.post(url,params,function(d){
                    alert(d.msg);
                },"json"); */

                //ajax 方式
                $.ajax({
                    url:url,
                    type:"post",
                    data:params,
                    success:function(d){
                        alert(d.msg);
                    },
                    error:function(){},
                    dataType:"json"

                });

            });
        });
    </script>
</head>
<body>
<input type="button" id="btn" value="点我">
</body>
</html>
