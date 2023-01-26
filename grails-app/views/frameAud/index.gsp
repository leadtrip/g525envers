<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Frame aud</title>
</head>

<body>
    <table class="table table-bordered">
        <tr>
            <th>ID</th>
            <th>REV</th>
            <th>REVTSTMP</th>
            <th>REVTYPE</th>
            <th>VERSION</th>
            <th>MATERIAL</th>
            <th>SIZE</th>
        </tr>
        <g:each in="${allFrameAuds}" var="aFrameAud" >
        <tr>
            <td>${aFrameAud.ID}</td>
            <td>${aFrameAud.REV}</td>
            <td>${aFrameAud.REVTSTMP}</td>
            <td>${aFrameAud.REVTYPE}</td>
            <td>${aFrameAud.VERSION}</td>
            <td>${aFrameAud.MATERIAL}</td>
            <td>${aFrameAud.SIZE}</td>
        </tr>
        </g:each>
    </table>
</body>
</html>