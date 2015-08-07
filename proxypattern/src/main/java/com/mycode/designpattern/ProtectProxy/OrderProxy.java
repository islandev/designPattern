package com.mycode.designpattern.ProtectProxy;

/**
 * Created by benwang on 15-8-7.
 */
public class OrderProxy implements OrderApi {

    private  Order order=null;

    public  OrderProxy(Order order){
        this.order=order;
    }

    public int getOrderNum(String orderUser) {
       return  order.getOrderNum(orderUser);
    }

    public String getProductName() {
        return null;
    }

    public void setProductName(String productName, String user) {
        if(user!=null&&user.equals(this.getOrderUser())){
            order.setProductName(productName,user);
        }else {
            System.out.println("No access");
        }
    }



    public void setOrderNum(int orderNum, String user) {
        if(user!=null&&user.equals(this.getOrderUser())){
            order.setOrderNum(orderNum,user);
        }
    }

    public String getOrderUser() {
        return null;
    }

    public void setOrderUser(String orderUser, String user) {
        if(user!=null&&user.equals(this.getOrderUser())){
            order.setOrderUser(orderUser,user);
        }
    }
}
