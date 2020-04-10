package demo;

import com.company.Animal;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Dog extends Animal {
    private String typeDog;

    public String getTypeDog() {
        return typeDog;
    }

    public void setTypeDog(String typeDog) {
        this.typeDog = typeDog;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("Loại chó là: " + this.typeDog);
    }

    @Override
    public void speak() {
        System.out.println("Gâu gâu");
    }

}
