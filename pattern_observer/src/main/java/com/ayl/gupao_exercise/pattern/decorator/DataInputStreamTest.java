package com.ayl.gupao_exercise.pattern.decorator;

import org.junit.jupiter.api.Test;

/**
 * @author AYL    3/18/2018 2:59 AM
 */
public class DataInputStreamTest {

    @org.junit.Test
    public void testRead(){
        InputStream is = new InputStream();
        DataInputStream dis = new DataInputStream(is);
        dis.read(7896542);
    }

}
