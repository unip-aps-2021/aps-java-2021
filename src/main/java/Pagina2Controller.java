import com.jfoenix.controls.JFXTextArea;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;

import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;


public class Pagina2Controller {
    private final XYChart.Series series1 = new XYChart.Series();
    private final XYChart.Series series2 = new XYChart.Series();
    private final XYChart.Series series3 = new XYChart.Series();
    private final XYChart.Series series4 = new XYChart.Series();
    private Rio tiete = new Rio("Tietê", 1000, 500, "Horrível");
    private Rio pinheiros = new Rio("Pinheiros", 4000, 2800, "Pior que a anterior");
    private Rio tamanduatei = new Rio("Tamanduatei", 5000, 3600, "Ruim pra krl");
    private Rio piracicaba = new Rio("Piracicaba", 3000, 2300, "Horrível");
    private Rio anhagabau = new Rio("Anhagabau", 7000, 4000, "Um lixo");
    private Rio paraibadosul = new Rio("Guarapiranga", 4500, 3600, "Uma bosta");
    private Rio aricanduva = new Rio("Aricanduva", 28, 20, "Horrível");
    private Rio kurupira = new Rio("Kurupira", 45, 35, "Pior que a anterior");
    private Rio jacare = new Rio("Jacare", 60, 35, "Ruim pra krl");
    private Rio peixe = new Rio("Peixe", 90, 45, "Horrível");
    private Rio gato = new Rio("Gato", 50, 37, "Um lixo");
    private Rio myu = new Rio("Myu", 120, 95, "Fedido");
    private Rio pirapata = new Rio("Pirapata", 500, 100, "Boa");
    private Rio camboio = new Rio("Camboio", 350, 50, "Boa");
    private Rio leopardocaruru = new Rio("Leopardo Caruru", 600, 150, "Boa");
    private Rio beauty = new Rio("Beauty", 800, 120, "Boa");
    private Rio patacamelo = new Rio("Patacamelo", 100, 40, "Boa");
    private Rio pedrinhas = new Rio("Pedrinhas", 230, 60, "Boa");
    private Rio pinapora = new Rio("Pinapora", 200, 20, "Horrível");
    private Rio Ferroja = new Rio("Ferroja", 500, 100, "Horrível");
    private Rio Amagua = new Rio("Amaguá", 250, 60, "Horrível");
    private Rio cantos = new Rio("Cantos", 600, 100, "Horrível");
    private Rio martelo = new Rio("Martelo", 100, 30, "Horrível");
    private Rio delta = new Rio("Delta", 75, 10, "Horrível");

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
    @FXML
    private Label labelGrafico;

//classes -> Rio(nome, longitude, descrição, etc)
//Criar novo Rio, Testando OOP
//Usuário de entrada
    @FXML
    public void initialize() {
        labelGrafico.setText(new String("Mais poluídos do Brasil: ".getBytes(), StandardCharsets.UTF_8));
        yAxis.setAnimated(false);
        new CategoryAxis().setLabel("Mike");
        new NumberAxis().setLabel("Ueee");
        series1.setName("Unip");
        tiete.setPrimeiraCuriosidade("O Rio Tietê possuí 1.150km de extensão.");
        tiete.setSegundaCuriosidade("1.100km de sua extensão é poluída e tóxica para os seres vivos.");
        tiete.setTerceiraCuriosidade("Em Mogi das Cruzes ele recebe cerca de 60 toneladas de esgoto por dia.");
        pinheiros.setPrimeiraCuriosidade("O Rio Pinheiros possuí 25km de extensão.");
        pinheiros.setSegundaCuriosidade("20km de sua extensão é poluída e tóxica para os seres vivos.");
        pinheiros.setTerceiraCuriosidade("O Rio Pinheiros nasce do encontro do Rio Guarapiranga com o Rio Grande.");
        tamanduatei.setPrimeiraCuriosidade("O Rio Tamanduatei possuí 35km de extensão.");
        tamanduatei.setSegundaCuriosidade("28km de sua extensão é poluída e tóxica para os seres vivos.");
        tamanduatei.setTerceiraCuriosidade("Antigamente o rio era usado para lavagem de roupas, banho e outras atividades.");
        piracicaba.setPrimeiraCuriosidade("O Rio Piracicaba possuí 115km de extensão.");
        piracicaba.setSegundaCuriosidade("105km de sua extensão é poluída e tóxica para os seres vivos.");
        piracicaba.setTerceiraCuriosidade("Suas Quedas d'água bloqueiam a migração dos peixes.");
        anhagabau.setPrimeiraCuriosidade("O Rio Anhagabaú possuí 137km de extensão.");
        anhagabau.setSegundaCuriosidade("127km de sua extensão é poluída e tóxica para os seres vivos.");
        anhagabau.setTerceiraCuriosidade("A atual Praça da Bandeira, era, tradicionalmente, um grande charco.");
        paraibadosul.setPrimeiraCuriosidade("O Rio Paraíba do Sul possuí 1.137km de extensão.");
        paraibadosul.setSegundaCuriosidade("1.100km de extensão é poluída e tóxica para os seres vivos.");
        paraibadosul.setTerceiraCuriosidade("É o rio mais importante do estado do Rio de Janeiro");
        addChart(series1, "Tio ete", (int) tiete.getPorcentagemPoluicao());
        addChart(series1, "Pinheiros", (int) pinheiros.getPorcentagemPoluicao());
        addChart(series1, "Tamanduatei", (int) tamanduatei.getPorcentagemPoluicao());
        addChart(series1, "Piracicaba", (int) piracicaba.getPorcentagemPoluicao());
        addChart(series1, "Anhangabau", (int) anhagabau.getPorcentagemPoluicao());
        addChart(series1, "Guarapiranga", (int) paraibadosul.getPorcentagemPoluicao());
        rotate(tiete, pinheiros, tamanduatei, piracicaba, anhagabau, paraibadosul);
        chart.setLegendVisible(false);
        chart.getData().addAll(series1);
    }


