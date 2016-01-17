package hei.devweb.refbiere;

import java.sql.Connection;
import java.sql.Statement;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import hei.devweb.refbiere.dao.CouleurDao;
import hei.devweb.refbiere.dao.impl.DataSourceProvider;
import hei.devweb.refbiere.entities.Couleur;

public class CouleurDaoTestCase {

	private CouleurDao couleurdao = new CouleurDao();

	@Before
	public void initBdd() throws Exception {
		Connection connection = DataSourceProvider.getDataSource().getConnection();
		Statement stmt = connection.createStatement();
		stmt.executeUpdate("DELETE FROM couleurbiere");
		stmt.executeUpdate("INSERT INTO `couleurbiere`(idcouleur, nomcouleur) VALUES (1,'Blonde')");
		stmt.executeUpdate("INSERT INTO `couleurbiere`(idcouleur, nomcouleur) VALUES (2,'Brune')");
		stmt.close();
		connection.close();
	}

	@Test
	public void testerListeCouleur() {
		List<Couleur> couleur = couleurdao.listeCouleur();
		Assert.assertEquals(2, couleur.size());
		Assert.assertEquals("Blonde", couleur.get(0).getNomcouleur());
		Assert.assertEquals("Brune", couleur.get(1).getNomcouleur());
	}

}
