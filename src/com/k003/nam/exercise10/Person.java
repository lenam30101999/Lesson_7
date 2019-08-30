package com.k003.nam.exercise10;

import java.util.Scanner;

public class Person {
    protected String name;
    protected String address;

    Person(){
        name = "";
        address = "";
    }

    public void input(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name : ");
        name = scan.nextLine();
        System.out.println("Enter address : ");
        address = scan.nextLine();
    }

    public void output(){
    }

    public void main(){

    }
}
