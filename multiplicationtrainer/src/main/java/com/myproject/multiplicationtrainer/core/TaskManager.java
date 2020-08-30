package com.myproject.multiplicationtrainer.core;

import com.myproject.multiplicationtrainer.interfaces.GUIListener;

public class TaskManager implements GUIListener {

  @Override
  public String getTask() {
    return "22 x 22";
  }

  @Override
  public boolean check(int answer) {
    return true;
  }

}
