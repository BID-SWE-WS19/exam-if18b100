package BID.SWE;

import java.util.Date;

//public class Exercise1Impl implements Exercise1
public class Exercise1 implements CellPrinter
{



    @Override
    public Object Method1() {
        return new Exercise1();
    }


    public String PrintState(boolean var1, Date var2, String var3){
        String status;
        String result;
        if(var1){
            status = "alive";
        } else {
            status = "dead";
        }

        result = String.format("Cell %s born on %s is %s.", var3, var2, status);

        return result;
    };

    public String PrintPostion(int var1, int var2){
        String result = String.format("Cell is on Position X:%d Y:%d", var1, var2);
        return result;
    };
}


