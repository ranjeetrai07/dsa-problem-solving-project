package pepcoding.level1.array.twoDArray;

import java.util.Scanner;

public class TwoDArray {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int r1 = scn.nextInt();
        int c1 = scn.nextInt();

        int[][] arry = new int[r1][c1];
        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c1; j++){
                arry[i][j] = scn.nextInt();
            }
        }

        for(int i=0; i < arry.length; i++){
            for(int j=0; j < arry[i].length; j++){
                System.out.print(arry[i][j] + " ");
            }
            System.out.println();
        }
    }

}
