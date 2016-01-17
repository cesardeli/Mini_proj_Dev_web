package hei.devweb.refbiere.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import hei.devweb.refbiere.dao.impl.DataSourceProvider;
import hei.devweb.refbiere.entities.Couleur;

public class CouleurDao {

List<Couleur> listecouleur = new ArrayList<Couleur>();
	
	public List<Couleur> listeCouleur() {
	    try {
	        // Créer une nouvelle connexion à la BDD
	        Connection connection = DataSourceProvider.getDataSource().getConnection();

	        // Utiliser la connexion
	        Statement stmt = connection.createStatement();
	        ResultSet results = stmt.executeQuery("SELECT * FROM couleurbiere");
	        while (results.next()) {
	        	Couleur couleur = new Couleur(
	        			results.getInt("idcouleur"), 
	        			results.getString("nomcouleur"));

	            
	        	listecouleur.add(couleur);
	        }
	        stmt.close();
	        // Fermer la connexion
	        connection.close();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return listecouleur;
	}
	
	public Couleur getCouleur(Integer idCouleur) {
		for (Couleur couleur : listecouleur) {
			if (idCouleur.equals(couleur.getIdcouleur())) {
				return couleur;
			}
		}
		return null;
	}

	
}
