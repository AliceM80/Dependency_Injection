package com.dci.spring.examples.exercise2.samples;

import org.springframework.stereotype.Component;



  public class Setter implements SetterInjected {

    public String textSet = "I was injected by the setter!";

    @Override
    public String text(){
      return this.textSet;

    }
  }
