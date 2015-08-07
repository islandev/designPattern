package com.mycode.designpattern.visitor.advance;

/**
 * Created by benwang on 15-7-31.
 */
public class PredilectionAnalyzaVisitor implements Visitor {
    @Override
    public void visitPersonalCustomer(PersonalCustomer pc) {
        System.out.println("现在对个人用户"+pc.getName()+"进行偏好分析");
    }

    @Override
    public void visitEnterpriseCustomer(EnterpriseCustomer ec) {
        System.out.println("现在对企业用户"+ec.getName()+"进行偏好分析");
    }
}
