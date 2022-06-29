package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to my restaurant!");
        Scanner scanner = new Scanner(System.in);
        boolean runValue = true;

        Restaurant restaurant = new Restaurant();

        while (runValue) {
            int userChoice = checker(scanner);
            if (userChoice != 3) {
                switch (userChoice) {
                    case 1:
                        restaurant.checkIn();
                        break;
                    case 2:
                        restaurant.checkOut();
                        break;
                    
                }
            } else {
                runValue = false;
                System.out.println("Thanks for coming to my restaurant!");
                break;

            }
        }
    }

    public static int checker(Scanner scanner) {
        int userChoice = 0;
        System.out.println("What would you like to do?");
        System.out.println("1. Check someone in\n2. Check someone out\n3. Exit");
        String sampleString = scanner.next();
        userChoice = getInput(sampleString);
        return userChoice;

    }

    private static int getInput(String sampleString) {
        try {
            return Integer.parseInt(sampleString);
        } catch (Exception e) {

            return 3;
        }
    }
}
