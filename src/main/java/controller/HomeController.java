package controller;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

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
    public MenuButton btnKorisnik;


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
        try {
            ResourceBundle bundle = ResourceBundle.getBundle("Translation");
            FXMLLoader loader = new FXMLLoader( getClass().getResource(
                    "/fxml/home.fxml" ), bundle);
            Parent root1 = (Parent) loader.load();
            Stage stage = new Stage();
            stage.setTitle("Skladiste");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }


    public void btnSkladisteOnClick(ActionEvent actionEvent) throws IOException {
        try {
            ResourceBundle bundle = ResourceBundle.getBundle("Translation");
            FXMLLoader loader = new FXMLLoader( getClass().getResource(
                    "/fxml/skladiste.fxml" ), bundle);
            Parent root1 = (Parent) loader.load();
            Stage stage = new Stage();
            stage.setTitle("Skladiste");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }




    public void btnProizvodiOnClick(ActionEvent actionEvent) throws IOException {
        try {
            ResourceBundle bundle = ResourceBundle.getBundle("Translation");
            FXMLLoader loader = new FXMLLoader( getClass().getResource("/fxml/products.fxml" ), bundle);
            Parent root1 = (Parent) loader.load();
            Stage stage = new Stage();
            stage.setTitle("Skladiste");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }


    public void btnUposleniciOnClick(ActionEvent actionEvent) {
        try {
        ResourceBundle bundle = ResourceBundle.getBundle("Translation");
        FXMLLoader loader = new FXMLLoader( getClass().getResource(
        "/fxml/uposlenici.fxml" ), bundle);
        Parent root1 = (Parent) loader.load();
        Stage stage = new Stage();
        stage.setTitle("Skladiste");
        stage.setScene(new Scene(root1));
        stage.show();
        } catch(Exception e) {
        e.printStackTrace();
        }

    }

    public void btnPostavkeOnClick(ActionEvent actionEvent) {
        try {
        ResourceBundle bundle = ResourceBundle.getBundle("Translation");
        FXMLLoader loader = new FXMLLoader( getClass().getResource("/fxml/postavke.fxml" ), bundle);
        Parent root1 = (Parent) loader.load();
        Stage stage = new Stage();
        stage.setTitle("Skladiste");
        stage.setScene(new Scene(root1));
        stage.show();
        } catch(Exception e) {
        e.printStackTrace();
        }

    }

    public void btnHelpOnClick(ActionEvent actionEvent) {

        try {
        ResourceBundle bundle = ResourceBundle.getBundle("Translation");
        FXMLLoader loader = new FXMLLoader( getClass().getResource("/fxml/help.fxml" ), bundle);
        Parent root1 = (Parent) loader.load();
        Stage stage = new Stage();
        stage.setTitle("Skladiste");
        stage.setScene(new Scene(root1));
        stage.show();
        } catch(Exception e) {
        e.printStackTrace();
        }
        }


    public void korisnikOnClick(ActionEvent actionEvent) {
    }
}
