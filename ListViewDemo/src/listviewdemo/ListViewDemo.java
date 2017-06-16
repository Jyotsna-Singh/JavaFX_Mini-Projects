/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listviewdemo;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.MultipleSelectionModel;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Lenovo
 */
public class ListViewDemo extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Label laTitle = new Label("Select admin from list");
        Label laselectedAdmin = new Label("You select");
        //Create List
        //1 - Define Dataset
        ObservableList<String> accounts=
                FXCollections.observableArrayList(
                        "Fullstack Developer", "Entrepreneur", "Marathoner", "Traveller");
        
        //2 - Define List View and Move data to it
        ListView<String> lvAccounts = new ListView<String>(accounts);
        lvAccounts.setPrefSize(300, 150);
        lvAccounts.setOrientation(Orientation.VERTICAL);
        
        //3 - Define Multi select options
        MultipleSelectionModel<String> lvModule = 
                lvAccounts.getSelectionModel();
        lvModule.selectedItemProperty()
                .addListener(new ChangeListener<String>(){
                    @Override
                    public void changed(ObservableValue<? extends String> observable,
                            String oldValue, String newValue){
                        System.out.println("Selected"+ newValue);
                        laselectedAdmin.setText("you Selected:" + newValue);
                    }
                });
        
        FlowPane root = new FlowPane();
        root.setOrientation(Orientation.VERTICAL);
        root.getChildren().add(laTitle);
        root.getChildren().add(lvAccounts);
        root.getChildren().add(laselectedAdmin);
        
        Scene scene = new Scene(root, 400, 350);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
