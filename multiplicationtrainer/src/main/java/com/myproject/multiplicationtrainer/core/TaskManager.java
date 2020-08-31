package com.myproject.multiplicationtrainer.core;

import java.util.Random;

import com.myproject.multiplicationtrainer.interfaces.GUIListener;

public class TaskManager implements GUIListener {
  
  private final char multOperator = 'x';
  private final char divOperator = ':';
  private final int edge = 9;
  
  private int a;
  private int b;
  private int c;
  private int answer;
  private Random random;
  private boolean multiply;
  
  public TaskManager() {
    random = new Random();
    multiply = true;
  }

  @Override
  public String getTask() {
    initVariables(edge);
    if (multiply) {
      answer = c;
      multiply = false;
      return String.format("%d %c %d", a, multOperator, b);
    }
    answer = a;
    multiply = true;
    return String.format("%d %c %d", c, divOperator, b);
  }

  @Override
  public boolean check(int answer) {
    return this.answer == answer;
  }
  
  private void initVariables(int edge) {
    a = random.nextInt(edge - 1) + 2;
    b = random.nextInt(edge - 1) + 2;
    c = a * b;
  }
}
