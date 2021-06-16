package controller;

import controller.DodajUposlenikaController;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;

import java.io.IOException;

public class UposleniciController {
    public Label lblView;
    public BorderPane bpContent;
    public StackPane spEmployeContent;
    public MenuItem btnAddEmployee;
    public MenuItem btnViewEmployee;
    public ImageView ivEmployeIcon;

    public void btnAddEmployeeOnClick(ActionEvent actionEvent) throws IOException {
        lblView.setText("Dodaj uposlenika");
        DodajUposlenikaController vec = new DodajUposlenikaController();

        FXMLLoader fXMLLoader = new FXMLLoader();
        fXMLLoader.load(getClass().getResource("/fxml/dodajUposlenika.fxml").openStream());
        DodajUposlenikaController dodajUposlenikaController = fXMLLoader.getController();
        GridPane GPane = fXMLLoader.getRoot();
        spEmployeContent.getChildren().clear();
        spEmployeContent.getChildren().add(GPane);


    }

    public void btnViewEmployeeOnAction(ActionEvent actionEvent) {

    }
}
