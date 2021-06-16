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
import java.util.ResourceBundle;

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

        ResourceBundle bundle = ResourceBundle.getBundle("Translation");
        FXMLLoader loader = new FXMLLoader( getClass().getResource(
                "/fxml/dodajUposlenika.fxml" ), bundle);
        DodajUposlenikaController dodajUposlenikaController = loader.getController();
        GridPane GPane = loader.getRoot();
        spEmployeContent.getChildren().clear();
        spEmployeContent.getChildren().add(GPane);


    }

    public void btnViewEmployeeOnAction(ActionEvent actionEvent) {

    }
}
