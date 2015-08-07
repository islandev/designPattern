package com.mycode.designpattern.visitor.simple;

/**
 * Created by benwang on 15-7-31.
 */
public class ConcreteElementB extends  Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElemantB(this);
    }

    public  void Operation(){
        System.out.println("visit B");
    }
}

