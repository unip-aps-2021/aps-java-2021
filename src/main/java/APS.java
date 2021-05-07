import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.XYChart;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class APS extends Application {
//    private double xOffset = 0;
//    private double yOffset = 0;

    @Override
    @SuppressWarnings("unused")
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("APS.fxml"));
        stage.setTitle("Tech Rivers LTDA");
        stage.getIcons().add(new Image("/ImageResources/logo.png"));

        Menu menu = new Menu("Menu");

        CheckMenuItem menuItem1 = new CheckMenuItem("menu item 1");
        CheckMenuItem menuItem2 = new CheckMenuItem("menu item 2");
        CheckMenuItem menuItem3 = new CheckMenuItem("menu item 3");

        menu.getItems().add(menuItem1);
        menu.getItems().add(menuItem2);
        menu.getItems().add(menuItem3);

        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().add(menu);

        VBox vBox = new VBox(menuBar);

        Scene scene = new Scene(root, 700, 650);

        stage.setScene(scene);
        stage.show();


    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
