import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Double.parseDouble;

public class RainfallStats {

    private int count = 0;
    private double total = 0;
    private double max = 0;
    private ArrayList<Double> measurements;

    public void addMeasurement(String measurement) {

        try {
            double parsedMeasurement = parseDouble(measurement);
            if (parsedMeasurement < 0) {
                System.out.println("It is not possible to have a negative amount of rainfall.");
            } else {
                measurements.add(parsedMeasurement);
                total += parsedMeasurement;
                count++;

            }
        } catch (NumberFormatException ex) {
            System.out.println("Invalid input, please try again.");
        }

    }
    public int getCount() {
        return count;
    }
    public double getMean() {
        double mean = 0;
        try {
            mean = total / measurements.size();
        } catch (IllegalStateException ex) {
            System.out.println("List of measurements is empty.");
        } finally {
            return mean;
        }
    }
    public double getMax() {
        try {
            for (int i = 0; i < measurements.size(); i++) {
                if (measurements.get(i) > max) {
                    max = measurements.get(i);
                }
            }
        } catch (IllegalStateException ex) {
            System.out.println("List of measurements is empty.");
        } finally {
            return max;
        }
    }

}
