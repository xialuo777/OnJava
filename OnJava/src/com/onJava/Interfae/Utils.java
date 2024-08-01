package com.onJava.Interfae;

import org.junit.Test;

public class Utils implements Light{
    private static int i = 0;
    @Override
    public void turnOn() {
        System.out.println("turn on");
    }

    @Override
    public void turnOff() {
        System.out.println("turn off");
    }

    @Override
    public void brighten() {
        i++;
        System.out.println("当前亮度为"+i);
    }

    @Override
    public void dim() {
        i--;
        System.out.println("当前亮度为"+i);
    }
    @Test
    public void test(){
        Utils utils1 = new Utils();
        Utils utils2 = new Utils();
        System.out.println(utils1.i);
        utils1.turnOn();
        utils2.turnOn();
        utils1.brighten();   //1
        utils2.brighten();   //1
        System.out.println(utils1.i); //1
        utils2.dim();  //0
        System.out.println(utils2.i); //0
        utils2.turnOff();
        utils1.turnOff();
    }
}
