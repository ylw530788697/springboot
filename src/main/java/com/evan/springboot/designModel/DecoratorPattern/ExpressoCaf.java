package com.evan.springboot.designModel.DecoratorPattern;

public class ExpressoCaf extends Coffee {
  public ExpressoCaf(){
      super.setDescription("ExpressoCaf");
      super.setPrice(4.0f);
  }
}
