import java.io.IOException;

public class FindBestPhones {
	public static String PHONES_FILE = "C:/Users/kai/Documents/work/code/OOP_Labs/Lab7/src/main/java/phone-data.txt";
	// WHEN TESTING MY CODE PLEASE REMEMBER TO ALTER THE FILEPATH.
	public static void main(String[] args) {
		try {
			PhoneList best = PhoneParser.parseFile(PHONES_FILE);

			for (Phone phone : best.getBestPhones()) {
				System.out.println(phone.getModel());
			}
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("An error occurred while processing the file.");
		}
	}
}
