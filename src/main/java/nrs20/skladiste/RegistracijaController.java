package nrs20.skladiste;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class RegistracijaController {
    public Hyperlink hlLogin;
    public TextField tfUserName;
    public TextField tfFullName;
    public PasswordField pfUserPassword;
    public PasswordField pfReUserPassword;
    public Button btnSignUp;

    public void pfKeyTyped(KeyEvent keyEvent) {
    }

    public void btnRegistration(ActionEvent actionEvent) {
    }

    public void hlLogin(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/login.fxml"));
        Scene scene = new Scene(root);
        Stage nStage = new Stage();
        nStage.setScene(scene);
        nStage.setTitle("Prijava");
        nStage.show();

        Stage hlLoginStage = (Stage) hlLogin.getScene().getWindow();
        hlLoginStage.close();
    }
}
