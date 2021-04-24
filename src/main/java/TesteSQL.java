import java.sql.*;

public class TesteSQL {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String dbUrl = "jdbc:sqlserver://aps2.database.windows.net:1433;database=aps;user=adminaps@aps2;password=Kootra300;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;";
        Connection conn = DriverManager.getConnection(dbUrl);
        if (conn != null) {
            System.out.println("CONEKITADU");
        }
        Statement statement = conn.createStatement();
        ResultSet rs = statement.executeQuery("SELECT * FROM RIOS;");
        System.out.println(rs.getArray("PrimeiraCuriosidade"));
//        while (rs.next()) {
//            System.out.println(rs.getString("Nome"));
//        }
    }
}
