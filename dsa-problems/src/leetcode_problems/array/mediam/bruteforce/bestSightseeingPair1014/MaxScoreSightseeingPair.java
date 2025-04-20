package leetcode_problems.array.mediam.bruteforce.bestSightseeingPair1014;

import java.util.ArrayList;

public class MaxScoreSightseeingPair {

    public static int [] array =  {8,1,5,2,6};
    public static void main(String [] args){
         for(int i=0; i < array.length -1; i++){
             for(int j=i+1; j < array.length;j++){
                 ArrayList <Integer> array2 = new ArrayList<>();
                 int value = array[i] + i + array[j] - j;
                 array2.add(value);
                 System.out.println(array2);
             }
             System.out.println();
         }
    }
}
