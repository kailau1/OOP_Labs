import java.util.ArrayList;

public class RainfallStats {
    private int count = 0;
    private double total = 0;
    private double max = 0;
    private  ArrayList<Double> measurements = new ArrayList<>();

    public void addMeasurement(double measurement) throws InvalidRainfallException {
        if (measurement < 0) {
            throw new InvalidRainfallException("It is not possible to have a negative amount of rainfall.");
        }

        measurements.add(measurement);
        total += measurement;
        count++;

        if (measurement > max) {
            max = measurement;
        }
    }


    public int getCount() {

        return count;
    }

    public double getMean() {
        if (count == 0) {
            throw new IllegalStateException("List of measurements is empty.");
        }
        return total / count;
    }

    public double getMax() {
        if (count == 0) {
            throw new IllegalStateException("List of measurements is empty.");
        }
        return max;
    }
}
