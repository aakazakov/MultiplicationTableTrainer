package com.myproject.multiplicationtrainer;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import com.myproject.multiplicationtrainer.core.TaskManager;
import com.myproject.multiplicationtrainer.fxcontrollers.MainController;

public class App extends Application {
  
  @Override
  public void start(Stage stage) throws IOException {
    FXMLLoader loader = new FXMLLoader(getClass().getResource("main.fxml"));
    TaskManager taskManager = new TaskManager();
    MainController mainController = new MainController(taskManager);
    loader.setController(mainController);
    Parent root = loader.load();
    Scene scene = new Scene(root);
    scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
    stage.setScene(scene);
    stage.setTitle("Rise your skills...");
    stage.show();
  }

  public static void main(String[] args) {
    launch();
  }
}
