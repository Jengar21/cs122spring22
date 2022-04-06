package classlab.week11;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;



public class JavaFX extends Application{

	private Rectangle[] rectangle;
	


	Color red = Color.rgb(252,3,3);
	Color blue = Color.rgb(3,3,252);
	Color yellow = Color.rgb(252,244,3);
	Color green = Color.rgb(3,252,3);
	Color[] color = {red,blue,green,yellow};

	Random ran = new Random();


	private Color currentColor;


	public void start(Stage primaryStage) throws Exception {

		rectangle = new Rectangle[5];

		for(int i=0; i<5; i++) {
			rectangle[i]= new Rectangle(ran.nextInt(500)+10, ran.nextInt(90)+10,ran.nextInt(91)+10);
			rectangle[i].setFill(blue);
		}

		Button push = new Button("Color");
		push.setOnAction(this::colors);

		Group root= new Group(rectangle[0],rectangle[1],rectangle[2],rectangle[3],rectangle[4], push);
		Scene scene= new Scene(root, 600, 600, Color.ALICEBLUE);

		primaryStage.setTitle("Rectangle");
		primaryStage.setScene(scene);
		primaryStage.show();


	}
	public void colorsValue(Color currentColor) 
	{for(Rectangle x: rectangle) {
		x.setFill(currentColor);
	}


	public void color(ActionEvent event) {
		int randomColor= random.nextInt(4);
		colorsValue(color[randomColor]);

	}


	public static void main(String[] args) {
		launch(args);
	}

	}

