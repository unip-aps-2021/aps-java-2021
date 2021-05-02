import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

import java.sql.SQLException;
import java.util.*;

public class Pagina3Controller {
    HashMap<String, String> hashTexto = new HashMap<>();
    HashMap<String, String> hashTitulo = new HashMap<>();
    int atual = 1;
    @FXML
    private JFXButton segundoBotaoMudar;
    @FXML
    private Text textoTextFlow;
    @FXML
    private Text textoHeader;

    public void initialize() throws SQLException, ClassNotFoundException {
        List<Consequencia> consequencias = new DAO().getConsequencia();
        int interval = 1000;
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                if (atual == 1) {
                    textoHeader.setText(consequencias.get(0).getTitulo());
                    textoTextFlow.setText(consequencias.get(0).getTexto());
                }
                if (atual == 2) {
                    textoHeader.setText(consequencias.get(1).getTitulo());
                    textoTextFlow.setText(consequencias.get(1).getTexto());
                }
                if (atual == 3) {
                    textoHeader.setText(consequencias.get(2).getTitulo());
                    textoTextFlow.setText(consequencias.get(2).getTexto());
                }
            }
        }, 0, interval);
    }


    public void setSegundoBotaoMudar(ActionEvent e) {
        if(atual == 3){
            atual = 1;
        }else{
            atual++;
        }
    }

    public void rotacao() {
        hashTexto.put("1", "texto1");
        hashTexto.put("2", "texto2");
        hashTexto.put("3", "texto3");
        hashTitulo.put("1", "titulo1");
        hashTitulo.put("2", "titulo2");
        hashTitulo.put("3", "titulo3");
    }
}
