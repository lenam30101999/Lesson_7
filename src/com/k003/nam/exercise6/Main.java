package com.k003.nam.exercise6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bill[] array = new Bill[30];
        Scanner scan = new Scanner(System.in);
        int choice, count, sum = 0;
        int count_date = 0;
        int count_hour = 0;

        System.out.println("Sum of bill: ");
        count = scan.nextInt();

        for (int i = 0; i < count; i++){
            System.out.println("1.\nInvoice by date");
            System.out.println("2.Hourly invoice");
            choice = scan.nextInt();

            switch (choice){
                case 1:{
                    count_date++;
                    array[i] = new DateBill();
                    array[i].input();
                    break;
                }

                case 2:{
                    count_hour++;
                    array[i] = new HourBill();
                    array[i].input();
                    break;
                }
            }
        }
        System.out.println("Count of date: " + count_date + "\nCount of hour: " + count_hour);
        System.out.println("Bill\t\tDate\t\tname\t\tRoom\t\tPayment");
        for (int i = 0; i < count; i++){
            array[i].output();
            if (array[i].date.substring(3).equals("09/2013"))
                sum+= array[i].payment;
        }
        System.out.println("\nSum in 09/2019 : " + sum);
    }
}
