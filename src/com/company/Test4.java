package com.company;

/**
 * @author wangdaye996
 * @createtime 2021/1/8 - 15:35
 */
public class Test4 {
    //类变量与实例变量      static
    public static void main(String[] args) {
//        Chinese.nation="中国";
//
//        Chinese c1 = new Chinese();
//        c1.name="王大大";
//        c1.age=18;
//        System.out.println(c1.nation);
//        c1.nation="cn";
//        Chinese c2 = new Chinese();
//        c2.name="王大爷";
//        c2.age=65;
//        System.out.println(c2.nation);
          Person.nation="中国";
        Person p1 = new Person();
        p1.setSex('男');
        p1.setName("王答案");
        p1.setAge(18);
//        p1.nation="cn";

        Person p2 = new Person();
        p2.setSex('男');
        p2.setName("王案");
        p2.setAge(19);

        System.out.println(p2.nation);

    }
}

class Chinese{
    String name;
    int age;
    static String nation;
}