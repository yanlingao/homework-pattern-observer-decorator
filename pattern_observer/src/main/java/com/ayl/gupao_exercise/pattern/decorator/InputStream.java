package com.ayl.gupao_exercise.pattern.decorator;

/**
 * @author AYL    3/18/2018 2:21 AM
 */
public class InputStream {
    public void read(byte[] data){
        System.out.println("====" + String.format("read byte data.") + "====");
        for(byte item : data){
            System.out.println(item);
        }
    }
}
