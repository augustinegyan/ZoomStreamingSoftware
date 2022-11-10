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

public class ZoomSignin {
    private Stage stage;
    private Scene scene;
    private Parent root;


    public void backtoMain(ActionEvent actionEvent) throws IOException {
        root= FXMLLoader.load(getClass().getResource("../UI/Zoom_start.fxml"));
        stage=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        System.out.println(stage.getX()+" "+stage.getY());
        stage.show();
    }
    public void toMainPage(ActionEvent m) throws IOException{
        root=FXMLLoader.load(getClass().getResource("../UI/MainPage.fxml"));
        stage=(Stage)((Node)m.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.setX(150.0);
        stage.setY(50.0);
        stage.show();
    }

}
