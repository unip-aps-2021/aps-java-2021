import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

import java.sql.SQLException;

public class CadastroController {

    @FXML
    private JFXTextField nome;

    @FXML
    private JFXTextField email;

    @FXML
    private JFXTextField senha;

    @FXML
    private JFXTextField confirmarSenha;

    @FXML
    private Label labelErro;

    public void initialize() {

    }

    @FXML
    public void btnCadastro() throws SQLException, ClassNotFoundException {
        if (!confirmarSenha.getText().isEmpty()) {
            DAO dao = new DAO();
            dao.inserirUsuario(nome.getText(), email.getText(), senha.getText());
            CharSequence proibido = "()/\\,.;:";
            if (nome.getText().contains(proibido) ||
                    email.getText().contains(proibido) ||
                    senha.getText().contains(proibido)) {
                labelErro.setText("Caractere inválido, digite novamente");
                nome.setUnFocusColor(Paint.valueOf(String.valueOf(Color.RED)));
                email.setUnFocusColor(Paint.valueOf(String.valueOf(Color.RED)));
                senha.setUnFocusColor(Paint.valueOf(String.valueOf(Color.RED)));
                confirmarSenha.setUnFocusColor(Paint.valueOf(String.valueOf(Color.RED)));
            }
        }
    }
//
//    private static void showAlert(Alert.AlertType alertType, Window owner, String title, String message) {
//        Alert alert = new Alert(alertType);
//        alert.setTitle(title);
//        alert.setHeaderText(null);
//        alert.setContentText(message);
//        alert.initOwner(owner);
//        alert.show();
}

