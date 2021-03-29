package sample;
//import javafx.event.ActionEvent;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;


public class ControllerTest {

    ObservableList<String> choixtest = FXCollections.observableArrayList("molette","écran","bouton ","USB");
    ObservableList<String> encore = FXCollections.observableArrayList("prip","prap","prop ","prep");

    @FXML
    private ChoiceBox cbtest;

    @FXML
    private ChoiceBox cbt;



    @FXML
    private void initialize()
    {
        cbtest.setValue("molette");
        cbtest.setItems(choixtest);

        cbt.setValue("prip");
        cbt.setItems(encore);

    }


}

