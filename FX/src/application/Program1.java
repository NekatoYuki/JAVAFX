package application;
	 
	import javafx.application.Application;
	import javafx.event.ActionEvent;
	import javafx.event.EventHandler;
	import javafx.scene.Scene;
	import javafx.scene.control.Button;
	import javafx.scene.layout.StackPane;
	import javafx.stage.Stage;
	 
	public class Program1 extends Application {
	    public static void main(String[] args) {
	        launch(args);
	    }
	    
	    @Override
	    public void start(Stage primaryStage) {
	        primaryStage.setTitle("Program1");
	        Button btn = new Button();
	        btn.setText("Say 'Hello World'");
	        btn.setOnAction(new EventHandler<ActionEvent>() {
	 
	            @Override
	            public void handle(ActionEvent event) {
	                System.out.println("Hello World!");
	            }
	        });
	        
	        Button btn1 = new Button();
	        btn1.setText("Say 'GoodBye World'");
	        btn1.setOnAction(new EventHandler<ActionEvent>() {
	        	
	        	@Override
	            public void handle(ActionEvent event) {
	                System.out.println("Goodbye World!");
	            }
	        });
	        
	        
	        StackPane root = new StackPane();
	        root.getChildren().add(btn);
	        primaryStage.setScene(new Scene(root, 300, 100));
	        primaryStage.show();
	        
	        StackPane root1 = new StackPane();
	        root1.getChildren().add(btn1);
	        primaryStage.setScene(new Scene(root1, 300, 400));
	        primaryStage.show();
	    }
	}

