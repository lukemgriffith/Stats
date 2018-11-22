package lukegriffith.co.uk;

import java.util.ArrayList;

import java.util.List;


public class Universe {

    public class dataPoint {

        int value;
        int sum;
        int mean;
        int variance;
        double standardDev;

        public dataPoint(int point, List<Integer> dataToIndex) {

            value = point;
            sum = 0;

            for (int i: dataToIndex){
                sum += i;
            }

            try {
                mean = sum / dataToIndex.size();
            }
            catch (java.lang.ArithmeticException e) {
                mean = 0;
            }

            int temp = 0;

            for (int i: dataToIndex) {
                temp += (i - mean) * (i - mean);
            }

            try {
                variance = temp / (dataToIndex.size() - 1);
            }
            catch (java.lang.ArithmeticException e) {
                variance = 0;
            }

            standardDev = Math.sqrt(variance);

        }

        public int getValue(){
            return value;
        }

        public int getSum(){
            return sum;
        }

        public int getMean(){
            return mean;
        }

        public int getVariance(){
            return variance;
        }

        public double getStandardDev(){
            return standardDev;
        }

    }

    // Instance variables

    public ArrayList<Integer> data;


    // Constructors

    public Universe(ArrayList<Integer> input) {
        data = input;
    }


    // Public Methods

    public ArrayList<dataPoint> getData() {

        ArrayList<dataPoint> d = new ArrayList<>();

        for (int i = 0; i < data.size(); i++) {
            d.add(
                    new dataPoint(data.get(i), data.subList(0, i+1      ))
            );
        }

        return d;
    }




}
