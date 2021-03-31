package com.kuang.entity;


import javax.annotation.Resource;

/**
 *
 */
public class People1 {

    //如果显示的定义了Autowired的required属性为false,说明这个对象可以为null,否则不允许为空
    @Resource(name = "cat2")
    private Cat1 cat1;
    @Resource
    private Dog1 dog1;
    private String name;

    public Cat1 getCat() {
        return cat1;
    }

    public Dog1 getDog() {
        return dog1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "People{" +
                "cat=" + cat1+
                ", dog=" + dog1 +
                ", name='" + name + '\'' +
                '}';
    }
}
