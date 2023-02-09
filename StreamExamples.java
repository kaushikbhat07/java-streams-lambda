import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExamples {
    public static void main(String[] args) {
        // 2. Creating Streams

        // 2.1. Stream.of()
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);

        stream.forEach(ele -> System.out.println(ele));

        // 2.2. Stream.of(array)
        Integer[] array;
        array = new Integer[] { 1, 2, 3, 4, 5 };

        Stream<Integer> streamInteger = Stream.of(array);
        streamInteger.forEach(ele -> System.out.println(ele));

        // 2.3. List.stream()
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        Stream<Integer> streamList = list.stream();
        streamList.forEach(ele -> System.out.println(ele));

        // 3. Stream Collectors

        // 3.1. Collect Stream elements to a List
        Stream<Integer> streamListForFilter = list.stream();
        List<Integer> evenNumbers = streamListForFilter.filter(ele -> ele % 2 == 0).toList();

        Stream<Integer> streamListForFilterCollector = list.stream();
        evenNumbers = streamListForFilterCollector.filter(ele -> ele % 2 == 0).collect(Collectors.toList());

        // 3.2. Collect Stream elements to an Array
        Stream<Integer> streamListForArray = list.stream();
        Integer[] evenNumbersArray = streamListForArray.filter(ele -> ele % 2 == 0).toArray(Integer[]::new);

        // 3.3. Collect Stream elements to a Set
        Stream<Integer> streamListForSet = list.stream();
        Set<Integer> evenNumbersSet = streamListForSet.filter(ele -> ele % 2 == 0).collect(Collectors.toSet());

        // 3.4. Collect Stream elements to a Map
        Stream<Integer> streamListForMap = list.stream();
        // Set<Integer> evenNumbersMap = streamListForMap.filter(ele -> ele % 1 == 0).collect(Collectors.toMap());
        // figure out

        // 4. Stream Operations

    }
}
