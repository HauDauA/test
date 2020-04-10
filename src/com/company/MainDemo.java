package com.company;

import demo.Bird;
import demo.Cat;
import demo.Dog;

public class MainDemo {
    public static void main(String[] args) {
        Dog dogcho1=new Dog();
        dogcho1.setAge("15");
        dogcho1.setColor("white");
        dogcho1.setGender(1);
        dogcho1.setTypeDog("huskky");


        Cat catmeo = new Cat();
        catmeo.setColor("Black");
        catmeo.setAge("12");
        catmeo.setGender(1);
        catmeo.setTypeCat("VietNam");

        Bird birdchim=new Bird();
        birdchim.setBirdType("bayy");
        birdchim.setAge("1");
        birdchim.setColor("blue");
        birdchim.setGender(1);

        dogcho1.introduce();
        birdchim.introduce();
        catmeo.introduce();
        dogcho1.speak();
        catmeo.speak();
        birdchim.speak();

    }
}
