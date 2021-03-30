package sample;
//import javafx.event.ActionEvent;

import com.fazecast.jSerialComm.SerialPort;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;


public class ControllerIhm {

    ObservableList<String> choixList = FXCollections.observableArrayList("Volume wheel","Story wheel","Display","Buttons ","USB","NFC","Battery","Jack connector");

    ObservableList<String> choixPort = FXCollections.observableArrayList("");

    ObservableList<String> choixScenario = FXCollections.observableArrayList("scenario1","scenario2","scenario3 ","scenario4","scenario5","scenario6","scenario7","scenario8");

    @FXML
    private Button scenariosButton;


    @FXML
    private Button optionButton;

    @FXML
    private Button logsButton;

    @FXML
    private Button settingsButton;

    @FXML
    private Button filesButton;

    @FXML
    private Button quitButton;

    @FXML
    private Button startButton;

    @FXML
    private Button commentBtn;

    @FXML
    private ComboBox<String> portCB;

    @FXML
    private Button RefreshBtn;

    //BRANCHE main
/*
    @FXML
    private TextArea textArea;

    @FXML
    private TextField textField;

    @FXML
    private Button submit;

    @FXML
    private Button buttonClear;

    @FXML
    private Button append;*/

    /*@FXML
    private Font x1;

    @FXML
    private Color x2;*/

    @FXML
    private Button aboutButton;

    @FXML
    private TextField port;

    @FXML
    private ChoiceBox choix;

    @FXML
    private ChoiceBox serialp;

    @FXML
    private ChoiceBox sceTest;

   // private Object SerialPort;


    @FXML
    private void initialize()
    {
        choix.setValue("Volume wheel");
        choix.setItems(choixList);

        serialp.setValue("");
        serialp.setItems(choixPort);

        sceTest.setValue("scenario1");
        sceTest.setItems(choixScenario);
    }

// bouton pour quitter la fenetre

    @FXML
    public void quitIhm() {
        System.out.println("Close IHM");
        Stage stage = (Stage) quitButton.getScene().getWindow();
        stage.close();
    }

