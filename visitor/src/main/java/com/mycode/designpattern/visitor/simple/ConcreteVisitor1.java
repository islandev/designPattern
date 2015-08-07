package com.mycode.designpattern.visitor.simple;

/**
 * Created by benwang on 15-7-31.
 */
public class ConcreteVisitor1 implements  Visitor {
    @Override
    public void visitConcreteElemantB(ConcreteElementB elementB) {
        elementB.Operation();
    }

    @Override
    public void visitConcreteElementA(ConcreteElementA elementA) {
        elementA.OperationA();

    }
}
