package com.myproject.multiplicationtrainer;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {
  
  private Parent root;
  private Scene scene;

  @Override
  public void start(Stage stage) throws IOException {
    root = FXMLLoader.load(getClass().getResource("main.fxml"));
    scene = new Scene(root, 400, 400);
    scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
    stage.setScene(scene);
    stage.setTitle("Rise your skills...");
    stage.show();
  }

  public static void main(String[] args) {
    launch();
  }
}
