package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

public class ControllerFiles {

    @FXML
    private Button backFiles;

    @FXML
    private Button aboutFiles;

    @FXML
    private Button faqFiles;

    @FXML
    private Button helpFiles;

    @FXML
    private Button resourcesFiles;

    @FXML
    public void preFiles() throws IOException {
        System.out.println("Go to main menu");

        //On récupère la fenêtre actuelle (qui est la fenêtre du bouton files par exemple) et on le convertis en Stage pour pouvoir le moidifer
        Scene base = backFiles.getScene();
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

    @FXML
    public void aboutF() throws IOException {
        System.out.println("Go to about");

        //On récupère la fenêtre actuelle (qui est la fenêtre du bouton files par exemple) et on le convertis en Stage pour pouvoir le moidifer
        Scene base = aboutFiles.getScene();
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

    @FXML
    public void faqF() throws IOException {
        System.out.println("Go to faq");

        //On récupère la fenêtre actuelle (qui est la fenêtre du bouton files par exemple) et on le convertis en Stage pour pouvoir le moidifer
        Scene base = faqFiles.getScene();
        Stage stage = (Stage) base.getWindow();

        try {
            Desktop.getDesktop().browse(new URL("https://support.lunii.com/hc/fr").toURI());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }


    }

    @FXML
    public void helpF() throws IOException {
        System.out.println("Go to help");

        //On récupère la fenêtre actuelle (qui est la fenêtre du bouton files par exemple) et on le convertis en Stage pour pouvoir le moidifer
        Scene base = helpFiles.getScene();
        Stage stage = (Stage) base.getWindow();
        try {
            Desktop.getDesktop().browse(new URL("https://support.lunii.com/hc/fr/requests/new").toURI());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

    }

    @FXML
    public void resourcesF() throws IOException {
        System.out.println("Go to resources");

        //On récupère la fenêtre actuelle (qui est la fenêtre du bouton files par exemple) et on le convertis en Stage pour pouvoir le moidifer
        Scene base = resourcesFiles.getScene();
        Stage stage = (Stage) base.getWindow();


    }
}

