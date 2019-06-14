package leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountDuplicates {


    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2,3,2,4,5,6,5,2,3);

        long count = numbers.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e->e.getValue()>1)
                .count();

        System.out.println(count);
    }

}
