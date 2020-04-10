package com.company;

public class Animal {
    private String name;
    private String age;
    private int gender;
    private String color;


    public void introduce() {
        System.out.println("Tên con vật là: " + this.getName() + "  Tuổi con vật là:" + this.getAge() + "  Màu con vật là: " + this.getColor());
    }


    public void speak(){
        System.out.println("Say Somethings");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
