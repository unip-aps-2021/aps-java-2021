import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.Stage;

public class Pagina2Controller {

    @FXML
    private JFXButton sairButton;

    public void sair(ActionEvent event) {
        Stage stage = (Stage) sairButton.getScene().getWindow();
        stage.close();
    }
}
