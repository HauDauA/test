package demo;

public class MainThread {
    private String name;
    private int age;
    private String address;
    private String gmail;
    int gender;
    double salary;

    public MainThread(String name, int age, String address, String gmail, int gender, double salary) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.gmail = gmail;
        this.gender = gender;
        this.salary = salary;
    }

    public void sayHello(){
        System.out.println("Hello World");
    }
    public int congHaiSo(int a, int b){
        int c=a+b;
        return c;
    }
    public void introduce(){
        System.out.println("Xin chao toi la "+name+"toi"+age+"tuoi gioi tinh"+(gender==1?"nam":(gender==2?"nu":"khac")));
        this.showSalary();
    }
    public void showSalary() {
        if (salary > 1000 && salary < 10000) {
            System.out.println("LLuong anh du song");
        } else if (salary > 10000) {
            System.out.println("Anh lam gi co luong");
        } else if (salary > 100 && salary < 1000) {
            System.out.println("Luong anh may chuc");
        } else if (salary < 100) {
            System.out.println("Luong anh duoi 1 ti");
        } else {
            System.out.println("Luong anh phu thuoc bo anh");
        }
        ;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
