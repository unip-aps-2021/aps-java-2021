import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Border;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class MainController {
    @FXML
    private Button button;

    @FXML
    private Label label;

    @FXML
    private Button exitButton;


    public void buttonClick(){
        String javaVersion = System.getProperty("java.version");
        String javafxVersion = System.getProperty("javafx.version");
        System.out.println("Button click");
        label.setText("Hello carai, Java " + javaVersion + " e JavaFX " + javafxVersion);
    }

    public void exit(){
        Stage stage = (Stage) exitButton.getScene().getWindow();
        stage.close();

    }
}
