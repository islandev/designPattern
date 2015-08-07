package com.mycode.designpattern.visitor.advance;




/**
 * Created by benwang on 15-7-31.
 */
public class EnterpriseCustomer extends Customer {

    private  String linkman;
    private  String  linkanTel;
    private  String  regAddr;

    public String getLinkanTel() {
        return linkanTel;
    }

    public void setLinkanTel(String linkanTel) {
        this.linkanTel = linkanTel;
    }

    public String getRegAddr() {

        return regAddr;
    }

    public void setRegAddr(String regAddr) {
        this.regAddr = regAddr;
    }

    public String getLinkman() {

        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitEnterpriseCustomer(this);
    }
}
