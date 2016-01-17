package hei.devweb.refbiere.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import hei.devweb.refbiere.dao.impl.DataSourceProvider;
import hei.devweb.refbiere.entities.Brasserie;

public class BrasserieDao {

List<Brasserie> listebrasserie = new ArrayList<Brasserie>();
	
	public List<Brasserie> listeBrasserie() {
	    try {
	        // Créer une nouvelle connexion à la BDD
	        Connection connection = DataSourceProvider.getDataSource().getConnection();

	        // Utiliser la connexion
	        Statement stmt = connection.createStatement();
	        ResultSet results = stmt.executeQuery("SELECT * FROM brasserie");
	        while (results.next()) {
	        	Brasserie brasserie = new Brasserie(
	        			results.getInt("idbrasserie"), 
	        			results.getString("nombrasserie"),
	        			results.getInt("paysbrasserie"));

	            
	        	listebrasserie.add(brasserie);
	        }
	        stmt.close();
	        // Fermer la connexion
	        connection.close();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return listebrasserie;
	}
	
	public Brasserie getBrasserie(Integer idBrasserie) {
		for (Brasserie brasserie : listebrasserie) {
			if (idBrasserie.equals(brasserie.getIdbrasserie())) {
				return brasserie;
			}
		}
		return null;
	}

	
}