    @FXML
    private void setAba1(ActionEvent event) {
        try {
            if (chart.getData() != null) {
                chart.getData().removeAll(series2);
                chart.getData().removeAll(series3);
                chart.getData().removeAll(series4);
                chart.getData().addAll(series1);
            }
        } catch (IllegalArgumentException | NullPointerException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void setAba2(ActionEvent event) {
        labelGrafico.setText(new String("Mais poluídos de São Paulo: ".getBytes(), StandardCharsets.UTF_8));
        aricanduva.setPrimeiraCuriosidade("O Rio Aricanduva tem 28km de extensão.");
        aricanduva.setSegundaCuriosidade("23km da sua extensão é poluida e toxica para os seres vivos.");
        aricanduva.setTerceiraCuriosidade("Esse rio nasce poluído, pois uma de suas nascentes localiza-se no aterro sanitario Sao Joao");
        kurupira.setPrimeiraCuriosidade("O Rio Kurupira tem 45km de extensão.");
        kurupira.setSegundaCuriosidade("40km da sua extensão é poluida e toxica para os seres vivos.");
        kurupira.setTerceiraCuriosidade("A agua corre para um sentido diferente.");
        jacare.setPrimeiraCuriosidade("O Rio Jacare tem 60km de extensão.");
        jacare.setSegundaCuriosidade("56km da sua extensão é poluida e toxica para os seres vivos.");
        jacare.setTerceiraCuriosidade("No rio Jacare, os jacares que vivem lá adoecem com o lixo.");
        peixe.setPrimeiraCuriosidade("O Rio Peixe tem 90km de extensão.");
        peixe.setSegundaCuriosidade("Metade da sua extensão é poluida e toxica para os seres vivos.");
        peixe.setTerceiraCuriosidade("É o rio de São Paulo com maior variedade na fauna marinha");
        gato.setPrimeiraCuriosidade("O Rio Gato tem 50km de extensão.");
        gato.setSegundaCuriosidade("45km de sua extensão é poluida e toxica para os seres vivos.");
        gato.setTerceiraCuriosidade("Esse rio é mais afetado pelas chuvas, que levam mais poluição às suas águas.");
        myu.setPrimeiraCuriosidade("O Rio Myu tem 120km de extensão.");
        myu.setSegundaCuriosidade("95km da sua extensão é poluida e toxica para os seres vivos");
        myu.setTerceiraCuriosidade("O Rio myu é nomeado por conta dos imigrantes asiáticos que viviam nas suas redondezas");
        addChart(series2, aricanduva.getNome(), (int) aricanduva.getPorcentagemPoluicao());
        addChart(series2, kurupira.getNome(), (int) kurupira.getPorcentagemPoluicao());
        addChart(series2, jacare.getNome(), (int) jacare.getPorcentagemPoluicao());
        addChart(series2, peixe.getNome(), (int) peixe.getPorcentagemPoluicao());
        addChart(series2, gato.getNome(), (int) gato.getPorcentagemPoluicao());
        addChart(series2, myu.getNome(), (int) myu.getPorcentagemPoluicao());
        rotate(aricanduva, kurupira, jacare, peixe, gato, myu);

        try {
            chart.getData().removeAll(series1);
            chart.getData().removeAll(series3);
            chart.getData().removeAll(series4);;
            chart.getData().addAll(series2);
        } catch (IllegalArgumentException | NullPointerException e) {
            e.addSuppressed(e);
        }
    }

    @FXML
    private void setAba3(ActionEvent event){
        labelGrafico.setText(new String("Menos poluídos do Brasil: ".getBytes(), StandardCharsets.UTF_8));
        addChart(series3, "Pirapata", (int) pirapata.getPorcentagemPoluicao());
        addChart(series3, "Camboio", (int) camboio.getPorcentagemPoluicao());
        addChart(series3, "Leopardo Caruru", (int) leopardocaruru.getPorcentagemPoluicao());
        addChart(series3, "Beauty", (int) beauty.getPorcentagemPoluicao());
        addChart(series3, "Patacamelo", (int) patacamelo.getPorcentagemPoluicao());
        addChart(series3, "Pedrinhas", (int) pedrinhas.getPorcentagemPoluicao());

        try {
            chart.getData().removeAll(series1);
            chart.getData().removeAll(series2);
            chart.getData().removeAll(series4);;
            chart.getData().addAll(series3);
        } catch (IllegalArgumentException | NullPointerException e) {
            e.addSuppressed(e);
        }
    }

    @FXML
    private void setAba4(ActionEvent event){
        labelGrafico.setText(new String("Menos poluídos de São Paulo: ".getBytes(), StandardCharsets.UTF_8));
        addChart(series4, "Pinapora", (int) pinapora.getPorcentagemPoluicao());
        addChart(series4, "Ferroja", (int) Ferroja.getPorcentagemPoluicao());
        addChart(series4, "Amaguá", (int) Amagua.getPorcentagemPoluicao());
        addChart(series4, "Cantos", (int) cantos.getPorcentagemPoluicao());
        addChart(series4, "Martelo", (int) martelo.getPorcentagemPoluicao());
        addChart(series4, "Delta", (int) delta.getPorcentagemPoluicao());
        try {
            chart.getData().removeAll(series1);
            chart.getData().removeAll(series3);
            chart.getData().removeAll(series2);;
            chart.getData().addAll(series4);
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
        int delay = 1000;
        int interval = 18000;
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
//
//
//
//
//
//