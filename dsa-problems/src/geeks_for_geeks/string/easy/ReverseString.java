package geeks_for_geeks.string.easy;

import java.util.Arrays;

public class ReverseString {

    public static void main(String [] args){
        String str = "Geeks";
        char[] charArr = str.toCharArray();
        int i = 0;
        int j = charArr.length -1;
        while (i<j){
            Character temp = charArr[i];
            charArr[i] = charArr[j];
            charArr[j] = temp;
            i++;
            j--;
        }

        for(int k=0; k<charArr.length; k++){
            System.out.println(charArr[k]);
        }
        str = String.valueOf(charArr);
        System.out.println(str);
    }
}
