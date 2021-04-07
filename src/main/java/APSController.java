import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class APSController {
    private final XYChart.Series series1 = new XYChart.Series();

    private double xOffset;
    private double yOffset;

    @FXML
    private Label riosLabel;

    @FXML
    private JFXButton exitButton;

    @FXML
    private MenuButton menuButton;

    @FXML
    private VBox vbox;

    @FXML
    public void initialize() {
    }

//
//    @FXML
//    public void initialize() {
//        new CategoryAxis().setLabel("Mike");
//        new NumberAxis().setLabel("Ueee");
//        series1.setName("Unip");
//        addChart(series1, "Tio ete", 350);
//        addChart(series1, "Pinheiros", 300);
//        addChart(series1, "Tamanduatei", 250);
//        addChart(series1, "Piracicaba", 150);
//        addChart(series1, "Anhangabau", 100);
//
//        tabela.getData().addAll(series1);
//    }

//    @FXML
//    private void botao1(ActionEvent event) {
//        addChart(series1, "Samy", 400);
//    }
//
//    @FXML
//    private void botao2(ActionEvent event) {
//        changeChartByIndex(series1, 0, 300);
//    }

    public void pagina2() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("pagina2.fxml"));
        Stage stage = new Stage();
        stage.initStyle(StageStyle.UNDECORATED);
        root.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                xOffset = event.getSceneX();
                yOffset = event.getSceneY();
            }
        });

        root.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                stage.setX(event.getScreenX() - xOffset);
                stage.setY(event.getScreenY() - yOffset);
            }
        });
        stage.setScene(new Scene(root, 650, 650));
        stage.show();
    }

    public void sout(Event event) {
        System.out.println("...");
    }

    public void exit(ActionEvent event) {
        Stage stage = (Stage) exitButton.getScene().getWindow();
        stage.close();
    }

    public void desativa() {
        vbox.setDisable(true);
    }


//    private void changeChartByIndex(XYChart.Series series, int index, int valor){
//        XYChart.Data data = (XYChart.Data) series.getData().get(index);
//        data.setYValue(valor);
//    }
//
//    private void addChart(XYChart.Series series, String nome, int valor){
//        series.getData().add(new XYChart.Data(nome, valor));
//    }

}
