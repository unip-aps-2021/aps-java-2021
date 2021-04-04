import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.text.TextAlignment;

public class TesteController {

    @FXML
    private Label a;

    @FXML
    public void initialize(){
        a.setTextAlignment(TextAlignment.JUSTIFY);
    }
}
