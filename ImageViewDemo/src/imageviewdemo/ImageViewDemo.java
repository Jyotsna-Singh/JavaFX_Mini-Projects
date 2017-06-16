/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageviewdemo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author Lenovo
 */
public class ImageViewDemo extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Image pic = new Image("imageviewdemo/wolf.jpg");
        ImageView ivPic = new ImageView(pic);
        ivPic.setFitHeight(600);
        ivPic.setFitWidth(1200);
        
        BorderPane pane = new BorderPane();
        pane.setCenter(ivPic);
        
        Scene scene = new Scene(pane, 600, 1200);
        
        primaryStage.setTitle("Image Viewer");
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
