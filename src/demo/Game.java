package demo;

public class Game {
    private String id;
    private String name;
    private int age;
    private int gender;
    private double money;
    public Game(String id,String name,int age,int gender,double money){
        this.id=id;
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.money=money;
    }
    public Game(){}

    @Override
    public String toString() {
        return "Game{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + (gender==1?"nam":(gender==2?"Nu":"khac")) +
                ", money=" + money +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
