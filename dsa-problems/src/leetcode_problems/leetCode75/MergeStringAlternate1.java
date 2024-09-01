package leetcode_problems.leetCode75;

public class MergeStringAlternate1 {

    public static void main(String[] args){

        String firstString = "abcd";
        String secondString = "deepu";
        StringBuilder sb = new StringBuilder();
        int n1 = firstString.length();
        int n2 = secondString.length();
        int i=0;
        while (i<n1 || i<n2){
            if(i<n1){
                sb.append(firstString.charAt(i));
            }
            if(i<n2){
                sb.append(secondString.charAt(i));
            }
            i++;
        }
        System.out.println(sb);
    }
}
