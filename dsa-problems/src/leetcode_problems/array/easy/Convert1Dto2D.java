package leetcode_problems.array.easy;

import java.util.Scanner;

public class Convert1Dto2D {

    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] array = new int[n];
        int twoDArraySize = n/2;
        int [][] twoDArray = new int [2][twoDArraySize];
        int n1 =  array.length;
        int n2 =  array.length/2;
        for(int i=0; i< array.length; i++){
            array[i] = scn.nextInt();
        }

        for(int i=0; i < 2; i++){
            for(int j=0; j<array.length/2; j++ ){
                if(i==0){
                    twoDArray[i][j] = array[j];
                }else {
                    twoDArray[i][j] = array[j+array.length/2];
                }
            }
        }


        for(int i=0; i < 2; i++){
            for(int j=0; j<array.length/2; j++ ){
                System.out.print(twoDArray[i][j] + " ");;
            }
        }

    }

}
