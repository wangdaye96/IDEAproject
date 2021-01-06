package com.company;

/**
 * @author wangdaye996
 * @createtime 2021/1/6 - 17:23
 */
//基本数据类型，包装类，string类型之间的转换 parsexxx(),valueOf()
public class Test2 {
    public static void main(String[] args) {
        String str1="true";
        Boolean b2=new Boolean(str1);
        boolean b3=Boolean.parseBoolean(str1);
        Boolean b1=new Boolean("true");
        String str2=String.valueOf(b1);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(str2);
    }
}
