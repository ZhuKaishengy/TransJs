<%@ page import="java.security.Key" %>
<%@ page import="com.aisino.domain.Request" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <%--<script type='text/javascript' src='http://192.168.0.125:9002/transJs/jquery-1.10.2.min.js'></script>--%>
    <%--<script type='text/javascript' src='http://192.168.0.125:9002/transJs/m.q.d.min.c2725c10.js'></script>--%>
    <%--<script type='text/javascript' src='http://192.168.0.125:9002/transJs/q.b.a.min.js'></script>--%>
    <%--<script type='text/javascript' src='http://192.168.0.125:9002/transJs/s.d.b.min.js'></script>--%>
    <%--<script type='text/javascript' src='https://fpdk.tax.ln.cn/js/t.q.d.min.js'></script>--%>
    <%--<script type='text/javascript' src='http://192.168.0.125:9002/transJs/t.q.z.min.js'></script>--%>
    <script type='text/javascript' src='http://61.161.232.20:12352/transJs/jquery-1.10.2.min.js'></script>
    <script type='text/javascript' src='http://61.161.232.20:12352/transJs/m.q.d.min.c2725c10.js'></script>
    <script type='text/javascript' src='http://61.161.232.20:12352/transJs/q.b.a.min.js'></script>
    <script type='text/javascript' src='http://61.161.232.20:12352/transJs/s.d.b.min.js'></script>
    <script type='text/javascript' src='http://61.161.232.20:12352/transJs/t.q.d.min.js'></script>
    <script type='text/javascript' src='http://61.161.232.20:12352/transJs/t.q.z.min.js'></script>

    <script>
        var cert = "${requestScope.key.cert}"
        var ts = "${key.ts}"
        var token = "${key.token}"
        var page = "${key.page}"
        var result = $.checkInvConf(cert,token , ts ,'',page);
        document.write(result)
    </script>

</head>
<body>
</body>
</html>
