package com.mycode.designpattern.ProtectProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by benwang on 15-8-7.
 */
public class DynamicProxy implements InvocationHandler {

    private  OrderApi order=null;

    public OrderApi getProxyInterface(Order order){

        this.order=order;

        OrderApi orderApi=(OrderApi) Proxy.newProxyInstance(
          order.getClass().getClassLoader(),
                order.getClass().getInterfaces(),
                this
        );
        return  orderApi;
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        if (method.getName().startsWith("set")) {

            if (order.getOrderUser() != null && order.getOrderUser().equals(args[1])) {
                //可以操作
                return method.invoke(order, args);
            } else {
                System.out.println("no access");
            }
        } else {
            return method.invoke(order, args);
        }
        return null;
    }
}
