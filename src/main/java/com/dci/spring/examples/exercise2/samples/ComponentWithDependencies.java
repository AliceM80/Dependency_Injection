package com.dci.spring.examples.exercise2.samples;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;


public class ComponentWithDependencies {

private ConstructorInjected constructorInjected;
private SetterInjected setterInjected;

@Autowired
private FieldInjected fieldInjected;


public ComponentWithDependencies(ConstructorInjected constructorInjected) {
  this.constructorInjected = constructorInjected;
}


@Autowired
public void setSetterInjected(SetterInjected setterInjected){
  this.setterInjected = setterInjected;
}

  //@PostConstruct is not a Spring annotation, but a Java EE annotation.
  // It is recognized by Spring though, and Spring calls methods annotated with @PostConstruct only once,
  // just after the initialization of bean properties.

  @PostConstruct
  public void postConstruct() {
   //constructor.message1();
   //setter.message2();
    System.out.println();
    System.out.println("============================");
    System.out.println(constructorInjected.text());
    System.out.println(setterInjected.text());
    System.out.println(fieldInjected.text());
    System.out.println("============================");
    System.out.println();
  }
}
