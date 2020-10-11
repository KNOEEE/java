package com.springboot.chapter4.intercept;

import org.aopalliance.intercept.Invocation;


/**
 * @author KNOE
 * @date 2020-09-24 21:01
 */
public interface Interceptor {
    public boolean before();
    public void after();
    public Object around(Invocation invocation)
            throws Throwable;
    public void  afterReturning();
    public void afterThrowing();
    boolean useAround();
}
