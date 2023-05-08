package test.GUI.screens;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
 
public class Test extends Application {
  
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("test.GUI.screens/Home.fxml"));
        primaryStage.setTitle("Youtobe");
        primaryStage.setScene(new Scene(root,1440,1932));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
