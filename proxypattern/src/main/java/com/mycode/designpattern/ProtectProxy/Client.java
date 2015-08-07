package com.mycode.designpattern.ProtectProxy;

/**
 * Created by benwang on 15-8-7.
 */
public class Client {

    public  static  void main(String[] args){
        Order order=new Order("shejimoshi",100,"ben");

        DynamicProxy dynamicProxy=new DynamicProxy();

        OrderApi orderApi=dynamicProxy.getProxyInterface(order);

        orderApi.setOrderNum(123,"orris");
        System.out.println(orderApi.getOrderNum("ben"));

        orderApi.setOrderNum(163, "ben");

        System.out.println(orderApi.getOrderNum("ben"));
    }
}
