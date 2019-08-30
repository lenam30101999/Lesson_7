package com.k003.nam.exercise6;

import java.util.Scanner;

public class Bill {
    protected int codeBill,codeRoom;
    protected String date;
    protected String name;
    protected long price;
    protected long payment;

    Bill(){
        codeBill = 0;
        codeRoom = 0;
        date = "";
        name = "";
        price = 0;
        payment = 0;
    }
    public void charge(){

    }

    public void input(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter code of bill: ");
        codeBill = scan.nextInt();
        System.out.println("Enter code of room: ");
        codeRoom = scan.nextInt();
        System.out.println("Enter date/month/year : ");
        scan.nextLine();
        date = scan.nextLine();
        System.out.println("Enter name of customer: ");
        name = scan.nextLine();
        System.out.println("Enter the price ( price/day) : ");
        price = scan.nextInt();
    }

    public void output(){
        System.out.print(codeBill + "\t\t" + date + "\t\t" + name + "\t\t" + codeRoom + "\t\t");
        charge();
    }
}
