package com.k003.nam.exercise10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person[] arr = new Person[30];
        Scanner scan = new Scanner(System.in);
        int count, choice;

        System.out.println("Enter sum of person : ");
        count = scan.nextInt();

        for (int i = 0; i < count; i++){
            System.out.println("\n1.Student");
            System.out.println("2.Employee");
            System.out.println("3.Customer");

            System.out.println("Your choosen: ");
            choice = scan.nextInt();
            switch (choice){
                case 1:{
                    arr[i] = new Student();
                    arr[i].main();
                    break;
                }

                case 2:{
                    arr[i] = new Employee();
                    arr[i].main();
                    break;
                }

                case 3:{
                    arr[i] = new Customer();
                    arr[i].main();
                    break;
                }
            }
        }
    }
}
