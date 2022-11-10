package Controls;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Controller {
    @FXML
    BorderPane borderPane;
    @FXML
    ImageView home_Icon;

    @FXML
    Text chatText;

    @FXML
    ImageView chatIcon;

    @FXML
    ImageView clockIcon;

    @FXML
    ImageView contactIcon;

    @FXML
    ImageView appIcon;

    @FXML
    Label time;


    public void changeLabel(){

        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH mm");
        time.setText(dateTimeFormatter.format(localDateTime));

    }

    public Image chageImages(String image_loc){
        Image myImage1 = new Image(getClass().getResourceAsStream(image_loc));
        return myImage1;
    }

    public void display(){
     home_Icon.setImage(chageImages("../Assets/home2.png"));
    }

    public void displaynot(){
        home_Icon.setImage(chageImages("../Assets/home_24px.png"));
    }


    public void chatHover(){
        chatIcon.setImage(chageImages("../Assets/chat2.png"));
    }
    public void chatHover_normal(){
        chatIcon.setImage(chageImages("../Assets/chat.png"));
    }



    public void contactHover(){
        contactIcon.setImage(chageImages("../Assets/contact.png"));
    }
    public void contactHover_normal(){
        contactIcon.setImage(chageImages("../Assets/contact2.png"));
    }


    public void appHover(){
        appIcon.setImage(chageImages("../Assets/apps2.png"));
    }
    public void appHover_normal(){
        appIcon.setImage(chageImages("../Assets/apps_tab_24px.png"));
    }

    public void meetingsHOver(){
        clockIcon.setImage(chageImages("../Assets/clock2.png"));
    }
    public void meetingsHover_normal(){
        clockIcon.setImage(chageImages("../Assets/clock_24px.png"));
    }

    public void changeScenes(String scenes) throws IOException {
        Parent root = null;

        root= FXMLLoader.load(getClass().getResource(scenes+".fxml"));
        borderPane.setCenter(root);
        borderPane.setRight(null);

    }

    public void chatPage() throws IOException {
        changeScenes("../UI/Chat");

    }





}


