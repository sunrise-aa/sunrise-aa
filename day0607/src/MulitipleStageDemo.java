
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MulitipleStageDemo extends Application {
    public void start(Stage primaryStage){
        Scene scene=new Scene(new Button("Ok"),200,250);
        primaryStage.setTitle("MyJavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
        Stage stage=new Stage();
        stage.setTitle("second Stage");
        stage.setScene(new Scene(new Button("new Stage"),200,250));
        stage.show();
    }
}
