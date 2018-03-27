import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.control.Button;


public class GameCode extends Application
{

	public static void main(String[] args) 
	{
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception 
	{
		//Labels 
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
        ImageView imageView = new ImageView(image);*/

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
	}

}
