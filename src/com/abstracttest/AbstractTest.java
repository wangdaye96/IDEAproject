package com.abstracttest;

/**
 * @author wangdaye996
 * @createtime 2021/1/9 - 15:17
 *
 * abstract :抽象的、修饰类、方法
 *
 * 修饰类: 抽象类-->不能被实例化
 *              >类中一定有构造器,供子类调用
 *              >开发中，都会提供抽象类的子类，让子类对象实例化，完成相关操作
 *
 * 修饰方法: 抽象方法
 *              >只声明方法，没有方法体
 *              >包含抽象方法的类，一定是抽象类，反之，抽象类中可以没有抽象方法
 *              >若子类重写父类所有的抽象方法后，此子类方可实例化
 *              >若没有重写父类中所有的抽象方法，则此子类也是一个抽象类，需要用abstract修饰
 *
 * 使用上的注意点:
 *              >不能修饰属性，构造器等结构
 *              >不能修饰私有方法，静态方法，final的方法，final的类
 */
public class AbstractTest {
    public static void main(String[] args) {
        //匿名子类
        Person p=new Person() {
            @Override
            public void walk() {

            }
        };

//        Person p = new Person();
//        p.eat();
    }
}

//不能实例化
abstract class Person{
    String name;
    int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("人都要吃饭");
    }

    //抽象方法：没有方法体
    public abstract void walk();
}

class Student extends Person{
    public Student(String name,int age){
        super(name,age);
    }

    @Override
    public void walk() {
        System.out.println("走路上学");
    }
}