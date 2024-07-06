package leetcode_problems.array.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem {

    public static int [] sampleArray = {1, 2, 3, 4};
    public static int targetSum = 6;
    public static void main(String [] args){
        int [] twoSumArray = twoSumProbMapSolution(sampleArray, targetSum);
        for (int arr : twoSumArray){
            System.out.println(arr);
        }
    }

    // map soultion in time comlexcity OlogN
    public static int [] twoSumProbMapSolution(int[] nums, int target){
        Map<Integer, Integer> mapData = new HashMap<>();
        for (int i=0; i < nums.length; i++){
            int complement = target - nums[i];
            //System.out.println(complement);
            if(mapData.containsKey(complement)){
                return new int []  {mapData.get(complement), i};
            }
            mapData.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum pairs");
    }

    // array solution

}
