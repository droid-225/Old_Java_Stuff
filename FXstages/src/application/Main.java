package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


public class Main extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		//Stage stage = new Stage(); // Creates new stage
		Group root = new Group(); // Creates new root node
		Scene scene = new Scene(root, 600, 600, Color.SKYBLUE);
		Stage stage = new Stage();
		
		// Text is a node
		Text text = new Text();
		text.setText("Wow!");
		text.setX(50);
		text.setY(50);
		text.setFont(Font.font("Times New Roman", 50));
		text.setFill(Color.BLUE);
	
		Line line = new Line();
		line.setStartX(200);
		line.setStartY(200);
		line.setEndX(500);
		line.setEndY(200);
		line.setStrokeWidth(5);
		line.setStroke(Color.RED);
		line.setOpacity(0.5);
		line.setRotate(45);
		
		Rectangle rectangle = new Rectangle();
		rectangle.setX(100);
		rectangle.setY(100);
		rectangle.setWidth(100);
		rectangle.setHeight(100);
		rectangle.setFill(Color.GREEN);
		rectangle.setStrokeWidth(5);
		rectangle.setStroke(Color.AZURE);
		
		Polygon triangle = new Polygon();
		triangle.getPoints().setAll(200.0, 200.0,
									300.0, 300.0,
									200.0, 300.0);
		triangle.setFill(Color.PURPLE);
		
		Circle circle = new Circle();
		circle.setCenterX(350);
		circle.setCenterY(350);
		circle.setRadius(50);
		circle.setFill(Color.DARKORANGE);
		
		Image image = new Image("pain.png");
		ImageView imageView = new ImageView(image);
		imageView.setScaleX(0.5);
		imageView.setScaleY(0.5);
		imageView.setX(300);
		imageView.setY(300);
		
		//Scene scene = new Scene(root, Color.BLACK); // Creates new scene to add to stage
		
		// Stage basics
		/*
		Image icon = new Image("pain.png"); // Creates new Image
		// Note: For JavaFX, image used should be in src folder not project folder
		stage.getIcons().add(icon); // Sets icon for stage
		stage.setTitle("Stage Demo"); // Sets title for stage
		stage.setWidth(420); // Sets stage width
		stage.setHeight(420); // Sets stage height
		stage.setResizable(false); // Sets if stage is able to be resized
		//stage.setX(50); // Sets X position where stage will pop up
		//stage.setY(50); // Sets Y position where stage will pop up
		stage.setFullScreen(true); // Sets stage to full-screen mode
		stage.setFullScreenExitHint("YOU CAN'T ESCAPE, unless you press q"); // Sets hint to exit button for full-screen mode
		stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q")); // Sets key to exit full-screen mode (default is esc)
		*/
		
		root.getChildren().add(text);
		root.getChildren().add(line);
		root.getChildren().add(rectangle);
		root.getChildren().add(triangle);
		root.getChildren().add(circle);
		root.getChildren().add(imageView);
		
		stage.setScene(scene); // Adds scene to stage
		stage.show(); // Makes stage visible when program is run
	}
}
