package singleton_vs_testability;

import lombok.SneakyThrows;

/**
 * @author Evgeny Borisov
 */
public class MaamResolverSingleton {
    private static MaamResolverSingleton ourInstance = new MaamResolverSingleton();

    public static MaamResolverSingleton getInstance() {
        return ourInstance;
    }

    private double maam;

/*
    @SneakyThrows
    private MaamResolverSingleton() {
        Thread.sleep(3000);
        maam = 0.17;
    }*/

    public double getMaam() {
        return 0.16;
    }
}


