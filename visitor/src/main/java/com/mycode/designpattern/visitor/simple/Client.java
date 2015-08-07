package com.mycode.designpattern.visitor.simple;

/**
 * Created by benwang on 15-7-31.
 */
public class Client {
    public  static  void main(String[] args){

        ObjectStructure obs=new ObjectStructure();

        Element eleA=new ConcreteElementA();
        Element eleB=new ConcreteElementB();

        obs.addElement(eleA);
        obs.addElement(eleB);

        Visitor visitor=new ConcreteVisitor1();
        obs.handleRequst(visitor);


    }
}
