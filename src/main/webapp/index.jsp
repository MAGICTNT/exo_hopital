<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String titre = (String) request.getAttribute("titre");

%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <c:import url="WEB-INF/composant/bootstrapCss.jsp"/>
    <title><%= titre != null ? titre : "menu principal" %></title>
</head>
<body>
<c:import url="WEB-INF/composant/header.jsp"/>
<c:import url="WEB-INF/composant/nav.jsp"/>
<p>menu principal</p>
<button><a href="${pageContext.request.contextPath}/connection">connection</a> </button>
<c:import url="WEB-INF/composant/footer.jsp"/>
</body>
<c:import url="WEB-INF/composant/bootstrapJs.jsp"/>
</html>