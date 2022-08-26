package streamApi;

import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(44);
        numbers.add(55);
        numbers.add(11);
        numbers.add(45);

        List<Integer> result = numbers.stream().filter(i -> i>12).collect(Collectors.toList());// лямбда выражение

        for (Integer i : result)
        System.out.println(i);


    }
}
