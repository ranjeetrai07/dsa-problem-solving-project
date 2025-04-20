package java8features.stream_api.interview.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class SringTest {
    public static void  main(String[] args ){
        String str = "vejay";
        char[] chars = str.toCharArray();
        int forWardPointer = 0;
        int backWardPointer = chars.length-1;
        ArrayList<Character> vowel = new ArrayList<>();
        vowel.add('a');
        vowel.add('e');
        vowel.add('i');
        vowel.add('o');
        vowel.add('u');

        char fw = chars[forWardPointer];
        char bw = chars[backWardPointer];

        while (forWardPointer != backWardPointer){
            if(vowel.contains(chars[forWardPointer]) ) {
                if(vowel.contains(chars[backWardPointer])) {
                    char temp =  chars[forWardPointer];
                    chars[forWardPointer] = chars[backWardPointer];
                    chars[backWardPointer] = temp;
                    forWardPointer++;
                    backWardPointer--;
                }else {
                    backWardPointer--;
                }
            } else {
                forWardPointer++;
            }
        }
        str = Arrays.toString(chars);
        System.out.println(str);
        System.out.println(new String(chars));

    }
}
