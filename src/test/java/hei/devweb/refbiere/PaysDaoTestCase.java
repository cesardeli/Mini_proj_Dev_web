package hei.devweb.refbiere;

import java.sql.Connection;
import java.sql.Statement;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import hei.devweb.refbiere.dao.PaysDao;
import hei.devweb.refbiere.dao.impl.DataSourceProvider;
import hei.devweb.refbiere.dao.impl.PaysDaoImpl;
import hei.devweb.refbiere.entities.Pays;

public class PaysDaoTestCase {
	
	private PaysDao paysdao = new PaysDaoImpl();

	@Before
	public void initBdd() throws Exception {
		Connection connection = DataSourceProvider.getDataSource().getConnection();
		Statement stmt = connection.createStatement();
		stmt.executeUpdate("DELETE FROM pays");
		stmt.executeUpdate("INSERT INTO `pays`(idpays, nompays) VALUES (1,'Belgique')");
		stmt.executeUpdate("INSERT INTO `pays`(idpays, nompays) VALUES (2,'France')");
		stmt.close();
		connection.close();
	}

	@Test
	public void testerListePays() {
		List<Pays> pays = paysdao.listerPays();
		Assert.assertEquals(2, pays.size());
		Assert.assertEquals("Belgique", pays.get(0).getNomPays());
		Assert.assertEquals("France", pays.get(1).getNomPays());
	}

}
