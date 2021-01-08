package com.polymorphic;

import java.util.Scanner;

/**
 * @author wangdaye996
 * @createtime 2021/1/5 - 18:18
 */
//多态练习
//对象的多态性:父类的引用指向子类的对象
//虚拟方法调用:编译期：调用父类方法，运行期：调用子类重写的父类方法
public class Test {
    public static void main(String[] args) {
        Master xiaoming= new Master();
        System.out.println("请输入你需要领养的宠物 dog/cat:");
        Scanner input=new Scanner(System.in);
        String type=input.nextLine();
        Pet pet=xiaoming.getPet(type);
        System.out.println("你已成功领养！！");
        System.out.println(pet.toString());
        xiaoming.toHospital(pet);
        System.out.println(pet.toString());
        xiaoming.playWithPet(pet);
    }
}
