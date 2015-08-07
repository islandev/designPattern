package com.mycode.designpattern.ProtectProxy;

/**
 * Created by benwang on 15-8-7.
 */
public class Order implements OrderApi {


    //user 是操作人员
    public int getOrderNum(String orderUser) {
        return orderNum;
    }
    private String productName;

    public void setOrderUser(String orderUser, String user) {

    }

    private int orderNum;

    private String orderUser;

    public Order(String productName,int orderNum,String orderUser){
        this.productName=productName;
        this.orderNum=orderNum;
        this.orderUser=orderUser;
    }




    public String getProductName() {
        return productName;
    }


    public void setProductName(String productName,String user) {
        this.productName=productName;

    }

    public int getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(int orderNum, String user) {
        this.orderNum=orderNum;
    }

    public String getOrderUser() {
        return orderUser;
    }

    public void SetOrderUser(String orderUser, String user) {
        this.orderUser=orderUser;
    }
}
