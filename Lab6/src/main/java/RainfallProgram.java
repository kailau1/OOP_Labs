import java.io.*;

public class RainfallProgram {
	public static void main(String[] args) throws  IOException {
		BufferedReader keyboard = new BufferedReader(
			new InputStreamReader(System.in) 
		);
		 
		RainfallStats stats = new RainfallStats();
		System.out.println("Enter rainfall measurements (in mm), or \"end\" to stop.");
		while(true) {
			System.out.print("> ");
			String line = keyboard.readLine(); 
			if("end".equals(line)) {
				break;
			}
			
			try {
				double measurement = Double.parseDouble(line);
				stats.addMeasurement(measurement);
			} catch (NumberFormatException e) {
				System.out.println("Invalid input. Please provide a valid number for rainfall measurement.");
			} catch (InvalidRainfallException e) {
				System.out.println("Invalid rainfall measurement: " + e.getMessage());

            }

	}

		try {
			System.out.println(stats.getCount() + " measurement(s) entered.");
			System.out.println("Mean rainfall: " + stats.getMean() + " mm");
			System.out.println("Maximum rainfall: " + stats.getMax() + " mm");
		} catch (IllegalStateException e) {
			System.out.println(e.getMessage());

		}
	}
}

