package builder_example;

/**
 * @author Evgeny Borisov
 */
@FunctionalInterface
public interface Equalator<T> {
    boolean equals(T t1, T t2);
}
