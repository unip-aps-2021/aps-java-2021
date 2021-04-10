import com.jfoenix.controls.JFXButton;
import javafx.beans.value.ObservableValue;
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
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class APSController {
    private final XYChart.Series series1 = new XYChart.Series();
    @FXML private Label riosLabel;
    @FXML private MenuButton menuButton;
    @FXML private VBox vbox;

    @FXML
    public void initialize() {
    }

    public void sout(Event event) {
        System.out.println("...");
    }
}
