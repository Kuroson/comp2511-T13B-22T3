package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        // .map()
        // .filter()
        // .forEach()
        List<String> strings = new ArrayList<String>(Arrays.asList(new String[] { "1", "2", "3", "4", "5" }));
        strings.stream().forEach(x -> {
            System.out.println(x);
        });
        for (String string : strings) {
            System.out.println(string);
        }

        List<String> strings2 = new ArrayList<String>(Arrays.asList(new String[] { "1", "2", "3", "4", "5" }));
        List<Integer> ints = strings2.stream().map(x -> Integer.parseInt(x)).collect(Collectors.toList());
        // List<Integer> ints = new ArrayList<Integer>();
        // for (String string : strings2) {
        // ints.add(Integer.parseInt(string));
        // }
        System.out.println(ints);
    }

}