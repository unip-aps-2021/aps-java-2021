import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class Pagina2Controller {
    private final XYChart.Series series1 = new XYChart.Series();

    @FXML
    private JFXButton sairButton;

    @FXML
    private BarChart chart;

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

        chart.getData().addAll(series1);
    }

    public void sair(ActionEvent event) {
        Stage stage = (Stage) sairButton.getScene().getWindow();
        stage.close();
    }
//
//    @FXML
//    private void botao1(ActionEvent event) {
//        addChart(series1, "Samy", 400);
//    }
//
//    @FXML
//    private void botao2(ActionEvent event) {
//        changeChartByIndex(series1, 0, 300);
//    }

    private void changeChartByIndex(XYChart.Series series, int index, int valor) {
        XYChart.Data data = (XYChart.Data) series.getData().get(index);
        data.setYValue(valor);
    }

    private void addChart(XYChart.Series series, String nome, int valor) {
        series.getData().add(new XYChart.Data(nome, valor));
    }
}
