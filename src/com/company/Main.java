package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer attempt = 0;

        System.out.println("Choose a password");
        String password = scanner.nextLine();

        System.out.println("Your password is saved.");

        System.out.println("\nEnter password to login.");

        while (true) {

            if (attempt == 3) {
                System.out.println("3 attempt were made, your account has been locked.");
                break;
            }

            String userInput = scanner.nextLine();

            if (userInput.equals(password)) {
                System.out.println("Login attempt successful.");
                break;
            }

            System.out.println("Password was wrong, please try again.");
            attempt++;
        }
    }
}
