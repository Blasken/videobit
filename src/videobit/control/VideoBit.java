package videobit.control;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class VideoBit extends Application {
	private Stage primaryStage;
	private BorderPane rootLayout;
    
	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
	    this.primaryStage.setTitle("VideoBit");
	    this.primaryStage.initStyle(StageStyle.UNDECORATED);
	    
	    try {
	        // Load the root layout from the fxml file
	        FXMLLoader loader = new FXMLLoader(VideoBit.class.getResource("view/RootLayout.fxml"));
	        rootLayout = (BorderPane) loader.load();
	        Scene scene = new Scene(rootLayout);
	        primaryStage.setScene(scene);
	        primaryStage.show();
	    } catch (IOException e) {
	        // Exception gets thrown if the fxml file could not be loaded
	        e.printStackTrace();
	    }
	    showHomeView();
	}
	
	public Stage getPrimaryStage() {
	      return primaryStage;
	  }
	  
	  /**
	  * Shows the person overview scene.
	  */
	  public void showHomeView() {
	      try {
	          // Load the fxml file and set into the center of the main layout
	          FXMLLoader loader = new FXMLLoader(VideoBit.class.getResource("view/HomeView.fxml"));
	          AnchorPane overviewPage = (AnchorPane) loader.load();
	          rootLayout.setCenter(overviewPage);
	          
	      } catch (IOException e) {
	          // Exception gets thrown if the fxml file could not be loaded
	          e.printStackTrace();
	      }
	  }

	public static void main(String[] args) {
		launch(args);
	}
}
