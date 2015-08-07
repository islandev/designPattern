package com.mycode.designpattern.visitor.advance;

import com.google.common.collect.Lists;

import java.util.Collection;

/**
 * Created by benwang on 15-7-31.
 */
public class ObjectStruct {

    private Collection<Customer> col= Lists.newArrayList();

    public  void handleRequst(Visitor visitor){
        for(Customer cm:col){
            cm.accept(visitor);
        }
    }

    public  void  addElement(Customer cu){
        this.col.add(cu);
    }
}
