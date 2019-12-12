package BID.SWE;
import java.util.Date;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class Ex1Test{
    @Test
    public void stateTest(){
        Cell cell = new Cell();
        Date date = new Date("14.12.2019");
        Assert.assertTrue("Cell rot born on 14.12.2019 is alive.".equals(cell.PrintState(true, date, "rot")));
    }
    public void positionTest(){
        Cell cell = new Cell();
        Assert.assertTrue("Cell is on Position X:6 Y:7".equals(cell.PrintPostion(6, 7)));
    }
}