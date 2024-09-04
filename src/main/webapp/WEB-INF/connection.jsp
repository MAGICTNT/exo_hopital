<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String titre = (String) request.getAttribute("titre");
    String login = request.getSession().getAttribute("login") != null ? (String) request.getSession().getAttribute("login") : "";
    Boolean isLogged =  request.getSession().getAttribute("isLogged") != null ? (Boolean) request.getSession().getAttribute("isLogged") : false;
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
<c:choose>
    <c:when test="${isLogged}">
        <p>tu est deja connecter doc</p>
    </c:when>
    <c:otherwise>
        <form action="connection/login" method="post">

            <div>
                <label for="login">Login</label>
                <input type="text" id="login" name="login" required <c:out value="${login}"/>
            </div>
            <div>
                <label for="password">Password</label>
                <input type="text" id="password" name="password" required>
            </div>
            <button>Valider</button>
        </form>
    </c:otherwise>
</c:choose>

<c:import url="composant/header.jsp"/>
</body>
<c:import url="composant/bootstrapJs.jsp"/>
</html>