/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphicsthings;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

/**
 *
 * @author Qmppu842
 */
public class GraphicsThings extends Application {

    final int WIDTH = 900;
    final int HEIGHT = 900;

    @Override
    public void start(Stage primaryStage) {
        Canvas wall = new Canvas(WIDTH, HEIGHT);

        GraphicsContext gc = wall.getGraphicsContext2D();
        gc.translate(WIDTH/2, WIDTH/2);

           
        gc.fillArc(0-50, 0-50, 100, 100, 0, 90, ArcType.ROUND);
        
        Pane root = new Pane();
        root.getChildren().add(wall);

        Scene scene = new Scene(root, WIDTH, HEIGHT);

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
