package demo;

import com.company.Animal;

public class Bird extends Animal {
    private String birdType;

    public String getBirdType() {
        return birdType;
    }

    public void setBirdType(String birdType) {
        this.birdType = birdType;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("Loại chim là :"+this.birdType);
    }

    public void speak(){
        System.out.println("cuccu");
    }
}
