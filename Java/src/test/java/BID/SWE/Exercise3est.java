package BID.SWE;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class Exercise3est
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldDouble()
    {
        SuperCell sc = new SuperCell();
        Assert.assertTrue(sc.Grow() == 2);
    }

    @Test
    public void testAlive()
    {
        SuperCell sc = new SuperCell();
        Assert.assertTrue(sc.IsAlive(2));
    }
}

