

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ShowCircleCentered extends Application {
	
		@SuppressWarnings("unchecked")
		public void start(Stage primaryStage) {
			Pane pane=new Pane();
		
			Button button=new Button("Start up");;
			button.translateXProperty().bind(pane.widthProperty().divide(2));
			button.translateYProperty().bind(pane.heightProperty().divide(2));
			button.setTextFill(Color.ORANGE);
			button.setOnAction(new EventHandler(){
				public void handle(Event event) {
					
					Button button=(Button)event.getSource();
				
					Button button1=new Button("çÛ¶ù");
					button1.translateXProperty().bind(pane.widthProperty().multiply(Math.random()));
					button1.translateYProperty().bind(pane.heightProperty().multiply(Math.random()));
					pane.getChildren().add(button1);
				
					
				}

		
			});
			pane.getChildren().add(button);
			Scene scene=new Scene(pane,200,200);
			
			primaryStage.setTitle("ShowCircleCenterd");
			primaryStage.setScene(scene);
			primaryStage.show();
			
}

}
