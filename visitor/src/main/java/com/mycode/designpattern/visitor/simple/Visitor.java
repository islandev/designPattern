package com.mycode.designpattern.visitor.simple;

/**
 * Created by benwang on 15-7-31.
 */
public interface Visitor {
    /**
     * 访问元素A.相当于给元素A添加访问者的功能
     * @param elementA 元素A的对象
     */
    public  void visitConcreteElementA(ConcreteElementA elementA);

    /**
     * 访问元素B,相当于给元素B添加访问者的功能
     * @param elementB
     */
    public  void visitConcreteElemantB(ConcreteElementB elementB);
}
