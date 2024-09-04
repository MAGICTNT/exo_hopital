<%@ page import="fr.maxime.exo_hopital.entity.StatusCode" %>
<%@ page import="fr.maxime.exo_hopital.entity.Patient" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String titre = (String) request.getAttribute("titre");
    StatusCode statusCode = (StatusCode) request.getAttribute("statusCode");
    Patient patient = (Patient) request.getAttribute("patient");
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
    <form action="patient/add" method="post" enctype="multipart/form-data">
        <div>
            <label>Nom:</label>
            <input type="text" id="nom" name="nom" >
        </div>
        <div>
            <label>Téléphone:</label>
            <input type="text" id="telephone" name="telephone" >
        </div>
        <div>
            <label>Date de Naissance:</label>
            <input type="date" id="dateNaissance" name="dateNaissance" >
        </div>
        <div>
            <label>Date de Naissance:</label>
            <input type="file" id="image" name="image" >
        </div>
        <button>valider</button>
        <c:choose>
            <c:when test="${statusCode.getCode() == 200}">
                <p>${statusCode.getMessage()}</p>
            </c:when>
            <c:when test="${statusCode.getCode() == 500}">
                <p>${statusCode.getMessage()}</p>
            </c:when>
        </c:choose>
    </form>

<%--  boucle for sur la liste  --%>
</div>
<c:import url="composant/footer.jsp"/>
</body>
</html>
