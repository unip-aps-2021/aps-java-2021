import java.sql.*;

public class TesteSQL {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        int id = 1;
        String nome = "Jovani";
        String email = "jovani@yahoo.com.br";
        String senha = "jovi363";

        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String dbUrl = "jdbc:sqlserver://aps2.database.windows.net:1433;database=aps;user=adminaps@aps2;password=Kootra300;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;";
        Connection conn = DriverManager.getConnection(dbUrl);
        PreparedStatement ps = conn.prepareStatement("INSERT INTO USUARIOS VALUES(?, ?, ?, ?)");
        ps.setInt(1, id);
        ps.setString(2, nome);
        ps.setString(3, email);
        ps.setString(4, senha);
        int sla = ps.executeUpdate();

        PreparedStatement statement = conn.prepareStatement("SELECT * FROM USUARIOS");
        ResultSet rs = statement.executeQuery();
        while(rs.next()){
            System.out.println(rs.getString("Nome"));
            System.out.println(rs.getString("Email"));
            System.out.println(rs.getString("Senha"));
        }
    }
}