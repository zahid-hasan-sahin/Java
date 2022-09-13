package javafxtest;

import java.awt.Rectangle;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class NewFXMain extends Application {

    public void start(Stage primaryStage) {

        Line a = new Line(10, 50, 150, 50); //Line(startX,startY,endX,endY)      
     //   Line b = new Line(10, 100, 150, 100);
        Line c = new Line(10, 50, 10, 100);
        Line d = new Line(150, 50, 150, 100);

        Group r = new Group();
        r.getChildren().addAll(a, c, d);

        Scene s = new Scene(r, 600, 400);

        primaryStage.setScene(s);
        primaryStage.setTitle("first time");
        primaryStage.show();

    }

    public static void main(String[] a) {
        launch();
    }
}
