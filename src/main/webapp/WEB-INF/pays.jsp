<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8" ></meta>
		<link href="css/biere.css" rel="stylesheet" type="text/css" media="all" />
		<link href="css/menu-deroulant.css" rel="stylesheet" type="text/css" media="all" />
		<link href="css/article_pays.css" rel="stylesheet" type="text/css" media="all" />
		<link href="css/header_nav.css" rel="stylesheet" type="text/css" media="all" />


		<title> R�f�rence Bi�re </title>
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
						<li><a href="belgique.html">Belgique</a></li>
						<li><a href="belgique.html">Allemagne</a></li>
						<li><a href="belgique.html">France</a></li>
						
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
				<c:forEach var="listePays" items="${pays}">
					<article >
						<a href="belgique.html">
							<header>
								<h2>${pays.nompays}</h2>
							</header>
							<img src="../img/drapeau-belge.gif" alt="Drapeau">
						</a>
					</article>
				</c:forEach>
			</section>			

		<footer>
			<p> Ce superbe site a �t� r�alis� par C�sar DELIGNY. Bravo � lui!</p>
			<p> L'abus d'alcool est dangereux pour la sant� �consommer avec mod�ration.</p>
		</footer>
    	


	</body>




</html>