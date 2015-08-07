package com.mycode.designpattern.AdvanceProxy;

/**
 * Created by benwang on 15-8-7.
 */
public class Proxy implements  UserModelApi {


    private  UserModelImpl userModel=null;

    public  Proxy(UserModelImpl userModel){
        this.userModel=userModel;
    }
    private  boolean loaded=false;

    public String getUserId() {
        return null;
    }

    public void setUserId(String userId) {

    }

    public String getName() {
        return null;
    }

    public void setName(String name) {

    }
}
