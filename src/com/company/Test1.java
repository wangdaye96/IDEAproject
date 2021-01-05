package com.company;

import java.util.Scanner;

/**
 * @author wangdaye996
 * @createtime 2021/1/4 - 23:40
 */
public class Test1 {
    public static void main(String[] args) {
        System.out.println("请输入行和列：");
        Scanner X=new Scanner(System.in);
        int a=X.nextInt();
        int b=X.nextInt();
        for (int i = 1; i <= a; i++) {
            for (int j=1;j<=b;j++){
                if (i>1&&i<a&&j>1&&j<b){
                    System.out.printf(" ");
                }else {
                    System.out.printf("*");
                }
            }
            System.out.println();
        }
    }
}

