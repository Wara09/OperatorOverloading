package com.company;

public class Food {
    public String name;
    public String color;
    public String size;

    public Food()
    {

    }
    public Food(String name,String color,String size)
    {
        this.name=name;
        this.color=color;
        this.size=size;
    }
    public void taste(String taste)
    {
        System.out.println(name+" is "+taste);

    }

    public void like(String like)
    {
        System.out.println(name+" is "+like);
    }
}
