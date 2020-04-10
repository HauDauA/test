package demo;


import java.util.ArrayList;
import java.util.Scanner;

public class demo1 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Game> listGame = new ArrayList();
            while (true) {
            Game game = getGameInformationFromCOnsole();
            listGame.add(game);
            System.out.println("Continue?(y/n)");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("n")) {
                System.out.println("Goodbye");
                break;
            }
        }
        printListGame(listGame);
    }

    private static Game getGameInformationFromCOnsole() {
        System.out.println("Enter Game");
        Game currentGame = new Game();
        System.out.println("Nhap ten game");
        currentGame.setName(scanner.nextLine());
        System.out.println("Nhap Id");
        currentGame.setId(scanner.nextLine());
        System.out.println("Nam san xuat:");
        currentGame.setAge(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Gia tri:");
        currentGame.setMoney(scanner.nextDouble());
        scanner.nextLine();
        System.out.println("Gia tri:");
        currentGame.setGender(scanner.nextInt());
        scanner.nextLine();

        return currentGame;

    }

    private static void printListGame(ArrayList<Game> listGame) {
        System.out.println("Danh sach game:");
        for (int i = 0; i < listGame.size(); i++) {
            Game currentGame = listGame.get(i);
            System.out.println("Code" + currentGame.getName());
            System.out.println("Id" + currentGame.getId());
        }
        System.out.println("---------------------Danh sách Games---------------------");
        System.out.println(String.format(
                "%5s %5s %5s|%5s %7s %5s|%5s %5s %5s|%5s %5s %5s %5s",
                "", "code", "",
                "", "Name", "",
                "", "Price", "",
                "", "PublicBy", "",
                "", "PublicDate", ""
        ));
        for (int i = 0; i < listGame.size(); i++) {
            Game currentGame = listGame.get(i);
            System.out.println(String.format(
                    "%5s %5s %5s|%5s %7s %5s|%5s %5s %5s|%5s %5s %5s %5s",
                    "", currentGame.getId(), "",
                    "", currentGame.getName(), "",
                    "", currentGame.getGender(), "",
                    "", currentGame.getAge(), "",
                    "", currentGame.getMoney(), ""
            ));
        }
    }

}
