package com.ayl.gupao_exercise.pattern.observer_and_proxy;

import com.ayl.gupao_exercise.pattern.observer_and_proxy.event.EventListener;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author AYL    3/18/2018 12:11 PM
 */
public class MouseEventProxy implements InvocationHandler {
    private EventListener target;

    public Object getInstance(EventListener target){
        this.target = target;
        Class<?> clazz = target.getClass();

        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(),this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        method.invoke(target,args);
        return null;
    }
}
