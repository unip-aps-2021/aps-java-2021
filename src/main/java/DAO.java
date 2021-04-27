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


    public static String getPrimeiraCuriosidade(String nomeRio) {
        String curiosidade = "";
        try {
            curiosidade = new DAO().getCuriosidade("PrimeiraCuriosidade").get(nomeRio);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return curiosidade;
    }

    public static String getSegundaCuriosidade(String nomeRio) {
        String curiosidade = "";
        try {
            curiosidade = new DAO().getCuriosidade("SegundaCuriosidade").get(nomeRio);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return curiosidade;
    }

    public static String getTerceiraCuriosidade(String nomeRio) {
        String curiosidade = "";
        try {
            curiosidade = new DAO().getCuriosidade("TerceiraCuriosidade").get(nomeRio);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return curiosidade;
    }

    private HashMap<String, String> getCuriosidade(String curiosidade) throws SQLException {
        Statement statement = conn.createStatement();
        ResultSet rs = statement.executeQuery(String.format("SELECT Nome, %s FROM RIOS;", curiosidade));
        HashMap<String, String> hashCuriosidade = new HashMap<>();
        while (rs.next()) {
            hashCuriosidade.put(rs.getString("Nome"), rs.getString(curiosidade));
        }
        return hashCuriosidade;
    }

    public HashMap<String, Map<String, String>> getTextos() throws SQLException {
        Statement statement = conn.createStatement();
        ResultSet rs = statement.executeQuery("SELECT * FROM CONSEQUENCIAS;");
        HashMap<String, Map<String, String>> textosHash = new HashMap<>();
        while (rs.next()){
            textosHash.put(rs.getString("Id"), Collections.singletonMap(rs.getString("Titulo"), rs.getString("Texto")));
        }
        return textosHash;
    }
}
