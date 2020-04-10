package demo;

import java.util.Scanner;

public class MainThreademo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap phan tu mang :");
        int size=scanner.nextInt();
        scanner.nextLine();
        String[] names=new String[size];
        for(int i=0;i<names.length;i++){
            System.out.println("Nhap phan tu so "+i+":");
            names[i]=scanner.nextLine();
        }
        for (int i = 0; i <names.length ; i++) {
            System.out.println(names[i]);

        }

    }
}
