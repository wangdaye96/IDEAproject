package com.company;

/**
 * @author wangdaye996
 * @createtime 2021/1/8 - 16:34
 */
//static 应用举例
public class Test5 {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        Circle c3 = new Circle(2);
        System.out.println("总共有"+Circle.getTotal()+"个圆");
        System.out.println("圆"+c1.getId()+"半径\t"+c1.getRadius());
        System.out.println("圆"+c2.getId()+"半径\t"+c2.getRadius());
        System.out.println("圆"+c3.getId()+"半径\t"+c3.getRadius());
        System.out.println("圆"+c3.getId()+"半径\t"+c3.getRadius()+"\t面积\t"+c3.getArea());
    }
}
class Circle{
    private double radius;
    private int id;
    private static int init=1;
    private static int total;
    //id自动递增,总数也是
    public Circle() {
        id=init++;
        total++;
    }

    public Circle(double radius) {
        this();
        this.radius = radius;
    }

    public int getId() {
        return id;
    }

    public static int getTotal() {
        return total;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }
}