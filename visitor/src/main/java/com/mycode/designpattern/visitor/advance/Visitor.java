package com.mycode.designpattern.visitor.advance;

/**
 * Created by benwang on 15-7-31.
 */
public interface Visitor {

    public  void visitEnterpriseCustomer(EnterpriseCustomer ec);
    public  void visitPersonalCustomer(PersonalCustomer pc);

}
