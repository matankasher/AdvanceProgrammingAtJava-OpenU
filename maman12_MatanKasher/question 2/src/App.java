import java.io.Console;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
 
public class App extends Application {
    @Override
    public void start(Stage primaryStage) {
        Parent root;
        try {
            root= FXMLLoader.load(getClass().getClassLoader().getResource("MainSenceCanvas.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
        System.out.println(e);
        }


    }
 
 public static void main(String[] args) {
        launch(args);
        
    }
}