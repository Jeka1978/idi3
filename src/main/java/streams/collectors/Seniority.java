package streams.collectors;

import lombok.AllArgsConstructor;

import java.util.Arrays;

/**
 * @author Evgeny Borisov
 */
@AllArgsConstructor
public enum Seniority {
    JUNIOR(0,10000),MIDDLE(10001,20000), SENIOR(20001, Integer.MAX_VALUE);
    private int min;
    private int max;

    public static Seniority bySalary(int salary) {
       return Arrays.stream(values())
                .filter(seniority -> seniority.min < salary)
                .filter(seniority -> seniority.max >= salary)
                .findAny().get();
    }
}








