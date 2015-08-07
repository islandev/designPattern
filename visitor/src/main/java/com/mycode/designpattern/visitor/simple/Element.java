package com.mycode.designpattern.visitor.simple;

/**
 * Created by benwang on 15-7-31.
 */
abstract  public class Element {

    /**
     * 受访问者的访问
     * @param visitor
     */
    public  abstract  void accept(Visitor visitor);
}
