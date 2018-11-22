package lukegriffith.co.uk;

import java.util.ArrayList;
import java.util.Arrays;


public class Program {

    public static void main(String[] args) {

        Integer[] rawData = {1, 3, 1000, 10, 16};
        ArrayList<Integer> data = new ArrayList<>(Arrays.asList(rawData));

        Universe universe = new Universe(data);
        Printer.table(universe.getData());
    }
}
