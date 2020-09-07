package com.myproject.multiplicationtrainer.fxcontrollers;

import java.net.URL;
import java.util.ResourceBundle;

import com.myproject.multiplicationtrainer.interfaces.GUIListener;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController implements Initializable {
  
  private final String rightLabel = "Right:";
  private final String wrongLabel = "Wrong:";
  private final String rightStyle = "-fx-text-inner-color: darkblue;";
  private final String wrongStyle = "-fx-text-inner-color: red;";
      
  private int rightScore;
  private int wrongScore;
  private GUIListener listener;
  
  @FXML
  public Label lblRightScore;
  @FXML
  public Label lblWrongScore;
  @FXML
  public TextField tfRightScore;
  @FXML
  public TextField tfWrongScore;
  @FXML
  public TextField tfExpression;
  @FXML
  public TextField tfAnswer;
  
  public MainController(GUIListener listener) {
    this();
    this.listener = listener;
  }
  
  public MainController() {
    this.rightScore = 0;
    this.wrongScore = 0;
  }
  
  public void exitAction() {
    System.exit(0);
  }

  @Override
  public void initialize(URL location, ResourceBundle resources) {
    lblRightScore.setText(rightLabel);
    tfRightScore.setText("0");
    tfRightScore.setEditable(false);
    
    lblWrongScore.setText(wrongLabel);
    tfWrongScore.setText("0");
    tfWrongScore.setEditable(false);
    
    tfExpression.setText(getTask());
    tfExpression.setEditable(false);
  }
  
  private String getTask() {
    return listener.getTask();
  }
  
  public void checkAction() {
    Integer answer = getIntValueFromAnswerField();
    if (answer != null) {
      boolean verified = listener.check(answer);
      if (verified) {
        rightScore++;
        tfRightScore.setText(intToString(rightScore));
        tfAnswer.setStyle(rightStyle);
        tfAnswer.clear();
        tfExpression.setText(getTask());
      } else {
        wrongScore++;
        tfWrongScore.setText(intToString(wrongScore));
        tfAnswer.setStyle(wrongStyle);
      }    
    }
  }
  
  private Integer getIntValueFromAnswerField() {
    String answer = tfAnswer.getText().trim();
    if (answer.matches("([0-9]+)")) {
      return Integer.parseInt(answer);
    }
    return null;
  }
  
  private String intToString(int i) {
    return i + "";
  }
  
  public void resetAllAction() {
    resetScoreAction();
    tfAnswer.setStyle(rightStyle);
    tfAnswer.clear();
    tfExpression.setText(getTask());
  }
  
  public void resetScoreAction() {
    rightScore = 0;
    wrongScore = 0;
    tfRightScore.setText("0");
    tfWrongScore.setText("0");
  }
}
