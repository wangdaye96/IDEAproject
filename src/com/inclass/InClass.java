package com.inclass;

/**
 * @author wangdaye996
 * @createtime 2021/1/11 - 21:16
 *
 * 类的内部成员之五，内部类
 * 1、java中允许将一个类A声明在另一个类B中，则类A就是内部类，类B称为外部类
 *
 * 2、内部类的分类，成员内部类（静态、非静态）VS 局部内部类（方法内、代码块内、构造器内）
 *
 * 3、成员内部类:
 *          一方面，作为外部类的成员；
 *                   >调用外部类的结构
 *                   >可以被static修饰
 *                   >可以被4种不同的权限修饰
 *
 *          另一方面，作为一个类
 *                   >类可以定义属性，方法，构造器等
 *                   >可以被final修饰，那就不能被继承了
 *                   >可以被abstract修饰
 */
public class InClass {
    public static void main(String[] args) {
        //创建成员内部类Dog的实例（静态）
        Person.Dog dog = new Person.Dog();
        dog.show();
        //创建成员内部类Bird的实例（非静态）
        Person p=new Person();
        Person.Bird bird = p.new Bird();
        bird.sing();
        bird.display("name");
    }
}


class Person{
    private String name="小明";

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println("人吃饭");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    //静态成员内部类
    static class Dog{
        private String name="二哈";

        public Dog() {
        }

        public Dog(String name) {
            this.name = name;
        }

        public void show(){
            System.out.println("小狗跳舞");
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Dog{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    //非静态成员内部类
    class Bird{
        private String name="鹦鹉";

        public Bird() {
        }

        public Bird(String name) {
            this.name = name;
        }

        public void sing(){
            System.out.println("小鸟唱歌");
//            Person.this.eat();
        }

        public void display(String name){
            System.out.println(name);
            System.out.println(this.name);
            System.out.println(Person.this.name);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Bird{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    public void method(){
        //局部内部类
        class AA{

        }
    }
}