package com.mycode.designpattern.visitor.advance;

/**
 * Created by benwang on 15-7-31.
 */
public class ServiceRequstVisitor implements  Visitor {
    @Override
    public void visitPersonalCustomer(PersonalCustomer pc) {
        System.out.println(pc.getName()+"个人用户发来请求");
    }

    @Override
    public void visitEnterpriseCustomer(EnterpriseCustomer ec) {
        System.out.println(ec.getName()+"服务器用户发来请求");
    }
}
