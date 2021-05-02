import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Paint;
import javafx.stage.Window;

import java.awt.*;

public class CadastroController {

    @FXML private JFXTextField textFieldNome;

    public void initialize(){
        textFieldNome.setUnFocusColor(Paint.valueOf(String.valueOf(Color.RED)));
        CharSequence proibido = "()/\\,.;:";
        if(textFieldNome.getText().contains(proibido)){
//            textFieldNome.setUnFocusColor(Paint.valueOf(String.valueOf(Color.RED)));
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
//    }
}
