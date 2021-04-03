import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class APSController {
    private final XYChart.Series series1 = new XYChart.Series();

    @FXML
    private Label riosLabel;

    @FXML
    private Button aba1;

    @FXML
    private Button aba2;

    @FXML
    private Button aba3;

    @FXML
    private Button aba4;

    @FXML
    private BarChart tabela;

    @FXML
    private Button exitButton;

    @FXML
    public void initialize() {
        new CategoryAxis().setLabel("Mike");
        new NumberAxis().setLabel("Ueee");
        series1.setName("Unip");
        addChart(series1, "Tio ete", 350);
        addChart(series1, "Pinheiros", 300);
        addChart(series1, "Tamanduatei", 250);
        addChart(series1, "Piracicaba", 150);
        addChart(series1, "Anhangabau", 100);


        tabela.getData().addAll(series1);
    }

    @FXML
    private void botao1(ActionEvent event) {
        addChart(series1, "Samy", 400);
    }

    @FXML
    private void botao2(ActionEvent event) {
        changeChartByIndex(series1, 0, 300);
    }

    public void sout(Event event) {
        System.out.println("AAAAAAAAAAAAAAAAAAAAALLLLLLLLLLLLLLLLLLLLLLLOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO");;
    }

    public void exit(ActionEvent event) {
        Stage stage = (Stage) exitButton.getScene().getWindow();
        stage.close();
    }


    private void changeChartByIndex(XYChart.Series series, int index, int valor){
        XYChart.Data data = (XYChart.Data) series.getData().get(index);
        data.setYValue(valor);
    }

    private void addChart(XYChart.Series series, String nome, int valor){
        series.getData().add(new XYChart.Data(nome, valor));
    }

}
