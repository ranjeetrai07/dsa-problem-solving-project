package leetcode_problems.array.easy;

public class MergeTwo2DArray2570 {
    public static void main(String[] args) {
        int[][] array1 = {{1, 6}, {2, 7}}; // 2 rows × 3 columns = 6 elements

        int[][] array2 = {{3, 8}, {4, 10}, {5, 12}, {6, 14}}; // 4 rows × 2 columns = 8 elements

        int len = array2.length + array1.length;
        int[][] array3 = new int [len] [array1[0].length];
        int j = 0;
        for(int i=0; i<len; i++){
            if(array1[i][j] > array2[i][j]){
                array3[i][j] = array1[i][j];
            }
        }

    }
}
