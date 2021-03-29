package sample;
//import javafx.event.ActionEvent;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;


public class ControllerSettings {
    ObservableList<String> languages = FXCollections.observableArrayList("french","english","italian ","spanish");
    ObservableList<String> display = FXCollections.observableArrayList("Text","Resolution","autre ");
    ObservableList<String> sound = FXCollections.observableArrayList("story","format");
    ObservableList<String> mode = FXCollections.observableArrayList("test","usine");

    @FXML
    private Button backSettings;


    @FXML
    private ChoiceBox cblang;

    @FXML
    private ChoiceBox cbdisplay;

    @FXML
    private ChoiceBox cbsound;

    @FXML
    private ChoiceBox cbmode;

    @FXML
    private CheckBox switchTheme;


    @FXML
    private void initialize()
    {
        cblang.setValue("french");
        cblang.setItems(languages);

        cbdisplay.setValue("Text");
        cbdisplay.setItems(display);

        cbsound.setValue("story");
        cbsound.setItems(sound);

        cbmode.setValue("test");
        cbmode.setItems(mode);


    }

    @FXML
    public void preSettings() throws IOException {
        System.out.println("Go to main menu");

        //On récupère la fenêtre actuelle (qui est la fenêtre du bouton settings par exemple) et on le convertis en Stage pour pouvoir le moidifer
        Scene base = backSettings.getScene();
        Stage stage = (Stage) base.getWindow();

        //On charge le nouveau FXML (la nouvelle page), même code que dans le main
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(new URL("file:C:\\Users\\faych\\OneDrive\\Documents\\Lunii\\lunii2020\\cdc\\IHM\\dev\\IHM\\src\\sample\\FXML\\IHM3.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);

        //On change la fenetre avec le nouveau que l'on vient de charger et on l'affiche
        stage.setScene(scene);
        stage.show();

    }


}

