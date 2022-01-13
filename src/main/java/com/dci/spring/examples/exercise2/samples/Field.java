package com.dci.spring.examples.exercise2.samples;

public class Field implements FieldInjected {

  public String textField = "I was injected in the Field!";

  @Override
  public String text(){
    return this.textField;

  }
}
