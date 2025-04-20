package leetcode_problems.array.easy;

public class ClosestPrimeNumber2523 {

    public static void main(String [] args){
        int [] result = closestPrimeNumber(10, 19);
        for(int i =0; i<2; i++){
            System.out.println(result[i]);
        }
    }

    public static int [] closestPrimeNumber(int left, int right){
        int val = 0;
        int minVal = Integer.MAX_VALUE;
        int [] resultArray = new int [2];
        for(int i=left+1; i<=right; i++){
            if(!prime(i)){
                resultArray[val] = i;
                val++;
            }
            if(val == 2){
                if(minVal > resultArray[1] - resultArray[0] && i!=right){
                    minVal = resultArray[1] - resultArray[0];
                    resultArray[0] = resultArray[1];
                    val = 1;
                }
            }

        }
        if(val == 2){
            return resultArray;
        }
        return new int [] {-1, -1};
    }

    public static Boolean prime(int value) {
        for(int j=2; j <= Math.sqrt(value); j++){
            if(value % j == 0){
                return true;
            }
        }
        return false;
    }
}
