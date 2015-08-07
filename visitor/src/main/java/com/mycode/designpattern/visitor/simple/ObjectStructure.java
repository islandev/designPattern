package com.mycode.designpattern.visitor.simple;

import com.google.common.collect.Lists;

import java.util.Collection;

/**
 * Created by benwang on 15-7-31.
 */
public class ObjectStructure {
    private Collection<Element> col= Lists.newArrayList();

    public  void handleRequst(Visitor visitor){
        for (Element e:col){
            e.accept(visitor);
        }
    }

    public  void addElement(Element e){
        this.col.add(e);
    }
}
