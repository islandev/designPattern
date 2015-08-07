package com.mycode.designpattern.ProtectProxy;

/**
 * Created by benwang on 15-8-7.
 */
public interface OrderApi {

    public  String getProductName();

    public int getOrderNum(String orderUser);

    public  void setProductName(String productName,String user);

    public void setOrderNum(int orderNum,String user);

    public String getOrderUser();

    public  void setOrderUser(String orderUser,String user);
}
