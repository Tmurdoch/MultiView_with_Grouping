package com.example.multiview_with_grouping;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


/**
 * Initial design:
 * view 1 is canvas with triangles - ViewTriangleCanvas
 * view 2 is observable list of groups - ViewObsGroups
 * view 3 is viewport-background thing - ViewBigPicture
 */
public class StartSetup extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        Scene scene = new Scene(starting_view, 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}