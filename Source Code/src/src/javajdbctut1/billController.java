package javajdbctut1;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class billController {
		@FXML
		private Stage stage;
		@FXML
		private Scene scene;
		@FXML
		private Parent root;
	@FXML
	private Label cname;
	@FXML
	private Label amt;

	// Event Listener on RadioButton.onAction
	@FXML
	public void cashpay(ActionEvent event) throws IOException {
		// TODO Autogenerated
		FXMLLoader loader=new FXMLLoader(getClass().getResource("billpayed.fxml"));
		root=loader.load();
                System.out.println("billpayed");
		billpayedController own=loader.getController();
//		own.change();
		 stage=(Stage)((Node)event.getSource()).getScene().getWindow();
		 scene = new Scene(root);
		 stage.setScene(scene);
	 stage.show();		
	}
	// Event Listener on RadioButton.onAction
	@FXML
	public void cardpay(ActionEvent event) throws IOException {
		// TODO Autogenerated
		FXMLLoader loader=new FXMLLoader(getClass().getResource("billpayed.fxml"));
		root=loader.load();
		billpayedController own=loader.getController();
//		own.displayname(title);
//		own.change();
		 stage=(Stage)((Node)event.getSource()).getScene().getWindow();
		 scene = new Scene(root);
		 stage.setScene(scene);
	 stage.show();		
	}
	// Event Listener on RadioButton.onAction
	@FXML
	public void Gpay(ActionEvent event) throws IOException {
		// TODO Autogenerated
		FXMLLoader loader=new FXMLLoader(getClass().getResource("billpayed.fxml"));
		root=loader.load();
		billpayedController own=loader.getController();
		 stage=(Stage)((Node)event.getSource()).getScene().getWindow();
		 scene = new Scene(root);
		 stage.setScene(scene);
	 stage.show();	
	}
}
