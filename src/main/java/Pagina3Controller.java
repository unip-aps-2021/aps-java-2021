import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

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

    public void initialize() {
        int interval = 1000;
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                if (atual == 1) {
                    textoHeader.setText("Principais consequências atmosféricas");
                    textoTextFlow.setText("A poluição da água vem, principalmente, do  descarte inadequado de lixo. Todo esse lixo, seja o plástico, produtos químicos, materiais domésticos como sofá, cadeiras, eletrodomésticos, entre outros são produzidos em fábricas que, em muitas delas, há a produção de CO2 e outros gases poluentes que afetam a camada de ozônio. \n" +
                            "Com o crescente nível de gases poluentes e CO2 na atmosfera, o aquecimento global afeta cada vez mais as condições no planeta. Temos um aumento exponencial de tempuratura que causa o derretimento de geleiras, aumentando o nível da água do mar, e em continentes como a Antártida, tem feito os ursos polares perderem seus pelos. Além disso, um estudo publicado pela revista Nature Climate Change diz que os ursos polares podem entrar em extinção até o ano de 2100.\n" +
                            "O aquecimento global ainda pode causar o aumento do risco de alergias, asma, doenças pulmonares e câncer nos seres humanos.\n");
                }
                if (atual == 2) {
                    textoHeader.setText("Principais consequências terrestres");
                    textoTextFlow.setText("Com o descarte de lixo inadequado nas ruas, o destino final desses materiais e produtos químicos são os rios e bueiros das cidades. Em épocas de muita chuva, o acúmulo desse lixo causa enchentes, que podem chegar aos níveis das casas da população. Com o grande nível de água nos bueiros, os parasitas como ratos e baratas sobem para a superfície e podem se acomodar nas casas da cidade. Com eles, carregam diversas doenças contagiosas e perigosas para os seres humanos, dentre elas leptospirose, peste bubônica, tifo murinho, febre de mordida de rato, raiva, sarnas, triquinose, salmonelose, micoses, hantavirose, entre outras. Moradores de rua, por sua vez, tem muito mais chances de contrair essas doenças pela falta de higienização básica e fácil contato com estes parasitas.\n" +
                            "Pessoas que moram perto de rios poluídos ainda enfrentam o mau cheiro e a presença de lixo em suas calcaças e ruas.");
                }
                if (atual == 3) {
                    textoHeader.setText("Principais consequências marítimas");
                    textoTextFlow.setText("Muitos rios que fazem conexão com o oceano transportam todo seu lixo para o mar, o que causa cerca de 100 mil mortes de animais marinhos por ano.\n" +
                            "\n" +
                            "Esses animais, ao confundirem o lixo e principalmente o plástico com comida, ingerem esses produtos e acabam morrendo. Se não o ingerem, os plásticos espalhados no oceano podem se prender em alguma parte de seu corpo, o que pode acabar prendendo esses animais em algum local ou impossibilitando que esses se alimentem. Além disso, muitos sofrem com os ferimentos causados pelo plástico e outros materiais presos em algum local do corpo, que em muitas vezes, permanecem até o dia da morte das vítimas.");
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
