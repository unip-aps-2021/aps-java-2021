import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class Pagina3Controller {
    @FXML
    private JFXButton primeiroBotaoMudar;
    @FXML
    private JFXButton segundoBotaoMudar;
    @FXML
    private Text textoTextFlow;
    @FXML
    private Text textoHeader;

    public void setSegundoBotaoMudar(ActionEvent e){
        textoHeader.setText("SADDKADSKDASDKASKDK ASKK CARALHO");
        textoTextFlow.setText("ablébléblébléblébléblébléblébléblébléblébléblébléblébléblébléblébléblébléblébléblébléblé" +
                "bléblébléblébléblébléblébléblébléblébléblébléblébléblébléblébléblébléblébléblébléblébléblébléblébléblé");
    }

    public void setPrimeiroBotaoMudar(ActionEvent e){
        textoHeader.setText("KDSKOFOADSKLDAKLSKL a");
        textoTextFlow.setText("abluébluébluébluébluébluébluébluébluébluébluébluébluébluébluébluébluébluébluébluébluéblué" +
                "bluébluébluébluébluébluébluébluébluébluébluébluébluébluébluébluébluébluébluébluébluébluébluébluébluéblué" +
                "bluébluébluébluébluébluébluébluébluébluébluébluébluébluébluébluébluébluébluébluébluébluébluébluéblué");
    }
}
