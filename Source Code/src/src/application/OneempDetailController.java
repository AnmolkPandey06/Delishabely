package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javajdbctut1.Javajdbc;

public class OneempDetailController {
	@FXML
	private Stage stage;
	@FXML
	private Scene scene;
	@FXML
	private Parent root;
	@FXML
	private TextField emp_id;

	// Event Listener on Button.onAction
	@FXML
	public void back(ActionEvent event) throws IOException {
		// TODO Autogenerated
		FXMLLoader loader=new FXMLLoader(getClass().getResource("EmpDetail.fxml"));
		root=loader.load();
		 stage=(Stage)((Node)event.getSource()).getScene().getWindow();
		 scene = new Scene(root);
                  scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		 stage.setScene(scene);
	 stage.show();
	}
	// Event Listener on Button.onAction
	@FXML
	public void apply(ActionEvent event)throws IOException {
		String id=emp_id.getText();
                //use jdbc here and print details in the terminal
                
                String branchid=Javajdbc. holdbranch;
                Manager.show_one_employee(id,branchid);
                
                FXMLLoader loader=new FXMLLoader(getClass().getResource("EmpDetail.fxml"));
		root=loader.load();
		 stage=(Stage)((Node)event.getSource()).getScene().getWindow();
		 scene = new Scene(root);
                  scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		 stage.setScene(scene);
	 stage.show();
		// TODO Autogenerated
	}
}
