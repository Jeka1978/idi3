package singleton_vs_testability;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Service
public class TaxCalc {

    private final MaamResolver maamResolver;

    @Autowired
    private MyService myService;



    @Autowired
    public TaxCalc(MaamResolver maamResolver) {
        this.maamResolver = maamResolver;
    }

    public double withMaam(double price) {
        return price * maamResolver.getMaam()+price;
    }
}
