package com.polymorphic;

/**
 * @author wangdaye996
 * @createtime 2021/1/5 - 18:18
 */
public class Master {
    //领养宠物
    public Pet getPet(String type){
        Pet pet=null;
        if ("dog".equals(type)) {
            pet=new Dog();
            pet.setName("二哈");
            pet.setHealthy(50);
            pet.setAge(5);
        }else if ("cat".equals(type)){
            pet=new Cat();
            pet.setName("大花猫");
            pet.setHealthy(80);
            pet.setAge(6);
        }
        return pet;
    }
    //带宠物去医院
    public void toHospital(Pet pet){
        pet.toHospital();
        if(pet.getHealthy()<60){
            System.out.println("宠物生病了，直接治疗");
            pet.setHealthy(100);
            System.out.println("治疗完成，你的宠物现在变健康了");
        }else{
            System.out.println("宠物现在很健康,不需要治疗");
        }
    }
    //带宠物玩耍
    public void playWithPet(Pet pet){
        System.out.println("带宠物去玩耍");
        if (pet instanceof Dog){
            Dog dog=(Dog)pet;
            dog.play();
        }else if (pet instanceof Cat){
            Cat cat=(Cat)pet;
            cat.play();
        }
    }
}
