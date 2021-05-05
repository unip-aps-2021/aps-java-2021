import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {

    @FXML private JFXButton login;

    @FXML private JFXButton cadastro;


    @FXML
    private void setLogin(ActionEvent event) throws IOException {
        Stage stageAntes = (Stage) login.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("aps.fxml"));
        Parent root1 = fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));
        stageAntes.close();
        stage.show();
    }

    @FXML
    private void setCadastro(ActionEvent event) throws IOException {
        Stage stageAntes = (Stage) cadastro.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("cadastro.fxml"));
        Parent root = fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stageAntes.close();
        stage.show();
    }
}
