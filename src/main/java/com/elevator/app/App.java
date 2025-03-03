package com.elevator.app;

import java.util.InputMismatchException;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Elevator elevator = new Elevator();

        System.out.printf("There are %s levels on this elevator.\n", elevator.getMaxLevel());
        Scanner reader = new Scanner(System.in);
        while(true) {
            System.out.printf("What floor do you want to go to? ");
            int pushedLevel = -1;
            while(pushedLevel < 0 || pushedLevel > elevator.getMaxLevel()) {
                try {
                    pushedLevel = reader.nextInt();
                    break;
                } catch (InputMismatchException ex) {
                    System.out.println("Please enter a number.");
                }
            }
            elevator.setPushedLevel(pushedLevel);
            try {
                elevator.moveElevator();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Exit elevator? (1-yes 2-no):");
            int exitElevator = -1;
            while(exitElevator != 1 && exitElevator != 2){    
                try {
                    exitElevator = reader.nextInt();
                } catch (InputMismatchException ex) {
                    System.out.println("Please enter a number.");
                }
            }
            if (exitElevator == 1) {
                System.out.println("Goodbye!");
                break;
            }
        }
        reader.close();
    }
}
