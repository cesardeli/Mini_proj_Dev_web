package hei.devweb.refbiere;

import java.sql.Connection;
import java.sql.Statement;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import hei.devweb.refbiere.dao.BrasserieDao;
import hei.devweb.refbiere.dao.impl.DataSourceProvider;
import hei.devweb.refbiere.entities.Brasserie;

public class BrasserieDaoTestCase {

	private BrasserieDao brasserieDao = new BrasserieDao();

	@Before
	public void initBdd() throws Exception {
		Connection connection = DataSourceProvider.getDataSource().getConnection();
		Statement stmt = connection.createStatement();
		stmt.executeUpdate("DELETE FROM brasserie");
		stmt.executeUpdate("INSERT INTO `brasserie`(idbrasserie, nombrasserie, paysbrasserie) VALUES (1,'Boostel',3)");
		stmt.executeUpdate("INSERT INTO `brasserie`(idbrasserie, nombrasserie, paysbrasserie) VALUES (2,'Leffe',2)");
		stmt.close();
		connection.close();
	}

	@Test
	public void testerListeBrasserie() {
		List<Brasserie> brasserie = brasserieDao.listeBrasserie();
		Assert.assertEquals(2, brasserie.size());
		Assert.assertEquals("Boostel", brasserie.get(0).getNombrasserie());
		Assert.assertEquals("Leffe", brasserie.get(1).getNombrasserie());
		Assert.assertEquals(new Integer(3), brasserie.get(0).getPaysBrasserie());
		Assert.assertEquals(new Integer(2), brasserie.get(1).getPaysBrasserie());
	}

}
