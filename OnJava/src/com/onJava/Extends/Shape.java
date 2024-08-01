package com.onJava.Extends;

import org.junit.Assert;
import org.junit.Test;

public class Shape {
    private String Color;
    private String name;


    public Shape() {
    }



    /**
     * 获取
     * @return Color
     */
    public String getColor() {
        return Color;
    }

    /**
     * 设置
     * @param Color
     */
    public void setColor(String Color) {
        this.Color = Color;
    }

    public String toString() {
        return "Shape{Color = " + Color + "}";
    }



    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    public void draw() {
        System.out.println("Shape::draw()");
        System.out.println("draw"+this.name);
    }
    public void erase() {
        System.out.println("Shape::erase()");
        System.out.println("erase"+this.name);
    }

    public void move(int x, int y) {
        System.out.println("Shape::move()");
    }
    public void doSomething(Shape shape){
        shape.draw();
        shape.move(1,2);
        shape.erase();
    }

    @Test
    public void test() {
        Shape circle = new Shape();
        circle.setColor("red");
        circle.setName("circle");
        doSomething(circle);
        Assert.assertEquals("Shape{Color = red}", circle.toString());
    }

}
