package demo;

import com.company.Animal;

public class Cat extends Animal {
    private String typeCat;

    public String getTypeCat() {
        return typeCat;
    }

    public void setTypeCat(String typeCat) {
        this.typeCat = typeCat;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("Loại mèo"+this.typeCat);
    }
    public void speak(){
        System.out.println("Mew");
    }
}
