package com.dci.spring.examples.exercise2.samples;


import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;


public class ValueInj implements ValueInjection {
  @Value("${value.example.text}")
  private String text;

  @Value("${value.example.boolean}")
  private Boolean bool;

  @Value("${value.example.int}")
  private Integer anInt;

  @Value("${value.example.long}")
  private Long aLong;


  @Override
  public String getText() {
    return text;
  }

  @Override
  public Boolean getBool(){
  return bool;
}

  @Override
  public Integer getInt(){
  return anInt;
}

  @Override
  public Long getLong(){
  return aLong;
}


  @PostConstruct
  public void postConstruct() {
    System.out.println();
    System.out.println("============================");
    System.out.println("Text value: " + getText());
    System.out.println("Boolean value: " + getBool());
    System.out.println("Int value: " + getInt());
    System.out.println("Long value: " + getLong());
    System.out.println("============================");
    System.out.println();
  }
}


