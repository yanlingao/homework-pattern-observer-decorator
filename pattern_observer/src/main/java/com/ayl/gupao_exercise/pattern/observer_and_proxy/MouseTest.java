package com.ayl.gupao_exercise.pattern.observer_and_proxy;


import com.ayl.gupao_exercise.pattern.observer_and_proxy.event.EventListener;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MouseTest {
    public static void main(String[] args) {
        /**
         *
         * 观察者和被观察者之间没有关系
         * 注册时才关联起来
         */
        EventListener listener = (EventListener)new MouseEventProxy().getInstance(new MouseEventCallBack());
        Mouse mouse = new Mouse(listener);
        mouse.click();

    }
}