    // ci dessous pour l'ouverture de la fenêtre lorsqu'on appuie sur start
    @FXML
    public void nextScene() throws IOException {
        System.out.println("Next scene");

            //On récupère la fenêtre actuelle (qui est la fenêtre du bouton Start par exemple) et on le convertis en Stage pour pouvoir le moidifer
            Scene base = startButton.getScene();
            Stage stage = (Stage) base.getWindow();


            //On charge le nouveau FXML (la nouvelle page), même code que dans le main
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(new URL("file:C:\\Users\\faych\\OneDrive\\Documents\\Lunii\\lunii2020\\cdc\\IHM\\dev\\IHM\\src\\sample\\FXML\\Aller.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);

            //On change la fenetre avec le nouveau que l'on vient de charger et on l'affiche
            stage.setScene(scene);
            stage.show();

    }
    // ci dessous pour l'ouverture de la fenêtre des scenarios
    @FXML
    public void fenScenario() throws IOException{
        System.out.println("fenetre des scenarios");

        //On récupère la fenêtre actuelle (qui est la fenêtre du bouton scenarios) et on le convertis en Stage pour pouvoir le moidifer
        Scene base = scenariosButton.getScene();
        Stage stage = (Stage) base.getWindow();

        //On charge le nouveau FXML (la nouvelle page), même code que dans le main
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(new URL("file:C:\\Users\\faych\\OneDrive\\Documents\\Lunii\\lunii2020\\cdc\\IHM\\dev\\IHM\\src\\sample\\FXML\\scenario.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);

        //On change la fenetre avec le nouveau que l'on vient de charger et on l'affiche
        stage.setScene(scene);
        stage.show();


    }

    // ci dessous pour l'ouverture de la fenêtre des logs
    @FXML
    public void fenLogs() throws IOException{
        System.out.println("fenetre des logs");

        //On récupère la fenêtre actuelle (qui est la fenêtre du bouton scenarios) et on le convertis en Stage pour pouvoir le moidifer
        Scene base = logsButton.getScene();
        Stage stage = (Stage) base.getWindow();

        //On charge le nouveau FXML (la nouvelle page), même code que dans le main
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(new URL("file:C:\\Users\\faych\\OneDrive\\Documents\\Lunii\\lunii2020\\cdc\\IHM\\dev\\IHM\\src\\sample\\FXML\\Logs.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);

        //On change la fenetre avec le nouveau que l'on vient de charger et on l'affiche
        stage.setScene(scene);
        stage.show();


    }

    // ci dessous pour l'ouverture de la fenêtre des files
    @FXML
    public void fenFiles() throws IOException{
        System.out.println("fenetre des Files");

        //On récupère la fenêtre actuelle (qui est la fenêtre du bouton scenarios) et on le convertis en Stage pour pouvoir le moidifer
        Scene base = filesButton.getScene();
        Stage stage = (Stage) base.getWindow();

        //On charge le nouveau FXML (la nouvelle page), même code que dans le main
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(new URL("file:C:\\Users\\faych\\OneDrive\\Documents\\Lunii\\lunii2020\\cdc\\IHM\\dev\\IHM\\src\\sample\\FXML\\Files.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);

        //On change la fenetre avec le nouveau que l'on vient de charger et on l'affiche
        stage.setScene(scene);
        stage.show();


    }

    // ci dessous pour l'ouverture de la fenêtre des settings
    @FXML
    public void fenSettings() throws IOException{
        System.out.println("fenetre des settings");

        //On récupère la fenêtre actuelle (qui est la fenêtre du bouton settings) et on le convertis en Stage pour pouvoir le moidifer
        Scene base = settingsButton.getScene();
        Stage stage = (Stage) base.getWindow();

        //On charge le nouveau FXML (la nouvelle page), même code que dans le main
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(new URL("file:C:\\Users\\faych\\OneDrive\\Documents\\Lunii\\lunii2020\\cdc\\IHM\\dev\\IHM\\src\\sample\\FXML\\Settings.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);

        //On change la fenetre avec le nouveau que l'on vient de charger et on l'affiche
        stage.setScene(scene);
        stage.show();


    }

    // ci dessous pour l'ouverture de la fenêtre About
    @FXML
    public void fenAbout() throws IOException{
        System.out.println("fenetre des settings");

        //On récupère la fenêtre actuelle (qui est la fenêtre du bouton settings) et on le convertis en Stage pour pouvoir le moidifer
        Scene base = aboutButton.getScene();
        Stage stage = (Stage) base.getWindow();

        //On charge le nouveau FXML (la nouvelle page), même code que dans le main
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(new URL("file:C:\\Users\\faych\\OneDrive\\Documents\\Lunii\\lunii2020\\cdc\\IHM\\dev\\IHM\\src\\sample\\FXML\\About.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);

        //On change la fenetre avec le nouveau que l'on vient de charger et on l'affiche
        stage.setScene(scene);
        stage.show();


    }

    // ci dessous pour l'ouverture de la fenêtre de test de debug
   /* @FXML
    public void test() throws IOException{
        System.out.println("fenetre de test");

        //On récupère la fenêtre actuelle (qui est la fenêtre du bouton settings) et on le convertis en Stage pour pouvoir le moidifer
        Scene base = stopButton.getScene();
        Stage stage = (Stage) base.getWindow();

        //On charge le nouveau FXML (la nouvelle page), même code que dans le main
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(new URL("file:C:\\Users\\faych\\OneDrive\\Documents\\Lunii\\lunii2020\\cdc\\IHM\\dev\\IHM\\src\\sample\\FXML\\test.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);

        //On change la fenetre avec le nouveau que l'on vient de charger et on l'affiche
        stage.setScene(scene);
        stage.show();


    }*/
    // Choix port série

    public void PortSerie() throws IOException{


        SerialPort comPort = SerialPort.getCommPorts()[0];
        //SerialPort[] allAvailableComPorts = SerialPort.getCommPorts();
       // comPort.setBaudRate(2400);
        comPort.openPort();
        comPort.setComPortTimeouts(SerialPort.TIMEOUT_READ_SEMI_BLOCKING, 0, 0);
        InputStream in = comPort.getInputStream();


       // portCB.getItems().clear();

        SerialPort[] commPorts = SerialPort.getCommPorts();

        for (SerialPort commPort : commPorts) {

            portCB.getItems().add(commPort.getSystemPortName());
        }


        comPort.closePort();

    }
    //test pour l'ajout de commentaire sur les tests

    public void test() throws IOException{ {
        System.out.println("fenetre des commentaires");
        Scene base = commentBtn.getScene();
        Stage stage = (Stage) base.getWindow();
/*
        //On charge le nouveau FXML (la nouvelle page), même code que dans le main
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(new URL("file:C:\\Users\\faych\\OneDrive\\Documents\\Lunii\\lunii2020\\cdc\\IHM\\dev\\IHM\\src\\sample\\FXML\\com.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);

        textArea.setEditable(false);

        textField.setPromptText("Enter text to be appended.");

        append.setDefaultButton(true);
        submit.setDefaultButton(true);

        buttonClear.setDefaultButton(true);
        buttonClear.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                //textField.clear();
                textArea.clear();
            }
        });

        append.setOnAction(event -> {
            textArea.setText(textArea.getText() + textField.getText() + "\n");
            textField.clear();
        });*/

          TextField textField = new TextField();
            textField.setPromptText("Enter text to be appended.");
            Button append = new Button("Append");
            append.setDefaultButton(true);
            TextArea textArea = new TextArea();
            textArea.setPromptText("Appended text is displayed here.");
            textArea.setEditable(false);

            Button submit = new Button("Submit");
            submit.setDefaultButton(true);
        // Clear
           Button buttonClear = new Button("Clear");
           buttonClear.setTranslateX(425);
           buttonClear.setTranslateY(-35);
           buttonClear.setDefaultButton(true);
           buttonClear.getStyleClass().add("button");

           buttonClear.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                //textField.clear();
                textArea.clear();
            }
        });

            append.setOnAction(event -> {
                textArea.setText(textArea.getText() + textField.getText() + "\n");
                textField.clear();
            });

            VBox layout = new VBox(10);

            layout.getChildren().addAll(
                    textField,
                    append,
                    textArea,
                    submit,
                    buttonClear
            );
        // add stylesheet for root
        //base.getStylesheets().add(getClass().getResource("Menu.css").toExternalForm());

        // add stylesheet for hBox

            layout.setPadding(new Insets(10));
            layout.getStyleClass().add("VBox");
            stage.setScene(new Scene(layout));
            stage.show();

            //layout.getStylesheets().add(getClass().getResource("Menu.css").toExternalForm());
            //layout.getStyleClass().add("button");


        //On change la fenetre avec le nouveau que l'on vient de charger et on l'affiche
        stage.setScene(base);
        stage.show();

    }
    }



}

