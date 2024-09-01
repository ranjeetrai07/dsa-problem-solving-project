package pepcoding.level1.array.twoDArray;

import java.util.Scanner;

public class MatrixMultiplication {

    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("First 2D Array content row column");
        int r1 = scn.nextInt();
        int c1 = scn.nextInt();

        int[][] firstArray = new int[r1][c1];
        for(int i=0; i<r1; i++){
            for(int j=0; j<c1; j++){
                firstArray[i][j] = scn.nextInt();
            }
        }

        for(int i=0; i<firstArray.length; i++){
            for(int j=0; j<firstArray[i].length; j++){
                System.out.print( firstArray[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("First 2D Array content row column");
        int r2 = scn.nextInt();
        int c2 = scn.nextInt();

        int[][] secondArray = new int[r2][c2];
        for(int i=0; i<r2; i++){
            for(int j=0; j<c2; j++){
                secondArray[i][j] = scn.nextInt();
            }
        }

        for(int i=0; i<secondArray.length; i++){
            for(int j=0; j<secondArray[i].length; j++){
                System.out.print(secondArray[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Third 2D Array content row column");
        if(c1 != r2){
            System.out.println("Invalid input for Matrix multiplication");
        }

        int[][] matrixArray = new int[r1][c2];
        for(int i=0; i<matrixArray.length; i++){
            for(int j=0; j<matrixArray[0].length; j++){
                for(int k=0; k<c1; k++){
                    matrixArray[i][j] += firstArray[i][k] * secondArray[k][j];
                }
            }
        }

        for(int i=0; i<matrixArray.length; i++){
            for(int j=0; j<matrixArray[0].length; j++){
                System.out.print(matrixArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}



















