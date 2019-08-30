package com.k003.nam.exercise10;

import java.util.Scanner;

public class Student extends Person {
    protected double point_1;
    protected double point_2;
    protected double sum;

    Student(){
        point_1 = 0;
        point_2 = 0;
        sum = 0;
    }

    void changePoint(Student student, double point1, double point2){
        student.point_1 = point1;
        student.point_2 = point2;
    }

    @Override
    public void input() {
        super.input();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter point of subject 1 : ");
        point_1 = scan.nextDouble();
        System.out.println("Enter point of subject 2 :");
        point_2 = scan.nextDouble();
    }

    @Override
    public void output() {
        super.output();
        System.out.print("\n" + name + "\t\t" + address + "\t\t" + point_1 + "\t\t" + point_2);
    }

    @Override
    public void main() {
        super.main();
        Scanner scan = new Scanner(System.in);
        Student student = new Student();
        int choice;
        double point;

        sum = student.point_1 + student.point_2;
        student.input();
        System.out.println("1.Change point of subject 1");
        System.out.println("2.Change point of subject 2");

        System.out.println("Your choosen: ");
        choice = scan.nextInt();
        switch (choice){
            case 1:{
                System.out.println("The point you want to change: ");
                point = scan.nextDouble();
                changePoint(student,point,student.point_2);
                break;
            }

            case 2:{
                System.out.println("The point you want to change: ");
                point = scan.nextDouble();
                changePoint(student,student.point_1,point);
                break;
            }
        }

        student.output();
    }
}
