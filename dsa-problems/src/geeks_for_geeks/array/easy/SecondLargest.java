package geeks_for_geeks.array.easy;

import java.util.Arrays;

public class SecondLargest {

    public static void main(String [] args){
        int [] arr = new int[] {12, 35, 1, 10, 34, 1};
        int maxSec = maxSecond(arr);
        System.out.println(maxSec);
    }

    public static int maxSecond(int [] arr) {
        int max1=0;
        int max2=0;
        if(arr[0]>arr[1]){
            max1 = arr[0];
            max2 = arr[1];
        }else{
            max2=arr[0];
            max1=arr[1];
        }
        for(int i=2; i<arr.length; i++){
            if(arr[i] > max1){
                max2 = max1;
                max1 = arr[i];
            }else if(arr[i] == max1){
                max1 =  arr[i];
            }else if(arr[i] > max2){
                max2 = arr[i];
            }
        }
        if(max1==max2){
            return -1;
        }
        return max2;
    }
}
