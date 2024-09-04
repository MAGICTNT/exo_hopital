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
<h1>Pation: [nom du pation], consultation ref: [idConsultation], Date: [date]</h1>
<form>
    <div id="ficheSoins">
        <h5>Fiche soins</h5>
        <p>soins à remplir:</p>
        <label>Contenu</label>
        <textarea />
        <button>Valider</button>
    </div>
</form>
<form>
    <div id="prescription">
        <h5>prescription</h5>
        <p>prescription à remplir:</p>
        <label>Contenu</label>
        <textarea />
        <button>Valider</button>
    </div>
</form>
<c:import url="composant/header.jsp"/>
</body>
<c:import url="composant/bootstrapJs.jsp"/>
</html>