import javafx.fxml.FXML;
import javafx.scene.control.Button;
import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

@SuppressWarnings("unused")
public class APSController {
    @FXML
    private Button twitterButton;
    @FXML
    private Button instagramButton;
    @FXML
    private Button linkedinButton;
    @FXML
    private Button facebookButton;

    @FXML
    public void initialize(){
    }

    @FXML
    public void openTwitter() throws URISyntaxException, IOException {
        if(Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)){
            Desktop.getDesktop().browse(new URI("https://twitter.com/Mundosustentve3"));
        }
    }

    @FXML
    public void openInstagram() throws URISyntaxException, IOException {
        if(Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)){
            Desktop.getDesktop().browse(new URI("https://www.instagram.com/"));
        }
    }

    @FXML
    public void openLinkedin() throws URISyntaxException, IOException {
        if(Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)){
            Desktop.getDesktop().browse(new URI("https://www.linkedin.com/"));
        }
    }

    @FXML
    public void openFacebook() throws URISyntaxException, IOException {
        if(Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)){
            Desktop.getDesktop().browse(new URI("https://www.facebook.com/Mundo-sustent%C3%A1vel-112567143775018/?modal=admin_todo_tour"));
        }
    }
}
