package com.myproject.multiplicationtrainer.core;

import java.util.Random;

import com.myproject.multiplicationtrainer.interfaces.GUIListener;

public class TaskManager implements GUIListener {
  
  private final char multiOperator = 'x';
  private final char divOperator = ':';
  
  private int a;
  private int b;
  private int c;
  private int answer;
  private Random random;
  private boolean multiply;
  
  public TaskManager() {
    random = new Random();
    multiply = true;
    init(9);
  }

  @Override
  public String getTask() {
    if (multiply) {
      answer = c;
      multiply = false;
      return String.format("%d %c %d", a, multiOperator, b);
    }
    answer = a;
    multiply = true;
    return String.format("%d %c %d", c, divOperator, b);
  }

  @Override
  public boolean check(int answer) {
    return this.answer == answer;
  }
  
  private void init(int edge) {
    a = random.nextInt(edge - 1) + 2;
    b = random.nextInt(edge - 1) + 2;
    c = a * b;
  }
}
