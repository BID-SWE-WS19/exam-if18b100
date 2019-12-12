package BID.SWE;

public class Exercise2Impl implements Exercise2
{
    @Override
    public Object Method1() {
        SuperCell sc = new SuperCell();
        return sc;
    }

    @Override
    public int Method2() {
        SuperCell sc = new SuperCell();
        return sc.Grow();
    }

    @Override
    public boolean Method3(int i) {
        SuperCell sc = new SuperCell();

        return sc.IsAlive(i);
    }
}

public class Cell {
    protected int _size = 1;
    public Cell(){    }
    public boolean IsAlive(){
        return true;
    }
    public int Grow(){
        ++this._size;
        return this._size;
    }
}

public class SuperCell extends Cell{

    public SuperCell{
    }

    @Override
    public int Grow(){
        this._size *= 2;
        return this._size;
    }
    @Override
    public boolean IsAlive(int neighbors){
        return neighbors%2 == 0;
    }

}