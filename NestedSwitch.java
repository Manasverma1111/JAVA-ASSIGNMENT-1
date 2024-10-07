package com.manas;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an empId from 1 to 6: ");
        int empId = input.nextInt();
        System.out.print("Enter the deptName: ");
        String deptName = input.next();

        switch (empId) {
            case 1 -> System.out.println("Iron Man");
            case 2 -> System.out.println("Thor");
            case 3 -> System.out.println("Captain America");
            case 4 -> System.out.println("Hulk");
            case 5 -> System.out.println("Black Widow");
            case 6 -> System.out.println("Dr. Strange");
            case 7 -> {
                System.out.println("Below are the depts.");
                switch (deptName) {
                    case "tech" -> System.out.println("Iron Man's dept.");
                    case "transformation" -> System.out.println("Hulk's dept.");
                    case "strength" -> System.out.println("Captain's dept.");
                    case "thunder" -> System.out.println("Thor's dept.");
                    case "magic" -> System.out.println("Dr. Strange's dept.");
                    default -> System.out.print("Unknown dept.");
                }
            }
            default -> System.out.print("Enter a valid empId from 1 to 6: ");
        }
    }
}
