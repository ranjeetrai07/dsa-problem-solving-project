package pepcoding.level1.foundation;

import java.util.Scanner;

public class CountDigitsOfNumber {

    public static void main(String[] args){
        int count = 0;
        Scanner sn =  new Scanner(System.in);
        System.out.println("Enter  number to find out digit : ");
        int number  = sn.nextInt();
        while (number != 0){
            number = number/10;
            count++;
        }
        System.out.println(count);
    }
}
