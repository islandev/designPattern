package com.mycode.designpattern.visitor.advance;

/**
 * Created by benwang on 15-7-31.
 */
public class Client{
    public  static  void main(String[] args){

        ObjectStruct os=new ObjectStruct();
        Customer em=new EnterpriseCustomer();
        em.setName("ben");
        os.addElement(em);

        Customer pm=new PersonalCustomer();
        pm.setName("orris");
        os.addElement(pm);

        ServiceRequstVisitor srVisitor=new ServiceRequstVisitor();
        os.handleRequst(srVisitor);

        PredilectionAnalyzaVisitor prVisitor= new PredilectionAnalyzaVisitor();
        os.handleRequst(prVisitor);
        jdklsVisitor jkd=new jdklsVisitor();
        os.handleRequst(jkd);
    }
}
