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
<h1>Infos du patient:</h1>
<div>
    <p>nom</p>
    <p>date de naissance</p>
    <p>téléphone</p>
    <div>
        <p>Ajouter une consultation</p>
        <button>valider</button>
    </div>
    <p>Liste des consultation</p>
</div>
<c:import url="composant/header.jsp"/>
</body>
<c:import url="composant/bootstrapJs.jsp"/>
</html>