package com.mycode.designpattern.visitor.advance;

/**
 * Created by benwang on 15-7-31.
 */
public class jdklsVisitor implements Visitor{
    @Override
    public void visitPersonalCustomer(PersonalCustomer pc) {
        System.out.println("hey  man");
    }

    @Override
    public void visitEnterpriseCustomer(EnterpriseCustomer ec) {
        System.out.println("hey  man11");
    }
}
