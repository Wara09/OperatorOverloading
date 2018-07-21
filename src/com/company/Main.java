package com.company;

public class Main {

    public static void main(String[] args) {
	Food mango=new Food();
	mango.name="Mango";
	mango.color="Yellow";
	mango.size="Big";
	mango.taste("Sweet");
	mango.like("Big");




        Food apple=new Food("Apple","Red","Medium");
        apple.name="Apple";
       apple.color="Red";
       apple.size="Medium";
        apple.taste("Sour");
        apple.like("Small");


    }
}
