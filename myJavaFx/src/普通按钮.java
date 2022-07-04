import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class 普通按钮 extends Application{

	@Override
	public void start(Stage primaryStage){
		
		Button btOk=new Button("为什么我可以运行");
				Scene scene=new Scene(btOk,200,250);
				primaryStage.setScene(scene);
				primaryStage.show();
	}

}
