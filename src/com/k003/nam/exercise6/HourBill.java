package com.k003.nam.exercise6;

import java.util.Scanner;

public class HourBill extends Bill {
    protected int hour;

    HourBill(){
        hour = 0;
    }

    public void input(){
        super.input();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the room rental hour: ");
        hour = scan.nextInt();
    }

    @Override
    public void charge() {
        super.charge();
        if (hour <= 24){
            payment = hour * price / 24;
        }
        else if (hour > 24 && hour < 30){
            payment = price;
        }
        else if (hour > 30){
            int day = Math.round(hour / 24);
            payment = day * price;
        }
        System.out.print(payment);
    }
}
