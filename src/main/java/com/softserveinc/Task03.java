package com.softserveinc;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TODO: Write your code here
        System.out.println("Write how many ml of water the coffee machine has:");
        System.out.print(">>> ");
        int water = scanner.nextInt();

        System.out.println("Write how many ml of milk the coffee machine has:");
        System.out.print(">>> ");
        int milk = scanner.nextInt();

        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        System.out.print(">>> ");
        int beans = scanner.nextInt();

        System.out.println("Write how many cups of coffee you will need:");
        System.out.print(">>> ");
        int wantCups = scanner.nextInt();

        int canCups = Math.min(water/200, milk/50);
        canCups = Math.min(canCups, beans/15);

        if (wantCups == canCups)
            System.out.println("Yes, I can make that amount of coffee");
            else
                if (canCups > wantCups)
                    System.out.println("Yes, I can make that amount of coffee (and even " + (canCups - wantCups) +" more than that)");
                else System.out.println("No, I can make only " + canCups + " cup(s) of coffee");
    }
}
