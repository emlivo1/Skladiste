package controller;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
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

    public Button btnSkladiste;

    public StackPane acContent;
    public ToggleButton sideMenuToggle;
    public BorderPane bpHome;
    public Button btnProizvodi;

    public Button btnUposlenici;

    public Button btnPostavke;

    public Button btnHelp;


    @FXML
    private ImageView imgViewProizvodi;
    @FXML
    private ImageView imgViewHelp;
    @FXML
    private ImageView imgViewUposlenici;
    @FXML
    private ImageView imgViewPostavke;
    @FXML
    private ImageView imgViewHome;
    @FXML
    private ImageView imgViewSkladiste;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        imgViewHome.setImage(new Image("/images/img.png"));
        imgViewSkladiste.setImage(new Image("/images/skladiste.png"));
        imgViewUposlenici.setImage(new Image("/images/uposlenici.png"));
        imgViewPostavke.setImage(new Image("/images/postavke.png"));
        imgViewProizvodi.setImage(new Image("/images/proizvodi.png"));
        imgViewHelp.setImage(new Image("/images/help.png"));

    }
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
        FXMLLoader fxmlLoader = new FXMLLoader();

        try {
            fxmlLoader.load(this.getClass().getResource("/fxml/skladiste.fxml").openStream());
        } catch (IOException var4) {
        }
        GridPane root = (GridPane)fxmlLoader.getRoot();
        this.acContent.getChildren().clear();
        this.acContent.getChildren().add(root);

    }

    public void btnProizvodiOnClick(ActionEvent actionEvent) throws IOException {
        Stage myStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/products.fxml"));
        myStage.setTitle("Products");
        myStage.setScene(new Scene(root, USE_COMPUTED_SIZE, USE_COMPUTED_SIZE));
        myStage.show();
    }

    public void btnUposleniciOnClick(ActionEvent actionEvent) {
        FXMLLoader fxmlLoader = new FXMLLoader();

        try {
            fxmlLoader.load(this.getClass().getResource("/fxml/uposlenici.fxml").openStream());
        } catch (IOException var4) {
        }
        GridPane root = (GridPane)fxmlLoader.getRoot();
        this.acContent.getChildren().clear();
        this.acContent.getChildren().add(root);
    }

    public void btnPostavkeOnClick(ActionEvent actionEvent) {
        FXMLLoader fxmlLoader = new FXMLLoader();

        try {
            fxmlLoader.load(this.getClass().getResource("/fxml/postavke.fxml").openStream());
        } catch (IOException var4) {
        }
        GridPane root = (GridPane)fxmlLoader.getRoot();
        this.acContent.getChildren().clear();
        this.acContent.getChildren().add(root);
    }

    public void btnHelpOnClick(ActionEvent actionEvent) {
        FXMLLoader fxmlLoader = new FXMLLoader();

        try {
            fxmlLoader.load(this.getClass().getResource("/fxml/help.fxml").openStream());
        } catch (IOException var4) {
        }
        GridPane root = (GridPane)fxmlLoader.getRoot();
        this.acContent.getChildren().clear();
        this.acContent.getChildren().add(root);
    }

}
