package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class ControllerLogs {

    @FXML
    private Button backLogs;

    @FXML
    private Button openf;

    @FXML
    private TextArea infoArea;
    @FXML
    private TextField fileTitle;

    @FXML
    FileChooser fileChooser = new FileChooser();
    private Object FxmlUtil;


    @FXML
    public void preLogs() throws IOException {
        System.out.println("Go to main menu");

        //On récupère la fenêtre actuelle (qui est la fenêtre du bouton logs par exemple) et on le convertis en Stage pour pouvoir le moidifer
        Scene base = backLogs.getScene();
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
    public void fileOpening() throws IOException {
        System.out.println("displaying logs");

        //On essaie d'ouvrir un fichier

        Scene base = openf.getScene();
        Stage stage = (Stage) base.getWindow();
        fileChooser = new FileChooser();


        TextField textField = new TextField();
        textField.setEditable(false);
        textField.setPromptText("Enter text to be appended.");

        fileTitle.setEditable(false);

        infoArea.setPromptText("");
        infoArea.setEditable(false);


        openf.setOnAction(e -> {
            
           /* File selectedFile = fileChooser.showOpenDialog(stage);
            infoArea.setText(infoArea.getText() + textField.getText() + "\n");
            textField.clear();*/

            File selectedFile = fileChooser.showOpenDialog(stage);
            if (selectedFile != null && selectedFile.exists() && selectedFile.isFile()) {
                System.out.println("test if");
                TextField f = new TextField();
                f.setText(selectedFile.getPath());

                try {
                    //File myObj = new File("test.txt");
                    File myObj = new File(String.valueOf(selectedFile));
                    Scanner myReader = new Scanner(myObj);
                    while (myReader.hasNextLine()) {
                        String data = myReader.nextLine(); // data = contenu du fichier sous forme de chaine de caracteres
                        System.out.println(data); // afficher le texte contenu dans le fichier sur la console
                        infoArea.setText(data); // afficher le texte contenu dans le fichier dans le TextArea

                        if (myObj.exists()) {
                            System.out.println("File name: " + myObj.getName());
                            fileTitle.setText(myObj.getName()); // afficher le nom du fichier sur le textfield
                        } else {
                            System.out.println("The file does not exist.");
                        }
                    }
                    myReader.close();
                } catch (FileNotFoundException event) {
                    System.out.println("An error occurred.");
                    event.printStackTrace();
                }
            }
        });


        stage.setScene(base);
        stage.show();

       /* VBox layout = new VBox(50);
        layout.getChildren().addAll(
                textField,
                openf,
                infoArea,
                backLogs


        );
        layout.setPadding(new Insets(50));

        stage.setScene(new Scene(layout));
        stage.show();*/

    }

        //VBox vBox = new VBox(openf);
        //Scene scene = new Scene(vBox, 480, 300);

        ;
    }
//}

