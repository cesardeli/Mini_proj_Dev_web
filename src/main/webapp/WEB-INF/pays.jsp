<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8" ></meta>
		<link href="css/biere.css" rel="stylesheet" type="text/css" media="all" />
		<link href="css/menu-deroulant.css" rel="stylesheet" type="text/css" media="all" />
		<link href="css/article_pays.css" rel="stylesheet" type="text/css" media="all" />
		<link href="css/header_nav.css" rel="stylesheet" type="text/css" media="all" />


		<title> Référence Bière </title>
	</head>
	
	<body>
		<header id="ban">
			<h1>L'unique reference des bieres</h1>
		</header>

		
		<nav>
			<ul id="menu-deroulant">
						
				<li><a href="accueil.html">Accueil</a></li>

				<li><a class="active" href="pays.html">Pays</a>
					<ul>
						<c:forEach var="pays" items="${listePays}">
							<li><a href="belgique.html">${pays.nomPays}</a></li>
						</c:forEach>
				
						
					</ul>
				</li>

				<li><a href="couleur.html">Couleur</a>
					<ul>
						<li><a href="belgique.html">Blonde</a></li>
						<li><a href="belgique.html">Brune</a></li>
						<li><a href="belgique.html">Rousse</a></li>
					</ul>
				</li>

				<li><a href="couleur.html">Brasserie</a>
					<ul>
						<li><a href="belgique.html">Boostels</a></li>
					</ul>
				</li>

				<li><a href="ajouterbiere.html">Ajouter</a></li>
			</ul>
		</nav>
		
		


			
			<section>
				<c:forEach var="pays" items="${listePays}">
					<article >
						<a href="belgique.html">
							<header>
								<h2>${pays.nomPays}</h2>
							</header>
							<img src="../img/drapeau-belge.gif" alt="Drapeau">
						</a>
					</article>
				</c:forEach>
			</section>			

		<footer>
			<p> Ce superbe site a été réalisé par César DELIGNY. Bravo à lui!</p>
			<p> L'abus d'alcool est dangereux pour la santé à consommer avec modération.</p>
		</footer>
    	


	</body>




</html>