package hacker_rank.array.easy;

import java.io.*;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class LeftRotation {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int d = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = LeftRotation.rotateLeft(d, arr);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        // Write your code here
        d %= arr.size();

        //to reverse array
        reverse(arr, 0, arr.size() - 1);

        //to reverse arrya from 0 to length - k postioin
        reverse(arr, 0, arr.size() - d - 1);

        //reverse remaining
        return reverse(arr, arr.size() - d, arr.size() -1);

    }

    public static List<Integer> reverse(List<Integer> array, int start, int end){
        while( start<end ){
            int temp = array.get(start);
            array.set(start,array.get(end));
            array.set(end, temp);
            start++;
            end --;
        }
        return array;
    }
}
