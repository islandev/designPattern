package com.mycode.designpattern.visitor.simple;

/**
 * Created by benwang on 15-7-31.
 */
public class ConcreteElementA extends Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementA(this);

    }

    public  void OperationA(){
        System.out.println("visit A");
    }
}
