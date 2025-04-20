package leetcode_problems.array.mediam.optimized.bestSightseeingPair1014;
public class MaxScoreSightseeingPair {

    public static int [] array =  {8,1,5,2,6};
    static int fisrtIvalue = array[0] + 0;
    static int ans = Integer.MIN_VALUE;
    public static void main(String [] args) {
        for (int j = 1; j < array.length; j++) {
            int sendJvalue = array[j] - j;
            ans = Math.max(ans, fisrtIvalue + sendJvalue);
            fisrtIvalue = Math.max(fisrtIvalue, array[j] + j);
        }
        System.out.println(ans);
    }
}
