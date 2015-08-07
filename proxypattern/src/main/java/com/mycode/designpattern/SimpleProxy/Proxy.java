package com.mycode.designpattern.SimpleProxy;

/**
 * Created by benwang on 15-8-7.
 */

/**
 * 代理对象
 */
public class Proxy implements  Subject {
    /**
     * 定义一个抽象的请求方法
     */

    private  RealSubject realSubject=null;

    /**
     * 构造方法，传入被代理的具体的目标对象
     * @param realSubject 被代理的具体对象
     */

    public  Proxy (RealSubject realSubject){
        this.realSubject=realSubject;
    }

    public void requet() {

        //在转调具体的目标对象前，可执行一些功能处理

        //转调具体的目标对象的方法
        realSubject.requet();
        //也可以执行一些功能处理


    }
}
