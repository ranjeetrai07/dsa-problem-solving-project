package java8features.stream_api.interview.interview;

import java.util.ArrayList;
import java.util.Arrays;

public class StreamApiDemo {

    public static void main(String [] args){
        String [] a1 = {"one", "two", "three"};
        String [] a2 = {"two","one"};

        boolean arrayEquals = false;

        if(Arrays.stream(a1).count() ==  Arrays.stream(a2).count()){
            //arrayEquals  = Arrays.stream()
        }

        ArrayList<Integer> l1 = new ArrayList<Integer>();
        //l1.stream()
    }
}
