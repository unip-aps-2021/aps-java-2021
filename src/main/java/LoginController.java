import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.sql.SQLException;

public class LoginController {

    @FXML private JFXButton login;

    @FXML private JFXButton cadastro;

    @FXML private Label labelErro;

    @FXML private JFXTextField emailTxt;

    @FXML private JFXPasswordField senhaTxt;

    @FXML
    private void setLogin(ActionEvent event) throws IOException, SQLException, ClassNotFoundException {
        if(new DAO().isUsuario(emailTxt.getText(), senhaTxt.getText())){
            Stage stageAntes = (Stage) login.getScene().getWindow();
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("aps.fxml"));
            Parent root1 = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Tech Rivers LTDA");
            stage.getIcons().add(new Image("/ImageResources/logo.png"));
            stage.setScene(new Scene(root1));
            stageAntes.close();
            stage.show();
        } else {
            labelErro.setText(new String("Login Inválido".getBytes(), StandardCharsets.UTF_8));
        }
    }

    @FXML
    private void setCadastro(ActionEvent event) throws IOException {
        Stage stageAntes = (Stage) cadastro.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("cadastro.fxml"));
        Parent root = fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("Tech Rivers LTDA");
        stage.getIcons().add(new Image("/ImageResources/logo.png"));
        stage.setScene(new Scene(root));
        stageAntes.close();
        stage.show();
    }
}
