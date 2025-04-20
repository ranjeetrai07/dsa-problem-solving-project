package java8features.stream_api.interview.interview;

import java.util.ArrayList;

public class Test {

    public static void main(String [] args){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        numbers.forEach(num -> System.out.println(num));
    }
}
