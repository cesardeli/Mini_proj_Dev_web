package hei.devweb.refbiere.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import hei.devweb.refbiere.dao.impl.DataSourceProvider;
import hei.devweb.refbiere.entities.Biere;

public class BiereDao {
	
List<Biere> listebiere = new ArrayList<Biere>();
	
	public List<Biere> listeBiere() {
	    try {
	        // Créer une nouvelle connexion à la BDD
	        Connection connection = DataSourceProvider.getDataSource().getConnection();

	        // Utiliser la connexion
	        Statement stmt = connection.createStatement();
	        ResultSet results = stmt.executeQuery("SELECT * FROM biere");
	        while (results.next()) {
	        	Biere biere = new Biere(
	        			results.getInt("idbiere"), 
	        			results.getString("nombiere"),
	        			results.getString("descriptionbiere"));

	            
	        	listebiere.add(biere);
	        }
	        stmt.close();
	        // Fermer la connexion
	        connection.close();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return listebiere;
	}
	
	public Biere getBiere(Integer idBiere) {
		for (Biere biere : listebiere) {
			if (idBiere.equals(biere.getIdbiere())) {
				return biere;
			}
		}
		return null;
	}

	

}
