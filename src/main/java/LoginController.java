import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.util.Collections;

public class LoginController {

    @FXML private JFXButton login;

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
}
