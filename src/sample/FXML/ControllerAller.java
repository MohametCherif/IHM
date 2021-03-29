package sample.FXML;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class ControllerAller<event, rb, url> {

    static double ii = 0;

    @FXML
    private Button back;

    @FXML
    private Button Refresh;

    @FXML
    private Button run;

    @FXML
    private TextField selcom;


    @FXML
    private TextField chosce;

    @FXML
    private ProgressBar progressbar;

    @FXML
    public void Retour() throws IOException {
        System.out.println("previous scene");

        //On récupère la fenêtre actuelle (qui est la fenêtre du bouton Start par exemple) et on le convertis en Stage pour pouvoir le moidifer
        Scene base = back.getScene();
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

    /* runnint test */

    @FXML
    public void Run() throws IOException {
        System.out.println("Running test ");
        selcom.setEditable(false);
        chosce.setEditable(false);

        //On récupère la fenêtre actuelle (qui est la fenêtre du bouton Start par exemple) et on le convertis en Stage pour pouvoir le moidifer
        Scene base = Refresh.getScene();
        Stage stage = (Stage) base.getWindow();
        //progressbar.setProgress(ii);

        //On charge le nouveau FXML (la nouvelle page), même code que dans le main
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(new URL("file:C:\\Users\\faych\\OneDrive\\Documents\\Lunii\\lunii2020\\cdc\\IHM\\dev\\IHM\\src\\sample\\FXML\\Aller.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);


        /* fin test */
        // action event
        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                while (ii<1) {
                    // set progress to different level of progressbar
                    ii += 0.3;
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException interruptedException) {
                    interruptedException.printStackTrace();
                }
                    progressbar.setProgress(ii);

                }
            }
        };

            // set on action
            run.setOnAction(event);

            // reset de la page

        // action event
        EventHandler<ActionEvent> ev = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent eve) {

                    // set progress to different level of progressbar
                    progressbar.setProgress(0.0);
            }
        };

        // set on action
        Refresh.setOnAction(ev);

            //On change la fenetre avec le nouveau que l'on vient de charger et on l'affiche
             stage.setScene(base);
             stage.show();


    }

}
