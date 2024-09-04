<%@ page import="fr.maxime.exo_hopital.entity.StatusCode" %>
<%@ page import="fr.maxime.exo_hopital.entity.Patient" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String titre = (String) request.getAttribute("titre");
    Patient patient = (Patient) request.getAttribute("patient");
    Boolean isLogged =  request.getSession().getAttribute("isLogged") != null ? (Boolean) request.getSession().getAttribute("isLogged") : false;

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

<c:choose>
    <c:when test="${!isLogged}">
        <p>Ben alors Elmer Fudd ? pas connecter docteur ?</p>
    </c:when>
    <c:otherwise>
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
                <label>Image avatar:</label>
                <input type="file" name="image" >
            </div>
            <button>valider</button>

        </form>
    </c:otherwise>
</c:choose>
<%--  boucle for sur la liste  --%>
</div>
<c:import url="composant/footer.jsp"/>
</body>
</html>
