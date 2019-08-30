package com.k003.nam.exercise10;

import java.util.Scanner;

public class Employee extends Person {
    protected long salary;
    protected String post;

    Employee(){
        salary = 0;
        post = "";
    }

    public void changeEmplyee(Employee employee, long re_salary, String re_post){
        employee.salary = re_salary;
        employee.post = re_post;
    }
    @Override
    public void input() {
        super.input();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter salary :");
        salary = scan.nextLong();
        System.out.println("Enter post: ");
        scan.nextLine();
        post = scan.nextLine();
    }

    @Override
    public void output() {
        super.output();
        System.out.print("\n" + name + "\t\t" + address + "\t\t" + salary + "\t\t" + post);
    }

    @Override
    public void main() {
        super.main();
        Scanner scan = new Scanner(System.in);
        Employee employee = new Employee();
        int choice;
        long re_salary;
        String re_post;

        employee.input();
        System.out.println("1.Change salary ");
        System.out.println("2.Change position ");

        System.out.println("Your choosen: ");
        choice = scan.nextInt();
        switch (choice){
            case 1:{
                System.out.println("Re-input salary : ");
                re_salary = scan.nextLong();
                changeEmplyee(employee,re_salary,employee.post);
                break;
            }

            case 2:{
                System.out.println("Re-input position :");
                scan.nextLine();
                re_post = scan.nextLine();
                changeEmplyee(employee,employee.salary,re_post);
                break;
            }
        }

        employee.output();
    }
}
