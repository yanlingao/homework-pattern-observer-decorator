package com.ayl.gupao_exercise.pattern.observer_and_proxy;

import com.ayl.gupao_exercise.pattern.observer_and_proxy.event.EventListener;

/**
 * 观察者
 *
 * 回调响应，实现自己的逻辑
 */
public class MouseEventCallBack implements EventListener {
    public void on_click(){
        System.out.println("==========Mouse click event triggered.==========");
        System.out.println("please start your click show.");
    }

    public void on_doubleClick(){
        System.out.println("================mouse double click event triggered.============");
        System.out.println("please start your double click show.");

    }

    public void on_wheel(){
        System.out.println("================mouse wheel event triggered.============");
        System.out.println("please start your wheel show.");
    }
}
