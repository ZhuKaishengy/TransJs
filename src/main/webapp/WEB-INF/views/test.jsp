<%@ page import="java.security.Key" %>
<%@ page import="com.aisino.domain.Request" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <script type='text/javascript' src='http://192.168.100.25:9002/jquery-1.10.2.min.js'></script>
    <script type='text/javascript' src='http://192.168.100.25:9002/m.q.d.min.c2725c10.js'></script>
    <script type='text/javascript' src='http://192.168.100.25:9002/q.b.a.min.js'></script>
    <script type='text/javascript' src='http://192.168.100.25:9002/s.d.b.min.js'></script>
    <script type='text/javascript' src='http://192.168.100.25:9002/t.q.d.min.js'></script>
    <script type='text/javascript' src='http://192.168.100.25:9002/t.q.z.min.js'></script>
    <script>
        <%--var cert = "${requestScope.key.cert}"--%>
        <%--var ts = "${key.ts}"--%>
        <%--var serverRandom = "${key.serverRandom}"--%>
        <%--var page = "${key.page}"--%>
//        alert(cert+"/n"+ts+"/n"+serverRandom)
//        console.log(cert,ts,serverRandom)
        var cert='912101007600936848'
        var ts='1522638026757'
        var serverRandom= '4155544853455256455248454c4c4f320300240006000000000000000000240081d05e12a3c3143de36ff87c1ce42074da94c15a81d05e12a3c3143de36ff87c1ce42074'

        var result = $.checkTaxno(cert, ts, "", "$.bs.encode($.encrypt($.gen($.moveTo(a+b),$.moveTo($.xx(c2))))+$.gen(a,b)+$.encrypt($.xx(\"\"+$.yy(b)))).toUpperCase() ", serverRandom)
        document.write(result)
    </script>

</head>
<body>
</body>
</html>
