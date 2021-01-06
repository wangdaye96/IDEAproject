package com.company;

import org.junit.Test;

/**
 * @author wangdaye996
 * @createtime 2021/1/6 - 17:35
 * 面试题
 */
public class Test3 {

    @Test
    public void Test1(){
        Object o1=true?new Integer(1):new Double(2.0);
        System.out.println(o1);// 1.0
    }

    @Test
    public void Test2(){
        Object o2;
        if (true){
            o2=new Integer(1);
        }else {
            o2=new Double(2.0);
        }
        System.out.println(o2);// 1
    }

    @Test
    public void Test4(){
        Integer i=new Integer(1);
        Integer j=new Integer(1);
        System.out.println(i==j);//false
        Integer o = new Integer(3);//ctrl+alt+v
        Integer m=1;
        Integer n=1;
        System.out.println(m==n);//true

        Integer l=128;//范围超过了 new了一个Integer(128)
        Integer k=128;//范围超过了 new了一个Integer(128)
        System.out.println(l==k);//false

    }

}
