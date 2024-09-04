<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String titre = (String) request.getAttribute("titre");
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title><%=titre%></title>
</head>
<body>
<c:import url="composant/header.jsp"/>
<c:import url="composant/nav.jsp"/>
<div id="search">
    <form>
        <label>Rechercher un patient</label>
        <input type="text" >
        <button>Valider</button>
    </form>
</div>
<div id="addPatient">
    <form enctype="multipart/form-data">
        <div>
            <label>Nom:</label>
            <input type="text">
        </div>
        <div>
            <label>Téléphone:</label>
            <input type="text">
        </div>
        <div>
            <label>Date de Naissance:</label>
            <input type="date">
        </div>
        <div>
            <label>Date de Naissance:</label>
            <input type="file">
        </div>
    </form>

<%--  boucle for sur la liste  --%>
</div>
<c:import url="composant/footer.jsp"/>
</body>
</html>
