<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.Vector" %>
<%@ page import="tn.enig.model.*" %>
<%@ taglib prefix="form"   uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<h1>Liste des Projets</h1>
<h2>Département : ${departement.nom}  </h2>
<table>
<th>
	<td>Id</td>
	<td>Titre</td>
	<td>employes</td>
	<td>list</td>
</th>

<c:forEach items="${projets}" var="projet">
<tr>
<td> ${projet.id}</td>
<td> ${projet.titre}</td>
<td> ${projet.etat}</td>

<td><a href='${cxt}/employes/proj/${projet.id}'>Liste des employees</a></td>
<td><a href='${cxt}/deleteProjet/${projet.id}'>supprimer</a></td>
<td><a href='${cxt}/updateProjet/${projet.id}'>update</a></td>


</tr>
</c:forEach>
</table>
<a href='${cxt}/ajoutProjet'>Ajouter un projet</a>

</html>