package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;

public class Main extends Application
{

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        //Création de FXMLLoader, qui va nous permettre de charger le FXML
       FXMLLoader loader = new FXMLLoader();

       //On indique la location du FXML à charger
        loader.setLocation(new URL("file:C:\\Users\\faych\\OneDrive\\Documents\\Lunii\\lunii2020\\cdc\\IHM\\dev\\IHM\\src\\sample\\FXML\\IHM3.fxml"));

        //On indique l'élement tout en haut de l'arborescence dans le FXML
        Parent root = loader.load();

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args)
    {
        launch(args);
    }
}