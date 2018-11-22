package lukegriffith.co.uk;

import java.util.ArrayList;

public class Printer {



    public static void table(ArrayList<Universe.dataPoint> data) {

        System.out.println("value,sum,mean,variance,std");

        for (Universe.dataPoint d: data) {

            String s = String.format(
                    "%d,%d,%d,%d,%.3f",
                    d.getValue(),
                    d.getSum(),
                    d.getMean(),
                    d.getVariance(),
                    d.getStandardDev()
            );

            System.out.println(s);
        }
    }
}
