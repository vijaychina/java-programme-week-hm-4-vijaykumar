package Programme_week_8;
/**
 * Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:
 * (1*1*1)=1
 * (5*5*5)=125
 * (3*3*3)=27
 * So:
 * 1+125+27=153
 */

import java.util.Scanner;
public class Programme_10_ArmstrongNumbur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");

        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();

            if (isArmstrongNumber(number)) {
                System.out.println(number + " is an Armstrong number.");
            } else {
                System.out.println(number + " is not an Armstrong number.");
            }
        } else {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
      // scannar close
        scanner.close();
    }

    public static boolean isArmstrongNumber(int number) {
        int originalNumber = number;
        int numberOfDigits = (int) Math.log10(number) + 1;
        int sum = 0;

        System.out.print("Intermediate calculations: ");
        while (number > 0) {
            int digit = number % 10;
            int digitPower = (int) Math.pow(digit, numberOfDigits);
            System.out.print(digit + "*" + numberOfDigits + " + ");
            sum += digitPower;
            number /= 10;
        }

        System.out.println("\b\b= " + sum);

        return originalNumber == sum;
    }
}


