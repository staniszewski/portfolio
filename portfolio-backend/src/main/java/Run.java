import dto.Portfolio;
import io.javalin.Javalin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Run {
    public static void main (String[] args) throws SQLException {
        Connection c = JdbcConnecton.getConnection();
        TestClass response = new TestClass();
        PreparedStatement ps = c.prepareStatement("select * from data;");
        ResultSet rs =  ps.executeQuery();
//        System.out.println(
            if(rs.next())
            {
                rs.getString(1);
                response.setCol1(rs.getString("col1"));
                System.out.println(rs.getString(1));
            }

        Portfolio p = new Portfolio();
        System.out.println(p.getCol1());
        Javalin app = Javalin.create(cfg -> cfg.enableCorsForAllOrigins()).start(3000);
        String jsonWannabe =  "{" +
            "data {" +
            "data:" +
            "no_data" +
            "}" +
            "}";
        app.get("/api", ctx -> ctx.json(response));
    }
}
