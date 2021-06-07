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


    Image menuImage = new Image("/images/menuicon.png");
    Image menuImageRed = new Image("/images/menuiconred.png");



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
        Stage myStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/products.fxml"));
        myStage.setTitle("Products");
        myStage.setScene(new Scene(root, USE_COMPUTED_SIZE, USE_COMPUTED_SIZE));
        myStage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        imgViewHome.setImage(new Image("/images/img.png"));
        imgViewSkladiste.setImage(new Image("/images/skladiste.png"));
        imgMenuBtn.setImage(menuImage);
    }

    public void btnToggleOnClick(ActionEvent actionEvent) throws IOException {
        if (sideMenuToggle.isSelected()){
            imgMenuBtn.setImage(menuImageRed);
            TranslateTransition sideMenu = new TranslateTransition(Duration.millis(200.0), bpHome);
            sideMenu.setByX(-130);
            sideMenu.play();
            bpHome.getChildren().clear();
        }
        else {
            imgMenuBtn.setImage(menuImage);
            TranslateTransition sideMenu = new TranslateTransition(Duration.millis(200.0), bpHome);
            sideMenu.setByX(130);
            sideMenu.play();
            bpHome.getChildren().add(leftBar);
        }

    }
}
