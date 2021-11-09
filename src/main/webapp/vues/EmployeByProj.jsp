<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ page import="java.util.Vector" %>
	<%@ page import="tn.enig.model.*" %>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Liste des Projets</h1>
<h2>Département : ${projet.titre}  </h2>
<table>
	<th>
		<td>Id</td>
		<td>Nom</td>
		<td>Fonction</td>
	</th>

<c:forEach items="${employesProj}" var="employe">
	<tr>
		<td> ${employe.id}</td>
		<td> ${employe.nom}</td>
		<td> ${employe.fonct}</td>

	</tr>
</c:forEach>
</table>
<a href="ajoutEmploye">Ajouter un Employee</a>


</body>
</html>