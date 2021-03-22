package com.kuang.pojo;

public class UserT {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserT(){
        System.out.println("userT的无参构造");
    }

    public UserT(String name){
        System.out.println("userT的有参构造=" + name);
    }

    public void show(){
        System.out.println("name= " + name);
    }
}
