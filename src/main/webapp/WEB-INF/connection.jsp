<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String titre = (String) request.getAttribute("titre");
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <c:import url="composant/bootstrapCss.jsp"/>
    <title><%=titre%></title>
</head>
<body>
<c:import url="composant/header.jsp"/>
<c:import url="composant/nav.jsp"/>
<h1>Se connecter</h1>
<form>
    <div>
        <label>Login</label>
        <input type="text">
    </div>
    <div>
        <label>Password</label>
        <input type="text">
    </div>
    <button>Valider</button>
</form>
<c:import url="composant/header.jsp"/>
</body>
<c:import url="composant/bootstrapJs.jsp"/>
</html>