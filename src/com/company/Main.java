package com.company;

import demo.Game;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in) ;
        ArrayList<Game>listGame=new ArrayList();
//        while (true){
//            System.out.println("Nhap thong tin net");
//            Game game01=new Game();
//            System.out.println("Nhap name:");
//            game01.setName(scanner.nextLine());
//            System.out.println("Nhap id");
//            game01.setId(scanner.nextLine());
//            System.out.println("Nhap tuoi");
//            game01.setAge(scanner.nextInt());
//            scanner.nextLine();
//            System.out.println("Nhap gioi tinh:");
//            game01.setGender(scanner.nextInt());
//            scanner.nextLine();
//            System.out.println(game01.toString());
//            System.out.println("Continue?(y/n)");
//            String choice=scanner.nextLine();
//            if(choice.equalsIgnoreCase("n")){
//                System.out.println("Goodbye");
//                break;
//            }
        Game game03=new Game();
        game03.setName("lol");
        game03.setAge(12);
        game03.setId("Riot");
        game03.setGender(1);
        game03.setMoney(0);
        listGame.add(game03);
        Game game01=new Game();
        game01.setMoney(1);
        game01.setName("tft");
        game01.setId("123");
        game01.setAge(1);
        game01.setGender(2);
        listGame.add(game01);
        Game game02=new Game();
        game02.setGender(1);
        game02.setAge(12);
        game02.setId("na1");
        game02.setName("td");
        game02.setMoney(10);
        listGame.add(game02);
        System.out.println(listGame.size());
        System.out.println("Danh sach Game");
        for (int i = 0; i < listGame.size(); i++) {
            Game currentGame=listGame.get(i);
            System.out.println("code"+currentGame.getId());
            System.out.println("name"+currentGame.getName());
        }
       }


}
