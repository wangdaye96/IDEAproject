package com.bankAccount;

/**
 * @author wangdaye996
 * @createtime 2021/1/8 - 17:01
 */
//体验static应用
public class AccountTest {
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.setUserPassword(123456);
        a1.setBalance(0.5);
        System.out.println(a1);
        Account a2 = new Account();
        a2.setUserPassword(456789);
        a2.setBalance(10000);
        System.out.println(a2);
        Account a3 = new Account(159357);
        a3.setBalance(5000);
        System.out.println(a3);
    }
}
