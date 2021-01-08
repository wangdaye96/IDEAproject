package com.block;

/**
 * @author wangdaye996
 * @createtime 2021/1/8 - 19:35
 * 代码块:1、作用：初始化类、对象
 *       2、修饰符只能用static
 *       3、静态代码块vs非静态代码块
 *
 * 静态代码块:>内部可以有输出语句
 *          >随着类的加载而执行
 *          >作用：初始化类的信息
 *          >如果一个类中定义了多个静态代码块，按照声明的先后顺序执行
 *
 * 非静态代码块:>内部可以有输出语句
 *           >随着对象的创建而执行
 *           >每创建一个对象，都会执行一次非静态代码块
 *           >作用：可以在创建对象时，对对象的属性进行初始化
 *          >如果一个类中定义了多个非静态代码块，按照声明的先后顺序执行
 */
public class BlockTest {
    public static void main(String[] args) {
        String s=Person.nation;
        Person p1=new Person();
        Person p2=new Person();

    }
}
class Person{
    private String name;
    private int age;
    static String nation="ren";

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    {
        System.out.println("非静态代码块1");
    }

    {
        System.out.println("非静态代码块2");
    }

    static {
        System.out.println("静态代码块1");
    }

    static {
        System.out.println("静态代码块2");
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}