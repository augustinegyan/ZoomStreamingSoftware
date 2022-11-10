package Controls;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class ZoomStart {

    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    Button signInBtn;

    public void changeScene(ActionEvent event) throws IOException {
        root= FXMLLoader.load(getClass().getResource("../UI/Zoom_signin.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();


    }




}