package com.grosfiler;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter task: ");
        int i = scanner.nextInt();

        switch (i){
            case 1: task1();
                break;
            case 2: task2();
                break;
            case 3: task3();
                break;
            case 4: task4();
                break;
            case 5: task5();
                break;
            case 6: task6();
                break;
            case 7: task7();
                break;
            case 8: task8();
                break;
            case 9: task9();
                break;
            case 10: task10();
                break;
        }
    }

    private static void task1() {
        Scanner scanner = new Scanner(System.in);
        double divider = 0;

        System.out.println("Enter number: ");
        double number = scanner.nextDouble();

        do {
            System.out.println("Enter divider: ");
            divider = scanner.nextDouble();
            if (divider == 0) {
                System.out.println("Divider cannot be 0");
            }
        } while (divider == 0);

        System.out.println(number + "/" + divider + " is " + number/divider);
    }

    private static void task2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("In what year was Odessa founded?");
        int date = scanner.nextInt();

        if (date != 1794){
            System.out.println("Wrong. Odessa was founded in 1794");
        } else {
            System.out.println("Correct");
        }
    }

    private static void task3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Get price with discount. Enter price: ");
        double price = scanner.nextDouble();

        int discount = 0;
        if (price > 1000){
            discount = 5;
        } else if (price > 500) {
            discount = 3;
        }

        System.out.println("Your discount is " + discount + "%");
        System.out.println("Price with discount: " + (price*(100-discount))/100 );
    }

    private static void task4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a whole number: ");
        int number = scanner.nextInt();

        if (number%2 == 0){
            System.out.println(number + " is even");
        } else{
            System.out.println(number + " is uneven");
        }
    }

    private static void task5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a whole number: ");
        int number = scanner.nextInt();

        if (number%3 == 0){
            System.out.println(number + " can be divided by 3");
        } else{
            System.out.println(number + " cannot be divided by 3");
        }
    }

    private static void task6() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter data: ");
        System.out.println("Enter total minutes: ");
        int minutes = scanner.nextInt();
        System.out.println("Enter day of week(1 - Monday, ..., 7 - Sunday): ");
        int day = scanner.nextInt();

        if ( day >= 6 ){
            System.out.println("Discount is 20%");
            System.out.println("Price is " + (double) minutes*2*80/100 );
        } else {
            System.out.println("Discount is 0%");
            System.out.println("Price is " + (double) minutes*2 );
        }
    }

    private static void task7() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three-digit number: ");
        int number = scanner.nextInt();
        int hundreds = 0, decimals = 0, ones = 0;
        ones            = number % 10;
        decimals        = number / 10 % 10;
        hundreds        = number / 100 % 10;

        if (ones > hundreds){
            System.out.println(ones + " > " + hundreds);
        } else if (ones < hundreds){
            System.out.println(ones + " < " + hundreds);
        } else
            System.out.println(ones + " = " + hundreds);

        if (ones > decimals){
            System.out.println(ones + " > " + decimals);
        } else if (ones < decimals){
            System.out.println(ones + " < " + decimals);
        } else
            System.out.println(ones + " = " + decimals);

        if (decimals > hundreds){
            System.out.println(decimals + " > " + hundreds);
        } else if (decimals < hundreds){
            System.out.println(decimals + " < " + hundreds);
        } else
            System.out.println(decimals + " = " + hundreds);
    }

    private static void task8() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three-digit number: ");
        int number = scanner.nextInt();
        int hundreds = 0, decimals = 0, ones = 0;
        ones            = number % 10;
        decimals        = number / 10 % 10;
        hundreds        = number / 100 % 10;

        int pow2 = (int) Math.pow (number, 2);
        int sumOfPow3 = (int) (Math.pow (ones, 3) + Math.pow (decimals, 3) + Math.pow (hundreds, 3));

        if (pow2 > sumOfPow3) {
            System.out.println("The square of this number is greater then the sum of cubes of his digits.");
        } else if (pow2 < sumOfPow3){
            System.out.println("The square of this number is less then the sum of cubes of his digits.");
        } else
            System.out.println("The square of this number is equal to the sum of cubes of his digits.");

    }

    private static void task9() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter x: ");
        int x = scanner.nextInt();
        int y = 0;
        do {
            System.out.println("Enter y (y != x): ");
            y = scanner.nextInt();
            if (x == y) {
                System.out.println("x should not be equal to y");
            }
        } while ( x == y);

        int xInit = x;
        int yInit = y;

        if (x > y){
            x = 2 * xInit * yInit;
            y = (xInit + yInit) / 2;
        } else {
            y = 2 * xInit * yInit;
            x = (xInit + yInit) / 2;
        }

        System.out.println("x is " + x + ", y is " + y);
    }

    private static void task10() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter b: ");
        double b = scanner.nextDouble();

        if (a == 0 && b == 0)
            System.out.println("x = any");
        else if (a*b <= 0){
            double f = 0 - (b/a);
            double x = Math.sqrt(f);
            System.out.println("x = " + x);
        } else
            System.out.println("x = 0");
    }
}
