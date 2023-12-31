package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.chart.PieChart;
import javajdbctut1.Javajdbc;

public class DatavisualController {
	@FXML
	private Stage stage;
	@FXML
	private Scene scene;
	@FXML
	private Parent root;
	// Event Listener on Button.onAction
            void func(Scene scene1) {
		    scene=scene1;
		}
	@FXML
	public void back(ActionEvent event) throws IOException {
		// TODO Autogenerated
		FXMLLoader loader=new FXMLLoader(getClass().getResource("owner.fxml"));
		root=loader.load();
		 stage=(Stage)((Node)event.getSource()).getScene().getWindow();
		 scene = new Scene(root);
                  scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		 stage.setScene(scene);
	 stage.show();	
	}
        @FXML
	public void Inlet(ActionEvent event) throws IOException {
		// TODO Autogenerated
//		FXMLLoader loader=new FXMLLoader(getClass().getResource("incomepie.fxml"));
//		root=loader.load();
//		 stage=(Stage)((Node)event.getSource()).getScene().getWindow();
//		 scene = new Scene(root);
//                  scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
//		 stage.setScene(scene);
//	 stage.show();	

          int data[]={8752,8672};
   
        {
       // int income=Javajdbc.getdetails("Income",data[i]);
        int expense=Javajdbc.getdetails("Expenses",data[0]);
        int profit=Javajdbc.getdetails("profit",data[0]);
       // System.out.println(income);
        System.out.println(expense);
        System.out.println(profit);
        // Creating PieChart Data
        ObservableList<PieChart.Data> pieData = FXCollections.observableArrayList(
                // insert data
               // new PieChart.Data("Income", income),
                new PieChart.Data("Expenses", expense),
                new PieChart.Data("Profit", profit)
        );

        PieChart pie = new PieChart(pieData);
        pie.setTitle("Pie-Chart");

        Group root = new Group(pie);
        Scene scene = new Scene(root, 500, 500);
        Stage st=new Stage();
        st.setTitle("Data on Pie-Chart");
        st.setScene(scene);
        st.show();
        }

	}
	@FXML
	public void Exlet(ActionEvent event) throws IOException {
		// TODO Autogenerated
		
          int data[]={8752,8672};
   
        {
       // int income=Javajdbc.getdetails("Income",data[i]);
        int expense=Javajdbc.getdetails("Expenses",data[1]);
        int profit=Javajdbc.getdetails("profit",data[1]);
       // System.out.println(income);
        System.out.println(expense);
        System.out.println(profit);
        // Creating PieChart Data
        ObservableList<PieChart.Data> pieData = FXCollections.observableArrayList(
                // insert data
               // new PieChart.Data("Income", income),
                new PieChart.Data("Expenses", expense),
                new PieChart.Data("Profit", profit)
        );

        PieChart pie = new PieChart(pieData);
        pie.setTitle("Pie-Chart");

        Group root = new Group(pie);
        Scene scene = new Scene(root, 500, 500);
        Stage st=new Stage();
        st.setTitle("Data on Pie-Chart");
        st.setScene(scene);
        st.show();
	 
	}
}
}
