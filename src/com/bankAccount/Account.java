package com.bankAccount;

/**
 * @author wangdaye996
 * @createtime 2021/1/8 - 17:01
 */
public class Account {
    private int userId;
    private int userPassword=000000;
    private double balance;

    private static double rate=0.01;
    private static double minBalance=1.0;
    private static int initId=1001;

    public Account() {
        userId=initId++;
    }

    public Account(int userPassword) {
        this();
        this.userPassword = userPassword;
    }

    public int getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(int userPassword) {
        this.userPassword = userPassword;
    }

    public int getUserId() {
        return userId;
    }

    public double getBalance() {
        return balance;
    }

    public static double getRate() {
        return rate;
    }

    public static double getMinBalance() {
        return minBalance;
    }

    public void setBalance(double balance) {
        if (balance<getMinBalance()){
            System.out.println("你存的钱太少了，不给存");
        }else {
            this.balance = balance;
            System.out.println("存钱成功，我亲爱的客户^_^");
        }
    }

    @Override
    public String toString() {
        return "账户信息{" +
                "账号=" + userId +
                ", 密码=" + userPassword  +
                ", 余额=" + balance +
                ", 利率="+getRate()+
                '}';
    }
}
