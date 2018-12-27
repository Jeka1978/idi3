package streams;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Comparator.comparingLong;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

/**
 * @author Evgeny Borisov
 */
public class HomeWorkService {
    @SneakyThrows
    public static void main(String[] args) {
        FileReader fileReader = new FileReader("data/califronia.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        Stream<String> lines = bufferedReader.lines();
     /*   int sum = lines.mapToInt(String::length).sum();
        System.out.println("sum = " + sum);*/
        Stream<String> words = lines.flatMap(line -> Arrays.stream(line.split("\\W+")));

        Map<String, Long> word2Amount = words.map(String::toLowerCase)
                .collect(groupingBy(word -> word, counting()));
        System.out.println("word2Amount = " + word2Amount);
        word2Amount.entrySet().stream()
                .sorted(comparingLong((Map.Entry<String,Long> value) -> value.getValue()).reversed())
                .forEach(System.out::println);






       /* IntSummaryStatistics statistics = words.mapToInt(String::length).summaryStatistics();
        System.out.println(statistics.getSum());
        System.out.println(statistics.getAverage());
        System.out.println(statistics.getMin());
        System.out.println(statistics.getMax());
        System.out.println(statistics.getCount());*/

//        words.collect()


    }
}
