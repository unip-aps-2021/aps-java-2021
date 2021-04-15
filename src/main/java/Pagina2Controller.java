import com.jfoenix.controls.JFXTextArea;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;


public class Pagina2Controller {
    private final XYChart.Series series1 = new XYChart.Series();
    private final XYChart.Series series2 = new XYChart.Series();


    @FXML
    private TabPane tabPanePag2;
    @FXML
    private Tab tabPag1;
    @FXML
    private APSController apsController;
    @FXML
    private NumberAxis yAxis;


    @FXML
    private Button aba1;
    @FXML
    private Button aba2;
    @FXML
    private Button aba3;
    @FXML
    private Button aba4;
    @FXML
    private BarChart chart;
    @FXML
    private JFXTextArea textoMapa;
    @FXML
    private JFXTextArea textoEsgoto;
    @FXML
    private JFXTextArea textoCabeludo;

    //classes -> Rio(nome, longitude, descrição, etc)
//Criar novo Rio, Testando OOP
//Usuário de entrada
    @FXML
    public void initialize() {
        yAxis.setAnimated(false);
        new CategoryAxis().setLabel("Mike");
        new NumberAxis().setLabel("Ueee");
        series1.setName("Unip");
        Rio tiete = new Rio("Tietê", 1000, 500, "Horrível");
        Rio pinheiros = new Rio("Pinheiros", 4000, 2800, "Pior que a anterior");
        Rio tamanduatei = new Rio("Tamanduatei", 5000, 3600, "Ruim pra krl");
        Rio piracicaba = new Rio("Piracicaba", 3000, 2300, "Horrível");
        Rio anhagabau = new Rio("Anhagabau", 7000, 4000, "Um lixo");
        Rio paraibadosul = new Rio("Guarapiranga", 4500, 3600, "Uma bosta");
        tiete.setPrimeiraCuriosidade("O Rio Tietê possuí 1.150km de extensão.");
        tiete.setSegundaCuriosidade("1.100km de sua extensão é poluída e tóxica para peixes.");
        tiete.setTerceiraCuriosidade("Em Mogi das Cruzes ele recebe cerca de 60 toneladas de esgoto por dia.");
        pinheiros.setPrimeiraCuriosidade("O Rio Pinheiros possuí 25km de extensão.");
        pinheiros.setSegundaCuriosidade("20km de sua extensão é poluída e tóxica para peixes.");
        pinheiros.setTerceiraCuriosidade("O Rio Pinheiros nasce do encontro do Rio Guarapiranga com o Rio Grande.");
        tamanduatei.setPrimeiraCuriosidade("O Rio Tamanduatei possuí 35km de extensão.");
        tamanduatei.setSegundaCuriosidade("28km de sua extensão é poluída e tóxica para peixes.");
        tamanduatei.setTerceiraCuriosidade("Antigamente o rio era usado para lavagem de roupas, banho e outras atividades.");
        piracicaba.setPrimeiraCuriosidade("O Rio Piracicaba possuí 115km de extensão.");
        piracicaba.setSegundaCuriosidade("105km de sua extensão é poluída e tóxica para peixes.");
        piracicaba.setTerceiraCuriosidade("Suas Quedas d'água bloqueiam a migração dos peixes.");
        anhagabau.setPrimeiraCuriosidade("O Rio Anhagabaú possuí 137km de extensão.");
        anhagabau.setSegundaCuriosidade("127km de sua extensão é poluída e tóxica para peixes.");
        anhagabau.setTerceiraCuriosidade("A atual Praça da Bandeira, era, tradicionalmente, um grande charco.");
        paraibadosul.setPrimeiraCuriosidade("O Rio Paraíba do Sul possuí 1.137km de extensão.");
        paraibadosul.setSegundaCuriosidade("1.100km de extensão é poluída e tóxica para peixes.");
        paraibadosul.setTerceiraCuriosidade("É o rio mais importante do estado do Rio de Janeiro");
        addChart(series1, "Tio ete", (int) tiete.getPorcentagemPoluicao());
        addChart(series1, "Pinheiros", (int) pinheiros.getPorcentagemPoluicao());
        addChart(series1, "Tamanduatei", (int) tamanduatei.getPorcentagemPoluicao());
        addChart(series1, "Piracicaba", (int) piracicaba.getPorcentagemPoluicao());
        addChart(series1, "Anhangabau", (int) anhagabau.getPorcentagemPoluicao());
        addChart(series1, "Guarapiranga", (int) paraibadosul.getPorcentagemPoluicao());
        rotate(tiete, pinheiros, tamanduatei, piracicaba, anhagabau, paraibadosul);
        chart.getData().addAll(series1);
    }


