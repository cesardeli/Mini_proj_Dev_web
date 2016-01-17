<html>
	<head>
		<meta charset="UTF-8" ></meta>
		<link href="../CSS/biere.css" rel="stylesheet" type="text/css" media="all" />
		<link href="../CSS/menu-deroulant.css" rel="stylesheet" type="text/css" media="all" />
		<link href="../CSS/article.css" rel="stylesheet" type="text/css" media="all" />
		<link href="../CSS/header_nav.css" rel="stylesheet" type="text/css" media="all" />


		<title> Référence Bière </title>
	</head>
	
	<body>
		<header id="ban">
			

			<h1>L'unique reference des bieres</h1>
		</header>

		
		<nav>
			<ul id="menu-deroulant">
						
				<li><a href="accueil.html">Accueil</a></li>

				<li><a href="pays.html">Pays</a>
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

				<li><a class="active" href="ajouterbiere.html">Ajouter</a></li>
			</ul>
		</nav>




		<div id="contenu">
			<section id="ajouter">

				<form action="???" method="post" >

				
  					
  					<label for="nom">Nom de la bière :</label>
 		 			<input type="nom" name="nom" size="20" maxlength="40" value="nom" id="nom" />

 					 <label for="comments">Sous titre :</label>
 		 			 <textarea name="comments" id="comments" cols="165" rows="2">
 		 			 </textarea>

 		 			 <label for="comments">Description :</label>
 		 			 <textarea name="comments" id="comments" cols="165" rows="20">
 		 			 </textarea>

 		 			 <label for="Couleur">Couleur : </label>
  					 <select name="Couleur" id="Couleur">
 					 	<option value="Blonde"> Blonde</option>
  						<option value="Brune"> Brune</option>
  						<option value="Rousse"> Rousse</option>
  					</select>

					<label for="Pays">Pays : </label>
  					<select name="Pays" id="Pays">
 					 	<option value="France"> France</option>
  						<option value="Belgique"> Belgique</option>
  						<option value="Allemagne"> Allemagne</option>
  					</select>


 		 			 <label for="comments">Autre :</label>
 		 			 <textarea name="comments" id="comments" cols="165" rows="20">
 		 			 </textarea>


			

				<p>
					<input type="submit" value="Ajouter" />
 					<input type="reset" value="Annuler" />
				</p>

				</form>



			</section>
		</div>








		<footer>
			<p> Ce superbe site a été réalisé par César DELIGNY. Bravo à lui!</p>
			<p> L'abus d'alcool est dangereux pour la santé à consommer avec modération.</p>
		</footer>
	</body>




</html>