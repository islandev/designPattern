package com.mycode.designpattern.visitor.advance;



/**
 * Created by benwang on 15-7-31.
 */
public class PersonalCustomer extends  Customer {
    private  String tel;
    private  String age;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getTel() {

        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitPersonalCustomer(this);
    }
}
