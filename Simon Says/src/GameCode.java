
import java.util.ArrayList;

import javafx.animation.FadeTransition;
import javafx.animation.SequentialTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class GameCode extends Application
{

	public static void main(String[] args) 
	{
		Application.launch(args);
		
	}
	
		@Override
		public void start(Stage arg0) throws Exception {
		
		    }
	
		
	

	//*/private Scene scene1, scene2;
   // private Button button2_1, button1_2, blue, red, yellow, green;
   // private Label label1, label2;
   // private VBox layout1, layout2;
    //private Stage frame;


	//@Override
	//public void start(Stage primaryStage) throws Exception 
	//{
		/*/Labels 
		primaryStage.setTitle("Simon Says");
		Label label = new Label("Welcome to Simon Says! Follow the light patterns as displayed. Let's see how well your memory is!!");
        Scene scene = new Scene(label, 400, 500); //not showing up
        primaryStage.setScene(scene);
        Label label2 = new Label("Score: ");
        Scene scene2 = new Scene(label2, 400, 400);
        primaryStage.setScene(scene2);
        primaryStage.show();
        
        //Creating Buttons
        //for making stuff pretty later on
        /*FileInputStream input = new FileInputStream("resources/images/iconmonstr-home-6-48.png");
        Image image = new Image(input);
        ImageView imageView = new ImageView(image);

        Button button = new Button("Green");
        Scene scene3 = new Scene(button, 50, 50);
        primaryStage.setScene(scene3);
        button.setWrapText(true);
        button.setMinSize(10,10);
        button.setMaxSize(20,20);
        button.setPrefSize(10,10);
        
        Button button2 = new Button("Blue");
        Scene scene4 = new Scene(button2, 50, 50);
        primaryStage.setScene(scene4);
        button.setWrapText(true);
        button.setMinSize(10,10);
        button.setMaxSize(200,200);
        button.setPrefSize(50,50);
		frame = primaryStage;

        // Create buttons
        button1_2 = new Button("Go to Main Menu");
        button2_1 = new Button("Start Game");
        blue = new Button("Blue");
        red = new Button("Red");
        yellow = new Button("Yellow");
        green = new Button("Green");
        
        // Button action listener
        button1_2.setOnAction(e -> frame.setScene(scene1));
        button2_1.setOnAction(e -> frame.setScene(scene2));

        // Create labels
        label1 = new Label("This is the main menu. Press 'Start Game' to play.");
        label2 = new Label("Follow the patterns that you see.");

        // Create layouts
        layout1 = new VBox(20);
        layout2 = new VBox(20);

        // Add elements to each layout
        layout1.getChildren().addAll(label1, button2_1);
        layout2.getChildren().addAll(label2, button1_2, blue, red, yellow, green);

        // Create scenes
        scene1 = new Scene(layout1, 400,400);
        scene2 = new Scene(layout2, 400,400);

        frame.setScene(scene1);
        frame.setTitle("Simon Says");
        frame.show();*/
	//}

}
