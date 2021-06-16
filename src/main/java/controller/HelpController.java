package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

import static javafx.scene.control.PopupControl.USE_COMPUTED_SIZE;

public class HelpController {
    public Button btnOSkladistu;
    public Button btnCentarZaPomoc;
    public Button btnPrijaviProblem;

    public void btnOSkladistuOnclick(ActionEvent actionEvent) throws IOException {
        Stage myStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/informacije.fxml"));
        myStage.setTitle("Informacije o skladištu");
        myStage.setScene(new Scene(root, USE_COMPUTED_SIZE, USE_COMPUTED_SIZE));
        myStage.show();
    }

    public void btnCentarZaPomocOnClick(ActionEvent actionEvent) {
    }

    public void btnPrijaviProblemOnClick(ActionEvent actionEvent) {
    }
}
