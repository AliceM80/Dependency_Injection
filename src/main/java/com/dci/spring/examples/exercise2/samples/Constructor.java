package com.dci.spring.examples.exercise2.samples;



public class Constructor implements ConstructorInjected {

  public String text = "I was injected in the constructor!";

  @Override
  public String text(){
    return "I was injected in the constructor!";

  }
}
