package com.mycode.designpattern.visitor.advance;



/**
 * Created by benwang on 15-7-31.
 */
abstract  public class Customer {
    private  String customID;
    private  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCustomID(String customID) {

        this.customID = customID;
    }

    public String getCustomID() {

        return customID;
    }

    public  abstract void accept(Visitor visitor);

}
