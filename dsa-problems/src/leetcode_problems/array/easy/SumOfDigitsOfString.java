package leetcode_problems.array.easy;

public class SumOfDigitsOfString {

    public static void main(String [] srgs){
        String str = "abcde";
        int k = 2;

        StringBuilder sb = new StringBuilder();
        for(char ch : str.toCharArray()){
           // System.out.println(ch);
            //int num = ch-96;
            //System.out.println(num);
            sb.append(ch-96);
            System.out.println(sb);
        }
        while (k>0){
            int sum=0;
            for(int i=0; i<sb.length();i++){
                sum += (sb.charAt(i) - '0');
            }
            k--;
            sb = new StringBuilder(String.valueOf(sum));
        }
        //return Integer.parseInt(sb.toString());
        System.out.println(sb);
    }

}
