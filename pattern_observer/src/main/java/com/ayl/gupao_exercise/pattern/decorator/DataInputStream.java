package com.ayl.gupao_exercise.pattern.decorator;

/**
 * @author AYL    3/18/2018 2:39 AM
 */
public class DataInputStream extends InputStream {

    private InputStream in;

    public DataInputStream(InputStream in) {
        this.in = in;
    }

    public void read(int data){

        in.read(int2ByteArray(data));
    }

    //默认大端模式存储
    byte[] int2ByteArray(int data){
        byte[] bytes = new byte[4];
        for(int i = 3; i>= 0; i--){
            bytes[i] = (byte)(data  & 0x000000ff);
            data = data >> 8;
        }
        return bytes;
    }

}
