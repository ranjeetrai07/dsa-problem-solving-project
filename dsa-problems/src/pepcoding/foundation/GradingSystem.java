package pepcoding.foundation;

import java.util.Scanner;

public class GradingSystem {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter marks : ");
        int marks = scn.nextInt();
        if(marks > 90){
            System.out.println("excellent");
        }else if (marks > 80 && marks <=90) {
            System.out.println("good");
        }else if (marks > 70 && marks <=80){
            System.out.println("fair");
        }else if (marks > 60 && marks <=70){
            System.out.println("meets expectations");
        }else if (marks == 60){
            System.out.println("below par");
        }else{
            System.out.println("fail");
        }
    }
}
