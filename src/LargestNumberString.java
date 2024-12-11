import java.util.*;
import java.util.stream.Collectors;

public class LargestNumberString {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,4,35,36,24);

        list.sort((x, y) -> (String.valueOf(y) + x).compareTo(String.valueOf(x) + y));
        System.out.println(list.stream().map(Objects::toString).collect(Collectors.joining("")));

        Map<Boolean, List<Integer>> map = list.stream().collect(Collectors.partitioningBy(num -> num%2 == 0));
        System.out.println(map);

        Optional<Integer> optionalI = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();

        if (optionalI.isPresent()) {
            System.out.println(optionalI.get());
        } else {
            System.out.println("Empty");
        }
    }
}