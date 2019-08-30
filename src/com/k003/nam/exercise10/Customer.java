package com.k003.nam.exercise10;

import java.util.Scanner;

public class Customer extends Person{
    protected String type;

    Customer(){
        type = "";
    }

    @Override
    public void input() {
        super.input();
        Scanner scan = new Scanner(System.in);
        System.out.println("Type of car :");
        type = scan.nextLine();
    }

    @Override
    public void output() {
        super.output();
        System.out.print("\n" + name + "\t\t" + address + "\t\t" + type);
    }

    @Override
    public void main() {
        super.main();
        Customer customer = new Customer();
        customer.input();
        customer.output();
    }
}
