<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ page import="java.util.Vector" %>
	<%@ page import="tn.enig.model.*" %>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<h1>Liste des Départements</h1>
<table border="1">
<thead><tr><th>ID</th><th>Nom</th></thead>
<tbody>
<c:forEach items="${deps }" var="v">
	<tr><td>${v.id }</td><td>${v.nom }</td><td><a href='projets/${d.numero}'>Liste des projets</a></td>
		<td><a href='employes/dept/${d.numero}'>Liste des employes</a></td></tr>
</c:forEach>
</tbody>
</table>
<a href='ajoutProjet'>Ajouter un projet</a>
<a href="ajoutEmploye">Ajouter un Client</a>

</html>