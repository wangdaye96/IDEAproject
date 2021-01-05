package com.polymorphic;

/**
 * @author wangdaye996
 * @createtime 2021/1/5 - 18:15
 */
public class Pet {
    private String name;
    private int healthy;
    private int age;

    public Pet(String name, int healthy, int age) {
        this.name = name;
        this.healthy = healthy;
        this.age = age;
    }

    public Pet() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthy() {
        return healthy;
    }

    public void setHealthy(int healthy) {
        this.healthy = healthy;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void toHospital(){
        System.out.println("带宠物去医院做体检");
    }

    @Override
    public String toString() {
        return "宠物信息{" +
                "name='" + name + '\'' +
                ", healthy=" + healthy +
                ", age=" + age +
                '}';
    }
}
