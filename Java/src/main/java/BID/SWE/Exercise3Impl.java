package BID.SWE;

public class Exercise3Impl implements Exercise3
{

    @Override
    public Object Method1() {
        return new MyMap();
    }

    @Override
    public Object Method2() {
        return null;
    }
}

public abstract class Map{
    public abstract String GetMapName();
    public abstract float GetMapSize(float amount);
    public abstract int AddNewCells(int count);
}

public class MyMap extends Map{
    public String GetMapName(){
        return "BID-MAP";
    }
    public float GetMapSize(float amount){
        return amount*amount;
    }
    public int AddNewCells(int count){

    }
}

public abstract class Bewegung {
    protected int position;


    public String Position(){
        return
    }
}

public class Laufen extends Bewegung{

}

public class Springen extends Bewegung{

}