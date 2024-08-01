package com.onJava.Extends;

public class Animals {


    public String name;
    private int age;
    private String sex;
    private String color;

    public Animals(String name, int age, String sex, String color) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.color = color;
    }
    public Animals() {
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public void eat() {
        System.out.println(this.name+"在吃东西");
    }

    void showColor() {
        System.out.println(this.name+"的颜色是"+this.color);
    }


}
