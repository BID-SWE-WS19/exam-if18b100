package BID.SWE;

import java.util.LinkedList;
import java.net.Socket:
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Exercise5Impl implements Exercise5
{

    @Override
    public Object Method1(String s, int i) {
        LinkedList<String> myString = new LinkedList<>();
        Socket socke = new Socket(s, i);

        BufferedReader in = new BufferedReader(new InputStreamReader(socke.getInputStream()));
        String line;
        while((line = in.readLine()) != null){
            myString.addLast(line);
        }

        return myString;
    }
}
