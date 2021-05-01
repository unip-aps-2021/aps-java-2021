import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DAO {
    Connection conn;

    public DAO() throws ClassNotFoundException, SQLException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String dbUrl = "jdbc:sqlserver://aps2.database.windows.net:1433;database=aps;user=adminaps@aps2;password=Kootra300;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;";
        conn = DriverManager.getConnection(dbUrl);
    }

    public List<Rio> get() throws SQLException {
        int[] ids = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24};
        List<Rio> rios = new ArrayList<>();
        for (int i = 0; i <= ids.length - 1; i++) {
            PreparedStatement statement = conn.prepareStatement("SELECT * FROM RIOS WHERE Id=?");
            statement.setInt(1, ids[i]);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                rios.add(new Rio(rs.getString("nome"),
                        rs.getDouble("longitude"),
                        rs.getDouble("longitudepoluicao"),
                        rs.getString("qualidadedaagua"),
                        rs.getString("primeiracuriosidade"),
                        rs.getString("segundacuriosidade"),
                        rs.getString("terceiracuriosidade")));
            }
        }
        return rios;
    }
}
