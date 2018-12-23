package streams;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        DoubleStream.generate(Math::random).forEach(System.out::println);
        Stream<String> stream = Stream.of("a", "ab", "cc", "ddd");
        stream.filter(s -> !s.startsWith("a")).forEach(System.out::println);
        stream.forEach(System.out::println);
    }
}
