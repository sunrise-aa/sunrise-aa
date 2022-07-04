package sample;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Controller {
    public void start(Stage primarayStage) {
        Button btOk = new Button("Ok");
        Scene scene = new Scene(btOk, 200, 250);
        primarayStage.setTitle("MyJavaFx");
        primarayStage.setScene(scene);
        primarayStage.show();
    }
}
