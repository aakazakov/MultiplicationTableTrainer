package com.myproject.multiplicationtrainer.fxcontrollers;

import java.net.URL;
import java.util.ResourceBundle;

import com.myproject.multiplicationtrainer.interfaces.GUIListener;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController implements Initializable {
  
  private GUIListener listener;
  
  @FXML
  private Label lblScoreRight;
  @FXML
  private Label lblScoreWrong;
  @FXML
  private TextField tfScoreRight;
  @FXML
  private TextField tfScoreWrong;
  @FXML
  private TextField tfExpression;
  
  public MainController(GUIListener listener) {
    this.listener = listener;
  }
  
  public MainController() { }
  
  @FXML
  private void exitAction() {
    System.exit(0);
  }

  @Override
  public void initialize(URL location, ResourceBundle resources) {
    lblScoreRight.setText("Right:");
    tfScoreRight.setText("0");
    tfScoreRight.setEditable(false);
    
    lblScoreWrong.setText("Wrong:");
    tfScoreWrong.setText("0");
    tfScoreWrong.setEditable(false);
    
    tfExpression.setEditable(false);
    
    initTask();
    check();
  }
  
  private void initTask() {
    String task = listener.getTask();
    System.out.println(task);
  }
  
  private void check() {
    boolean ok = listener.check(1);
    System.out.println(ok);
  }
  
}
