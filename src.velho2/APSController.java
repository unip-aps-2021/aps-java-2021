import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

public class APSController implements Initializable {
    
    @FXML
    private Label riosLabel;
    
    @FXML
    private BarChart tabela;
    
    @FXML
    private void botao1(ActionEvent event){
        riosLabel.setText("Aloo");
    }
    
    @FXML
    private void botao2(ActionEvent event) {
        riosLabel.setText("Rios de SP");

        CategoryAxis xAxis = new CategoryAxis();
        NumberAxis yAxis = new NumberAxis();

        xAxis.setLabel("Mike");
        yAxis.setLabel("Ueee");

        XYChart.Series series1 = new XYChart.Series();
        series1.setName("Unip");
        series1.getData().add(new XYChart.Data("Maaico", 125));
        series1.getData().add(new XYChart.Data("Flavin", 180));

        tabela.getData().addAll(series1);
    }
}
