package supermercado;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Cadastro {

    public void cadastrarButtonAction(javafx.event.ActionEvent actionEvent) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("Cadastrado.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();

    }

    public void voltarButtonAction(javafx.event.ActionEvent actionEvent) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

        stage.setTitle("Login");
        stage.setScene(scene);
        stage.show();

    }
}
