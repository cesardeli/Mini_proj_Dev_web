package hei.devweb.refbiere;

import java.sql.Connection;
import java.sql.Statement;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import hei.devweb.refbiere.dao.BiereDao;
import hei.devweb.refbiere.dao.impl.DataSourceProvider;
import hei.devweb.refbiere.entities.Biere;

public class BiereDaoTestCase {
	
	private BiereDao biereDao = new BiereDao();

	@Before
	public void initBdd() throws Exception {
		Connection connection = DataSourceProvider.getDataSource().getConnection();
		Statement stmt = connection.createStatement();
		stmt.executeUpdate("DELETE FROM biere");
		stmt.executeUpdate("INSERT INTO `biere`(idbiere, nombiere, descriptionbiere) VALUES (1,'Triple K','Trop bonne')");
		stmt.executeUpdate("INSERT INTO `biere`(idbiere, nombiere, descriptionbiere) VALUES (2,'Leffe','Trop bonne aussi')");
		stmt.close();
		connection.close();
	}

	@Test
	public void testerListeBiere() {
		List<Biere> biere = biereDao.listeBiere();
		Assert.assertEquals(2, biere.size());
		Assert.assertEquals("Triple K", biere.get(0).getNombiere());
		Assert.assertEquals("Leffe", biere.get(1).getNombiere());
		Assert.assertEquals("Trop bonne", biere.get(0).getDescriptionbiere());
		Assert.assertEquals("Trop bonne aussi", biere.get(1).getDescriptionbiere());
	}

}
