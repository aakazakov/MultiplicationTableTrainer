package com.myproject.multiplicationtrainer.fxcontrollers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController implements Initializable {
  @FXML
  private Label lblScoreRight;
  @FXML
  private Label lblScoreWrong;
  @FXML
  private TextField tfScoreRight;
  @FXML
  private TextField tfScoreWrong;
  
  @FXML
  private void exitAction() {
    System.exit(0);
  }

  @Override
  public void initialize(URL location, ResourceBundle resources) {
    lblScoreRight.setText("Right");
    lblScoreWrong.setText("Wrong");
    tfScoreRight.setText("0");
    tfScoreRight.setEditable(false);
    tfScoreWrong.setText("0");
    tfScoreWrong.setEditable(false);
  }
}
