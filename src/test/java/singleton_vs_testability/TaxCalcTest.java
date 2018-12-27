package singleton_vs_testability;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

/**
 * @author Evgeny Borisov
 */
public class TaxCalcTest {

    @Test
    public void withMaam() {
        MaamResolver maamResolver = Mockito.mock(MaamResolver.class);
        Mockito.when(maamResolver.getMaam()).thenReturn(0.17);

        TaxCalc taxCalc = new TaxCalc(maamResolver);
        double withMaam = taxCalc.withMaam(100);
        Assert.assertEquals(117,withMaam,0.0000001);
    }


}