package exercise2;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = user_input.nextInt();

        switch (number){

            case 1 :{
               System.out.print("Day of week:Monday");
                break;
            }
            case 2:{
                System.out.print("Day of week:Tuesday");
                break;
            }
            case 3:{
                System.out.print("Day of week:Wednesday");
                break;
            }
            case 4:{
                System.out.print("Day of week:Thursday");
                break;
            }
            case 5:{
                System.out.print("Day of week:Friday");
                break;
            }
            case 6:{
                System.out.print("Day of week:Saturday");
                break;
            }
            case 7:{
                System.out.print("Day of week:Sunday");
                break;
            }
            default: System.out.print("Invalid day");
        }

    }

}
