package com.k003.nam.exercise6;

import java.util.Scanner;

public class DateBill extends Bill {
    protected int day;

    DateBill(){
        day = 0;
    }

    public void input(){
        super.input();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the room rental date: ");
        day = scan.nextInt();
    }

    @Override
    public void charge() {
        super.charge();
        if (day <= 7){
            payment = day * price;
        }
        else{
            payment = 7 * price + (day - 7) * price * 80/100;
        }
        System.out.println(payment);
    }
}
