import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.SQLException;

///**
// * Create a data source with connection pool for PostgreSQL connections
// * @param url the JDBC URL to connect to. Must start with "jdbc:postgresql:"
// * @param user the username for the connection
// * @param password the password for the connection
// * @return a data source with the correct properties set
// */
public class JdbcConnecton {
//TODO: make properties file
//  private static HikariConfig config = new HikariConfig("datasource.properties");
  private static HikariConfig config = new HikariConfig();
  private static HikariDataSource ds;

  static {
    config.setMaximumPoolSize(10);
//    config.setDriverClassName("oracle.jdbc.OracleDriver");
    config.setJdbcUrl( "jdbc:postgresql://localhost:5432/portfolio_db" );
    config.setUsername( "portfolio_admin" );
    config.setPassword( "admin" );
    config.addDataSourceProperty( "cachePrepStmts" , "true" );
    config.addDataSourceProperty( "prepStmtCacheSize" , "250" );
    config.addDataSourceProperty( "prepStmtCacheSqlLimit" , "2048" );
    ds = new HikariDataSource( config );
  }

  private void DataSource() {}

  public static Connection getConnection() throws SQLException {
    return ds.getConnection();
  }
}
