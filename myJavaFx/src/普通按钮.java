import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ��ͨ��ť extends Application{

	@Override
	public void start(Stage primaryStage){
		
		Button btOk=new Button("Ϊʲô�ҿ�������");
				Scene scene=new Scene(btOk,200,250);
				primaryStage.setScene(scene);
				primaryStage.show();
	}

}
