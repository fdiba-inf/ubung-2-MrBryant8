package exercise2;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = user_input.nextInt();

        switch (number) {
            case 1 -> System.out.print("Day of week:Monday");
            case 2 -> System.out.print("Day of week:Tuesday");
            case 3 -> System.out.print("Day of week:Wednesday");
            case 4 -> System.out.print("Day of week:Thursday");
            case 5 -> System.out.print("Day of week:Friday");
            case 6 -> System.out.print("Day of week:Saturday");
            case 7 -> System.out.print("Day of week:Sunday");
            default -> System.out.print("Day of week:Invalid day");
        }

    }

}
