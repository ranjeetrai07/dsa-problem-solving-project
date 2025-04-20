package leetcode_problems.array.easy;

import java.util.Scanner;

public class FindStudentChalk {

    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("enter array size");

        int n = scn.nextInt();
        int [] array = new int[n];
        for(int i=0; i<n; i++){
            array[i] = scn.nextInt();
        }

        for(int i=0; i<n; i++){
           System.out.print(array[i] + " ");
        }
        System.out.print("enter number of chalk");
        int chalk = scn.nextInt();

        System.out.println("number of chalk" + chalk);

        int studentId = chalkReplacer(array, chalk);

        System.out.println("student that don't have chalks" + studentId);

    }

    public static int chalkReplacer(int[] chalk, int k) {

        long totalChalkSum = 0;
        for(int n : chalk){
            totalChalkSum += n;
        }

        if(k>=totalChalkSum){
            k %= totalChalkSum;
        }

        for(int i=0; i<chalk.length; i++){
            if(chalk[i] > k){
                return i;
            }
            k -= chalk[i];
        }

        return -1;
    }

}



