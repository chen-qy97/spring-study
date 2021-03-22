package com.kuang.pojo;

public class User {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(){
        System.out.println("user的无参构造");
    }

    public User(String name){
        System.out.println("user的有参构造=" + name);
    }

    public void show(){
        System.out.println("name= " + name);
    }
}
