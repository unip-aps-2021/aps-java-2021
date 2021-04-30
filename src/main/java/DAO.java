import java.sql.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class DAO {
    Connection conn;

    public DAO() throws ClassNotFoundException, SQLException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String dbUrl = "jdbc:sqlserver://aps2.database.windows.net:1433;database=aps;user=adminaps@aps2;password=Kootra300;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;";
        conn = DriverManager.getConnection(dbUrl);
    }

    public Rio getTudo(int id) throws SQLException {
        Rio rio = null;
        PreparedStatement statement = conn.prepareStatement("SELECT * FROM RIOS WHERE Id=?;");
        statement.setInt(1, id);
        ResultSet rs = statement.executeQuery();
        while (rs.next()) {
            rio = new Rio(rs.getString("nome"),
                    rs.getDouble("longitude"),
                    rs.getDouble("longitudepoluicao"),
                    rs.getString("qualidadedaagua"),
                    rs.getString("primeiracuriosidade"),
                    rs.getString("segundacuriosidade"),
                    rs.getString("terceiracuriosidade"));
        }
        return rio;
    }
}
