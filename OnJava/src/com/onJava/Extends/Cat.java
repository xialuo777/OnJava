package com.onJava.Extends;

import org.junit.Assert;
import org.junit.Test;

public class Cat extends Animals {
    private String food;

    public Cat() {
    }

/*    public Cat(String food) {
        this.food = food;
    }*/

    /**
     * 获取
     * @return food
     */
    public String getFood() {
        return food;
    }

    /**
     * 设置
     * @param food
     */
    public void setFood(String food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "food='" + food + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Test
    public void test1(){
        Cat cat = new Cat();
        cat.setName("Tom");
        cat.setAge(2);
        cat.setSex("male");
        cat.setColor("white");
        cat.setFood("小鱼干");
        System.out.println(cat.name+"正在吃"+cat.getFood());
        Assert.assertEquals("Tom",cat.getName());

    }
}