    @FXML
    private void setAba1(ActionEvent event) {
        try {
            if (chart.getData() != null) {
                chart.getData().removeAll(series2);
                chart.getData().addAll(series1);
            }
        } catch (IllegalArgumentException | NullPointerException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void setAba2(ActionEvent event) {
        Rio aricanduva = new Rio("Aricanduva", 1000, 500, "Horrível");
        Rio kurupira = new Rio("Kurupira", 4000, 2800, "Pior que a anterior");
        Rio jacare = new Rio("Jacare", 5000, 3600, "Ruim pra krl");
        Rio peixe = new Rio("Peixe", 3000, 2300, "Horrível");
        Rio gato = new Rio("Gato", 7000, 4000, "Um lixo");
        addChart(series2, aricanduva.getNome(), (int) aricanduva.getPorcentagemPoluicao());
        addChart(series2, kurupira.getNome(), (int) kurupira.getPorcentagemPoluicao());
        addChart(series2, jacare.getNome(), (int) jacare.getPorcentagemPoluicao());
        addChart(series2, peixe.getNome(), (int) peixe.getPorcentagemPoluicao());
        addChart(series2, gato.getNome(), (int) gato.getPorcentagemPoluicao());


        try {
            chart.getData().removeAll(series1);
            chart.getData().addAll(series2);
        } catch (IllegalArgumentException | NullPointerException e) {
            e.addSuppressed(e);
        }
    }

    private void changeChartY(XYChart.Series series, int index, int valor) {
        XYChart.Data data = (XYChart.Data) series.getData().get(index);
        data.setYValue(valor);
    }

    private void changeChartX(XYChart.Series series, int index, String valor) {
        XYChart.Data data = (XYChart.Data) series.getData().get(index);
        data.setXValue(valor);
    }

    private void addChart(XYChart.Series series, String nome, int valor) {
        series.getData().add(new XYChart.Data(nome, valor));
    }


    private void rotate(Rio primeiro,
                            Rio segundo,
                            Rio terceiro,
                            Rio quarto,
                            Rio quinto,
                            Rio sexto) {
        int delay = 10000;
        int interval = 5000;
        Timer timer = new Timer();
        List<String> listaTextos = new ArrayList<>(10);
        listaTextos.add(primeiro.getPrimeiraCuriosidade() + "\n" + primeiro.getSegundaCuriosidade() + "\n" + primeiro.getTerceiraCuriosidade());
        listaTextos.add(segundo.getPrimeiraCuriosidade() + "\n" + segundo.getSegundaCuriosidade() + "\n" + segundo.getTerceiraCuriosidade());
        listaTextos.add(terceiro.getPrimeiraCuriosidade() + "\n" + terceiro.getSegundaCuriosidade() + "\n" + terceiro.getTerceiraCuriosidade());
        listaTextos.add(quarto.getPrimeiraCuriosidade() + "\n" + quarto.getSegundaCuriosidade() + "\n" + quarto.getTerceiraCuriosidade());
        listaTextos.add(quinto.getPrimeiraCuriosidade() + "\n" + quinto.getSegundaCuriosidade() + "\n" + quinto.getTerceiraCuriosidade());
        listaTextos.add(sexto.getPrimeiraCuriosidade() + "\n" + sexto.getSegundaCuriosidade() + "\n" + sexto.getTerceiraCuriosidade());


        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                Random random = new Random();
                int num1 = ThreadLocalRandom.current().nextInt(0, 1 + 1);
                int num2 = ThreadLocalRandom.current().nextInt(2, 3 + 1);
                int num3 = ThreadLocalRandom.current().nextInt(4, 5 + 1);
                textoMapa.setText(listaTextos.get(num1));
                textoEsgoto.setText(listaTextos.get(num2));
                textoCabeludo.setText(listaTextos.get(num3));
            }
        }, delay, interval);

    }
}
