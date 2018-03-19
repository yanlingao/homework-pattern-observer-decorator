package com.ayl.gupao_exercise.pattern.observer_and_proxy;


import com.ayl.gupao_exercise.pattern.observer_and_proxy.event.EventListener;

/**
 * 被观察者
 */
public class Mouse {
    private EventListener eventListener;

    public Mouse(EventListener eventListener) {
        this.eventListener = eventListener;
    }

    public void click(){
        System.out.println("Mouse be clicked");
        eventListener.on_click();
    }

    public void doubleClick(){
        System.out.println("Mouse be double clicked");
        eventListener.on_doubleClick();
    }

    public void wheel(){
        System.out.println("Mouse be scrolled");
        eventListener.on_wheel();
    }
}
