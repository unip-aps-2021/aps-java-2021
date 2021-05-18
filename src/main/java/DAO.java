import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class DAO {
    private final Connection conn;

    public DAO() throws ClassNotFoundException, SQLException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String dbUrl = "jdbc:sqlserver://aps2.database.windows.net:1433;database=aps;user=adminaps@aps2;password=Kootra300;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;";
        conn = DriverManager.getConnection(dbUrl);
    }

    public List<Rio> get() {
        int[] ids = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24};
        List<Rio> rios = new ArrayList<>();
        try (PreparedStatement statement = conn.prepareStatement("SELECT * FROM RIOS WHERE Id=?")) {
            for (int i = 0; i <= ids.length - 1; i++) {
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
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rios;
    }

    public List<Consequencia> getConsequencia() {
        List<Consequencia> consequencias = new ArrayList<>();
        try (PreparedStatement ps = conn.prepareStatement("SELECT * FROM CONSEQUENCIAS")) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                consequencias.add(new Consequencia(rs.getInt("Id"),
                        rs.getString("Titulo"),
                        rs.getString("Texto")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return consequencias;
    }

    public void inserirUsuario(String nome, String email, String senha) {
        try (PreparedStatement ps = conn.prepareStatement("INSERT INTO USUARIOS VALUES(?, ?, ?)")) {
            ps.setString(1, nome);
            ps.setString(2, email);
            ps.setString(3, senha);
            int sla = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<String> getEmail() {
        List<String> usuarios = new ArrayList<>();
        try (PreparedStatement ps = conn.prepareStatement("SELECT Email FROM USUARIOS")) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                usuarios.add(rs.getString("Email"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return usuarios;
    }

    public boolean isUsuario(String email, String senha) {
        boolean bool = false;
        List<Usuario> usuarios = new ArrayList<>();
        try (PreparedStatement ps = conn.prepareStatement("SELECT * FROM USUARIOS")) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                usuarios.add(new Usuario(rs.getString("Nome"),
                        rs.getString("Email"),
                        rs.getString("Senha")));
            }
            for (Usuario u : usuarios) {
                if (email.equals(u.getEmail()) && senha.equals(u.getSenha())) {
                    bool = true;
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bool;
    }
}
