package leetcode_problems.array.easy;

public class PartitionArrayPivot2161 {
    public static void main(String [] args) {
        int [] nums = new  int [] {9,12,5,10,14,3,10};
        int pivot = 10;

        int [] arrayLessThan = new int [nums.length];
        int [] arrayGraterThan = new int [nums.length];
        int [] resultArray = new int [nums.length];
        int pivotCount = 0;
        int k = 0;
        int l = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] < pivot && nums[i] != pivot) {
                arrayLessThan[k] = nums[i];
                k++;
            }else if (nums[i] > pivot && nums[i] != pivot) {
                arrayGraterThan[l] = nums[i];
                l++;
            }else {
                pivotCount++;
            }
        }
        for(int i=0; i<k; i++){
            resultArray[i] = arrayLessThan[i];
        }
        for(int i=k; i<k+pivotCount; i++){
            resultArray[i] = pivot;
        }
        for(int i=k+pivotCount, j=0; i<nums.length; i++,j++){
            resultArray[i] = arrayGraterThan[j];
        }

        for(int i=0; i<nums.length; i++){
            System.out.print(resultArray[i] + ",");
        }
    }
}
