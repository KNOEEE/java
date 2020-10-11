package com.springboot.chapter4.intercept;

import org.aopalliance.intercept.Invocation;

import java.lang.reflect.InvocationTargetException;

/**
 * @author KNOE
 * @date 2020-09-24 21:04
 */
public class MyInterceptor implements Interceptor{
    @Override
    public boolean before() {
        System.out.println("before");
        return true;
    }

    @Override
    public boolean useAround() {
        return true;
    }

    @Override
    public void after() {
        System.out.println("after");
    }
    @Override
    public Object around(Invocation invocation)
            throws Throwable {
        System.out.println("around before...");
        Object obj = invocation.proceed();
        System.out.println("around after...");
        return obj;
    }

    @Override
    public void afterReturning() {
        System.out.println("after returning...");
    }
    @Override
    public void afterThrowing() {
        System.out.println("afterThrowing...");
    }
}
