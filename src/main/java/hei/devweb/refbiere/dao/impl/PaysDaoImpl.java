package hei.devweb.refbiere.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import hei.devweb.refbiere.dao.PaysDao;
import hei.devweb.refbiere.entities.Pays;

public class PaysDaoImpl implements PaysDao{
	
	@Override
	public List<Pays> listerPays() {
		List<Pays> pays = new ArrayList<>();
		try {
			Connection connection = DataSourceProvider.getDataSource().getConnection();
			PreparedStatement stmt = connection.prepareStatement("SELECT * FROM pays");
			ResultSet resultSet = stmt.executeQuery();
			while (resultSet.next()) {
				pays.add(new Pays(
						resultSet.getInt("idPays"), 
						resultSet.getString("nomPays")));
			}
			stmt.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return pays;
	}
	
	
	
	
	
	
	
	

/*
	@Override
	public List<Pays> listerPays() {
		   List<Pays> listePays = new ArrayList<Pays>();
		    try {
		        // Créer une nouvelle connexion à la BDD
		        Connection connection = DataSourceProvider.getDataSource().getConnection();

		        // Utiliser la connexion
		        Statement stmt = connection.createStatement();
		        ResultSet results = stmt.executeQuery("SELECT * FROM pays");
		        while (results.next()) {
		        	Pays pays = new Pays(
		        			results.getInt("idpays"), 
		        			results.getString("nomPays"));
		            
		        
		            listePays.add(pays);
		        }
		        stmt.close();
		        // Fermer la connexion
		        connection.close();
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }
		    return listePays;
		
	}
	
	
	
	
	
	
	public Pays getPays(Integer idPays) {
		for (Pays pays : listePays) {
			if (idPays.equals(pays.getIdpays())) {
				return pays;
			}
		}
		return null;
	}
	
	*/
	
}
