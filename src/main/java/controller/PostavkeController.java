package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;

import java.io.IOException;

public class PostavkeController {
    public StackPane spSettingContent;
    public Label lblCurrentStatus;
    public MenuItem miMyAccount;
    public BorderPane bpSettings;
    public MenuItem miIzvjestaj;

    public void miMyASccountOnClick(ActionEvent actionEvent) throws IOException {
        lblCurrentStatus.setText("Korisnicki racun");
        DodajUposlenikaController vec = new DodajUposlenikaController();

        FXMLLoader fXMLLoader = new FXMLLoader();
        fXMLLoader.load(getClass().getResource("/fxml/racun.fxml").openStream());
        RacunController racunController = fXMLLoader.getController();
        GridPane GPane = fXMLLoader.getRoot();
        spSettingContent.getChildren().clear();
        spSettingContent.getChildren().add(GPane);
    }

    public void miKreirajIzvjestaj(ActionEvent actionEvent) {
    }
}
