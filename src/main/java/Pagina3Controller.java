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
                    textoHeader.setText("Principais consequ�ncias atmosf�ricas");
                    textoTextFlow.setText("A polui��o da �gua vem, principalmente, do  descarte inadequado de lixo. Todo esse lixo, seja o pl�stico, produtos qu�micos, materiais dom�sticos como sof�, cadeiras, eletrodom�sticos, entre outros s�o produzidos em f�bricas que, em muitas delas, h� a produ��o de CO2 e outros gases poluentes que afetam a camada de oz�nio. \n" +
                            "Com o crescente n�vel de gases poluentes e CO2 na atmosfera, o aquecimento global afeta cada vez mais as condi��es no planeta. Temos um aumento exponencial de tempuratura que causa o derretimento de geleiras, aumentando o n�vel da �gua do mar, e em continentes como a Ant�rtida, tem feito os ursos polares perderem seus pelos. Al�m disso, um estudo publicado pela revista Nature Climate Change diz que os ursos polares podem entrar em extin��o at� o ano de 2100.\n" +
                            "O aquecimento global ainda pode causar o aumento do risco de alergias, asma, doen�as pulmonares e c�ncer nos seres humanos.\n");
                }
                if (atual == 2) {
                    textoHeader.setText("Principais consequ�ncias terrestres");
                    textoTextFlow.setText("Com o descarte de lixo inadequado nas ruas, o destino final desses materiais e produtos qu�micos s�o os rios e bueiros das cidades. Em �pocas de muita chuva, o ac�mulo desse lixo causa enchentes, que podem chegar aos n�veis das casas da popula��o. Com o grande n�vel de �gua nos bueiros, os parasitas como ratos e baratas sobem para a superf�cie e podem se acomodar nas casas da cidade. Com eles, carregam diversas doen�as contagiosas e perigosas para os seres humanos, dentre elas leptospirose, peste bub�nica, tifo murinho, febre de mordida de rato, raiva, sarnas, triquinose, salmonelose, micoses, hantavirose, entre outras. Moradores de rua, por sua vez, tem muito mais chances de contrair essas doen�as pela falta de higieniza��o b�sica e f�cil contato com estes parasitas.\n" +
                            "Pessoas que moram perto de rios polu�dos ainda enfrentam o mau cheiro e a presen�a de lixo em suas calca�as e ruas.");
                }
                if (atual == 3) {
                    textoHeader.setText("Principais consequ�ncias mar�timas");
                    textoTextFlow.setText("Muitos rios que fazem conex�o com o oceano transportam todo seu lixo para o mar, o que causa cerca de 100 mil mortes de animais marinhos por ano.\n" +
                            "\n" +
                            "Esses animais, ao confundirem o lixo e principalmente o pl�stico com comida, ingerem esses produtos e acabam morrendo. Se n�o o ingerem, os pl�sticos espalhados no oceano podem se prender em alguma parte de seu corpo, o que pode acabar prendendo esses animais em algum local ou impossibilitando que esses se alimentem. Al�m disso, muitos sofrem com os ferimentos causados pelo pl�stico e outros materiais presos em algum local do corpo, que em muitas vezes, permanecem at� o dia da morte das v�timas.");
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
