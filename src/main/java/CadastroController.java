import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.sql.SQLException;
import java.util.List;

public class CadastroController {

    @FXML
    private JFXTextField nome;

    @FXML
    private JFXTextField email;

    @FXML
    private JFXPasswordField senha;

    @FXML
    private JFXPasswordField confirmarSenha;

    @FXML
    private Label labelErro;

    public void initialize() {

    }

    @FXML
    public void btnCadastro() throws SQLException, ClassNotFoundException, IOException {
        if (!confirmarSenha.getText().isEmpty()) {
            DAO dao = new DAO();
            List<String> usuarios = dao.getEmail();
            for (String u : usuarios) {
                if (u.contains(email.getText())) {
                    labelErro.setText(new String("Email já cadastrado!".getBytes(), StandardCharsets.UTF_8));
                    return;
                }
                labelErro.setText("Cadastrado com sucesso");
            }
            if(labelErro.getText().equals("Cadastrado com sucesso")){
                voltaLogin();
            }
            dao.inserirUsuario(nome.getText(), email.getText(), senha.getText());
        }
    }

    public void voltaLogin() throws IOException, SQLException, ClassNotFoundException {
        Stage stageAntes = (Stage) labelErro.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("login.fxml"));
        Parent root1 = fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));
        stageAntes.close();
        stage.show();
    }
}

