import java.io.*;
import java.util.ArrayList;

public class PhoneParser {
	/*
	 * Parses a phone data string, in the following format:
	 *
	 *     model screenSize batteryCapacity
	 *
	 * The model name is encoded with underscores instead of spaces.
	 */
	public static Phone parse(String data) {
		String[] specs = data.split(" ");

		String model = specs[0].replace("_", " ");
		double screenSize = Double.parseDouble(specs[1]);
		int batteryCapacity = Integer.parseInt(specs[2]);

		return new Phone(model, screenSize, batteryCapacity);
	}

	/*
	 * Returns a PhoneList by parsing a text file containing the phone data.
	 */
	public static PhoneList parseFile(String filepath) throws IOException {
		PhoneList phoneList = new PhoneList();

		try (BufferedReader file = new BufferedReader(new FileReader(filepath))) {
			String data;

			while ((data = file.readLine()) != null) {
				Phone phone = parse(data);
				phoneList.addPhone(phone);
			}
		}

		return phoneList;
	}
}
