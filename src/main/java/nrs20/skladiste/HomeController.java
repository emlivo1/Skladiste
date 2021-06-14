package nrs20.skladiste;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static javafx.scene.control.PopupControl.USE_COMPUTED_SIZE;

public class HomeController implements Initializable {
    public ScrollPane leftBar;
    public Button btnHome;
    public ImageView imgViewHome;
    public Button btnSkladiste;
    public ImageView imgViewSkladiste;
    public StackPane acContent;
    public ToggleButton sideMenuToggle;
    public ImageView imgMenuBtn;
    public BorderPane bpHome;
    public Button btnProizvodi;
    public ImageView imgViewProizvodi;
    public Button btnUposlenici;
    public ImageView imgViewUposlenici;
    public Button btnPostavke;
    public ImageView imgViewPostavke;
    public Button btnHelp;
    public ImageView imgViewHelp;


    public void btnHomeOnClick(ActionEvent actionEvent) {
        FXMLLoader fxmlLoader = new FXMLLoader();

        try {
            fxmlLoader.load(this.getClass().getResource("/fxml/dash.fxml").openStream());
        } catch (IOException var4) {
        }
        GridPane root = (GridPane)fxmlLoader.getRoot();
        this.acContent.getChildren().clear();
        this.acContent.getChildren().add(root);
    }

    public void btnSkladisteOnClick(ActionEvent actionEvent) throws IOException {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        imgViewHome.setImage(new Image("/images/img.png"));
        imgViewSkladiste.setImage(new Image("/images/skladiste.png"));
    }



    public void btnProizvodiOnClick(ActionEvent actionEvent) throws IOException {
        Stage myStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/products.fxml"));
        myStage.setTitle("Products");
        myStage.setScene(new Scene(root, USE_COMPUTED_SIZE, USE_COMPUTED_SIZE));
        myStage.show();
    }

    public void btnUposleniciOnClick(ActionEvent actionEvent) {
    }

    public void btnPostavkeOnClick(ActionEvent actionEvent) {
    }

    public void btnHelpOnClick(ActionEvent actionEvent) {
    }

}
