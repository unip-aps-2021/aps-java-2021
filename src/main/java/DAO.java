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

    public List<Consequencia> getConsequencia() throws SQLException {
        List<Consequencia> consequencias = new ArrayList<>();
        PreparedStatement ps = conn.prepareStatement("SELECT * FROM CONSEQUENCIAS");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            consequencias.add(new Consequencia(rs.getInt("Id"),
                    rs.getString("Titulo"),
                    rs.getString("Texto")));
        }
        return consequencias;
    }

    public void inserirUsuario(int id, String nome, String email, String senha) throws SQLException {

        PreparedStatement ps = conn.prepareStatement("INSERT INTO USUARIOS VALUES(?, ?, ?, ?)");
        ps.setInt(1, id);
        ps.setString(2, nome);
        ps.setString(3, email);
        ps.setString(4, senha);
    }

}
