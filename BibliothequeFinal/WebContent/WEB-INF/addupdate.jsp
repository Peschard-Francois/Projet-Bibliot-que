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
<h1>FORMULAIRE AJOUTER/MODIFIER</h1>
<a class="btn" href="<c:url value = "accueil?action=menu"/>">Home</a>
</nav>
<main>

<form method="post" action="AddMofierAdherent" >

<fieldset>
      <div>
			
			<input class="enjoy-input" type="hidden" name="idA" id="idA" readonly value="${requestScope.idAdherent}" required placeholder="Id" >
		</div>

		<div>
			<label for="nomA">Nom :  </label> 
			<input class="enjoy-input" type="text" name="nomA" id="nomA" value="${requestScope.nomtest}" required  placeholder="Nom" >
			
		</div>
		<div>
			<label for="prenomA">Prenom :  </label> 
			<input class="enjoy-input" type="text" name="prenomA" id="prenomA" value="${requestScope.prenomtest}" required  placeholder="Prénom" >
            
		</div>
		<div>
			<label for="datenA">Date de Naissance :  </label> 
			<input  class="enjoy-input"type="date" name="datenA" id="datenA" value="${requestScope.dateNaissancetest}" required  placeholder="format : 2020-11-12" >
			
		</div>
		<div>
			<label for="adresseA">Adresse :  </label> 
			<input class="enjoy-input"type="text" name="adresseA" id="adresseA" value="${requestScope.adressePostaletest}" required placeholder="Adresse" >
			
		</div>
		<div>
			<label for="emailA">Email :  </label> 
			<input class="enjoy-input" type="email" name="emailA" id="emailA" value="${requestScope.adresseMailtest}" required  pattern="[a-zA-Z0-9._%+-]+@[a-zA-Z0-9._-]+\.[a-zA-Z]{2,4}"  placeholder="email@adress.com">
			
			</div>
		<div>
			<label for="telA">Téléphone :  </label>
			 <input class="enjoy-input" type="tel" name="telA" id="telA" value="${requestScope.teltest}" required placeholder="xxxxxxxxxx" pattern="\d{2}\d{2}\d{2}\d{2}\d{2}">
			
		</div>
		<div>
		<label>Catégorie ?</label>
		<input class="enjoy-input" type="text" id="catg" name="catg" value="${requestScope.catgtest}" list="l1"  required pattern="[Ee]tudiant|[Ss]alarie|[Ee]nfant|" placeholder="Edudiant , Salarie ou Enfant">
		<datalist id="l1">
      <option>Etudiant</option>
      <option>Salarie</option>
      <option>Enfant</option>   
    </datalist>
   
		</div>
<div class="divbtn">
		<button class="enjoy" name="add1" type="submit" id="valid">Ajouter</button>
		<button class="enjoy"  name="modi" type="submit">Modifier</button>
		</div>
		
</fieldset>

	</form>

</main>


</body>

</html>