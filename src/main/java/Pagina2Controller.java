import com.jfoenix.controls.JFXTextArea;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;

import java.nio.charset.StandardCharsets;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ThreadLocalRandom;

@SuppressWarnings("unused")
public class Pagina2Controller {
    private final XYChart.Series<String, Integer> series1 = new XYChart.Series<>();
    private final XYChart.Series<String, Integer> series2 = new XYChart.Series<>();
    private final XYChart.Series<String, Integer> series3 = new XYChart.Series<>();
    private final XYChart.Series<String, Integer> series4 = new XYChart.Series<>();

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
    private BarChart<String, Integer> chart;
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
    public void initialize() throws SQLException, ClassNotFoundException {
        int interval = 20;
        double start = aba1.getTranslateX();
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                sliderAnimation(aba1, start);
                sliderAnimation(aba2, start);
                sliderAnimation(aba3, start);
                sliderAnimation(aba4, start);
            }
        }, 0, interval);

        labelGrafico.setText(new String("Mais poluídos do Brasil: ".getBytes(), StandardCharsets.UTF_8));
        yAxis.setAnimated(false);
        chart.setLegendVisible(false);
        Rio tiete = InstanciasRios.TIETE.get();
        Rio pinheiros = InstanciasRios.PINHEIROS.get();
        Rio tamanduatei = InstanciasRios.TAMANDUATEI.get();
        Rio piracicaba = InstanciasRios.PIRACICABA.get();
        Rio anhangabau = InstanciasRios.ANHANGABAU.get();
        Rio paraibadosul = InstanciasRios.PARAIBADOSUL.get();
        addChart(series1, tiete.getNome(), (int) tiete.getPorcentagemPoluicao());
        addChart(series1, pinheiros.getNome(), (int) pinheiros.getPorcentagemPoluicao());
        addChart(series1, tamanduatei.getNome(), (int) tamanduatei.getPorcentagemPoluicao());
        addChart(series1, piracicaba.getNome(), (int) piracicaba.getPorcentagemPoluicao());
        addChart(series1, anhangabau.getNome(), (int) anhangabau.getPorcentagemPoluicao());
        addChart(series1, paraibadosul.getNome(), (int) paraibadosul.getPorcentagemPoluicao());
        rotate(tiete, pinheiros, tamanduatei, piracicaba, anhangabau, paraibadosul);
        chart.getData().add(series1);
    }

    @FXML
    private void setAba1(ActionEvent event) {
        labelGrafico.setText(new String("Mais poluídos do Brasil: ".getBytes(), StandardCharsets.UTF_8));
        if (chart.getData() == null) {
            return;
        }

        chart.getData().remove(series2);
        chart.getData().remove(series3);
        chart.getData().remove(series4);

        if (!chart.getData().contains(series1)) {
            chart.getData().add(series1);
        }
    }

    @FXML
    private void setAba2(ActionEvent event) {
        labelGrafico.setText(new String("Mais poluídos de São Paulo: ".getBytes(), StandardCharsets.UTF_8));
        Rio aricanduva = InstanciasRios.ARICANDUVA.get();
        Rio kurupira = InstanciasRios.KURUPIRA.get();
        Rio jacare = InstanciasRios.JACARE.get();
        Rio peixe = InstanciasRios.PEIXE.get();
        Rio gato = InstanciasRios.GATO.get();
        Rio myu = InstanciasRios.MYU.get();
        addChart(series2, aricanduva.getNome(), (int) aricanduva.getPorcentagemPoluicao());
        addChart(series2, kurupira.getNome(), (int) kurupira.getPorcentagemPoluicao());
        addChart(series2, jacare.getNome(), (int) jacare.getPorcentagemPoluicao());
        addChart(series2, peixe.getNome(), (int) peixe.getPorcentagemPoluicao());
        addChart(series2, gato.getNome(), (int) gato.getPorcentagemPoluicao());
        addChart(series2, myu.getNome(), (int) myu.getPorcentagemPoluicao());
        rotate(aricanduva, kurupira, jacare, peixe, gato, myu);
        if (chart.getData() == null) {
            return;
        }
        chart.getData().remove(series1);
        chart.getData().remove(series3);
        chart.getData().remove(series4);
        if (!chart.getData().contains(series2)) {
            chart.getData().add(series2);
        }
    }

    @FXML
    private void setAba3(ActionEvent event) {
        labelGrafico.setText(new String("Menos poluídos do Brasil: ".getBytes(), StandardCharsets.UTF_8));
        Rio pirapata = InstanciasRios.PIRAPATA.get();
        Rio camboio = InstanciasRios.CAMBOIO.get();
        Rio leopardocaruru = InstanciasRios.LEOPARDOCARURU.get();
        Rio beauty = InstanciasRios.BEAUTY.get();
        Rio patacamelo = InstanciasRios.PATACAMELO.get();
        Rio pedrinhas = InstanciasRios.PEDRINHAS.get();
        addChart(series3, pirapata.getNome(), (int) pirapata.getPorcentagemPoluicao());
        addChart(series3, camboio.getNome(), (int) camboio.getPorcentagemPoluicao());
        addChart(series3, leopardocaruru.getNome(), (int) leopardocaruru.getPorcentagemPoluicao());
        addChart(series3, beauty.getNome(), (int) beauty.getPorcentagemPoluicao());
        addChart(series3, patacamelo.getNome(), (int) patacamelo.getPorcentagemPoluicao());
        addChart(series3, pedrinhas.getNome(), (int) pedrinhas.getPorcentagemPoluicao());

        if (chart.getData() == null) {
            return;
        }
        chart.getData().remove(series1);
        chart.getData().remove(series2);
        chart.getData().remove(series4);
        if (!chart.getData().contains(series3)) {
            chart.getData().add(series3);
        }
    }

    @FXML
    private void setAba4(ActionEvent event) {
        labelGrafico.setText(new String("Menos poluídos de São Paulo: ".getBytes(), StandardCharsets.UTF_8));
        Rio pinapora = InstanciasRios.PINAPORA.get();
        Rio ferroja = InstanciasRios.FERROJA.get();
        Rio amagua = InstanciasRios.AMAGUA.get();
        Rio cantos = InstanciasRios.CANTOS.get();
        Rio martelo = InstanciasRios.MARTELO.get();
        Rio delta = InstanciasRios.DELTA.get();
        addChart(series4, pinapora.getNome(), (int) pinapora.getPorcentagemPoluicao());
        addChart(series4, ferroja.getNome(), (int) ferroja.getPorcentagemPoluicao());
        addChart(series4, amagua.getNome(), (int) amagua.getPorcentagemPoluicao());
        addChart(series4, cantos.getNome(), (int) cantos.getPorcentagemPoluicao());
        addChart(series4, martelo.getNome(), (int) martelo.getPorcentagemPoluicao());
        addChart(series4, delta.getNome(), (int) delta.getPorcentagemPoluicao());

        if (chart.getData() == null) {
            return;
        }
        chart.getData().remove(series1);
        chart.getData().remove(series3);
        chart.getData().remove(series2);
        if (!chart.getData().contains(series4)) {
            chart.getData().add(series4);
        }
    }

    private void changeChartY(XYChart.Series<String, Integer> series, int index, int valor) {
        XYChart.Data<String, Integer> data = series.getData().get(index);
        data.setYValue(valor);
    }

    private void changeChartX(XYChart.Series<String, Integer> series, int index, String valor) {
        XYChart.Data<String, Integer> data = series.getData().get(index);
        data.setXValue(valor);
    }

    private void addChart(XYChart.Series<String, Integer> series, String nome, int valor) {
        series.getData().add(new XYChart.Data<>(nome, valor));
    }

    private void rotate(Rio primeiro,
                        Rio segundo,
                        Rio terceiro,
                        Rio quarto,
                        Rio quinto,
                        Rio sexto) {
        int delay = 500;
        int interval = 20000;
        Timer timer = new Timer();
        List<String> listaTextos = new ArrayList<>();
        listaTextos.add(primeiro.getPrimeiraCuriosidade() + "\n" + primeiro.getSegundaCuriosidade() + "\n" + primeiro.getTerceiraCuriosidade());
        listaTextos.add(segundo.getPrimeiraCuriosidade() + "\n" + segundo.getSegundaCuriosidade() + "\n" + segundo.getTerceiraCuriosidade());
        listaTextos.add(terceiro.getPrimeiraCuriosidade() + "\n" + terceiro.getSegundaCuriosidade() + "\n" + terceiro.getTerceiraCuriosidade());
        listaTextos.add(quarto.getPrimeiraCuriosidade() + "\n" + quarto.getSegundaCuriosidade() + "\n" + quarto.getTerceiraCuriosidade());
        listaTextos.add(quinto.getPrimeiraCuriosidade() + "\n" + quinto.getSegundaCuriosidade() + "\n" + quinto.getTerceiraCuriosidade());
        listaTextos.add(sexto.getPrimeiraCuriosidade() + "\n" + sexto.getSegundaCuriosidade() + "\n" + sexto.getTerceiraCuriosidade());

        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                int num1 = ThreadLocalRandom.current().nextInt(0, 2);
                int num2 = ThreadLocalRandom.current().nextInt(2, 4);
                int num3 = ThreadLocalRandom.current().nextInt(4, 6);
                textoMapa.setText(listaTextos.get(num1));
                textoEsgoto.setText(listaTextos.get(num2));
                textoCabeludo.setText(listaTextos.get(num3));
            }
        }, delay, interval);
    }

    public void sliderAnimation(Button btn, double start) {
        if (btn.isHover()) {
            if (btn.getTranslateX() >= start - 20) {
                btn.setTranslateX(btn.getTranslateX() - 4);

            }
        } else {
            if (btn.getTranslateX() < start) {
                btn.setTranslateX(btn.getTranslateX() + 4);
            }
        }
    }
}