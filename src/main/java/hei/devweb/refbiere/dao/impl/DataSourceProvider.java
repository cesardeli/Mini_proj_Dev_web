package hei.devweb.refbiere.dao.impl;

import javax.sql.DataSource;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class DataSourceProvider {

	private static MysqlDataSource dataSource;

	public static DataSource getDataSource() {
		if (dataSource == null) {
			dataSource = new MysqlDataSource();
			dataSource.setServerName("localhost");
			dataSource.setPort(8889);
			dataSource.setDatabaseName("biere");
			dataSource.setUser("root");
			dataSource.setPassword("root");
		}
		return dataSource;
	}

}
