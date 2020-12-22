<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" href="css/style.css">
<link rel="preconnect" href="https://fonts.gstatic.com">
<link href="https://fonts.googleapis.com/css2?family=Titillium+Web:wght@700&display=swap" rel="stylesheet">
</head>
<body>





<nav>
<h1>GESTION DES ADHERENTS</h1>
<a class="btn" href="<c:url value = "accueil?action=menu"/>">Home</a>
</nav>
<nav>
	<a class="btn" href="<c:url value = "AddMofierAdherent?action=add"/>">Ajouter un Adhérent</a>
	</nav>

<table>
		
		
		<thead>
		    
		    <tr>
		             <td>N°</td>
		             <td>Nom</td>
		             <td>Prenom</td>
		             <td>Date de Naissance</td>
		             <td>Adresse</td>
		             <td>E-Mail</td>
		             <td>Date d'Adhesion</td>
		             <td>Téléphone</td>
		             <td>Catégorie</td>
		             <td></td>
		             <td></td>
		             
		  
		    </tr>
		    
	 </thead>
	 
	 </tbody>
		    <c:forEach var="adherent" items="${requestScope.Ladherents}" >
		    <tr>
		    
		             <td><c:out value="${adherent.idAdherent}" /> 	</td>
		             <td><c:out value="${adherent.nom}" /> </td>
		             <td><c:out value="${adherent.prenom}" /> </td>
		             <td><c:out value="${adherent.dateNaissance}" /> </td>
		             <td><c:out value="${adherent.adressePostale}" /> </td>
		             <td><c:out value="${adherent.adresseMail}" /> </td>
		             <td><c:out value="${adherent.dateAdhesion}" /> </td>
		             <td><c:out value="${adherent.telephone}" /></td>
		             <td><c:out value="${adherent.categorie}" /> </td>
		             <td><a href="<c:url value = "AddMofierAdherent?action=update&id=${adherent.getIdAdherent()}&nom=${adherent.getNom()}&prenom=${adherent.getPrenom()}&datenaissance=${adherent.getDateNaissance()}&adresse=${adherent.getAdressePostale()}&adresseMail=${adherent.getAdresseMail()}&telephone=${adherent.getTelephone()}&catg=${adherent.getCategorie()}"/>" ><img src="https://img.icons8.com/officel/50/000000/edit-user-male.png"/></a></td>
		             <td><a href="<c:url value = "AddMofierAdherent?action=delete&id=${adherent.getIdAdherent()}&nom=${adherent.getNom()}&prenom=${adherent.getPrenom()}"/>"><img src="https://img.icons8.com/officel/50/000000/remove-user-male.png"/></a></td>
		    
		    
		    </tr>

		</c:forEach>
		</tbody>
	</table>
	
	
<br>
<br>
<br>
<br>





</body>
</html>