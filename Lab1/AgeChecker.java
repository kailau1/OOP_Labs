
public class AgeChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double age = 16;
		if(age >= 18) {
			System.out.println("You're an adult");
		} else if(age >= 68) {
			System.out.println("You're a pensioner");
		} else if (age >= 12 && age < 18) {
			System.out.println("You're a young adult");
		} else if(age >= 5 && age < 12) {
			System.out.println("You're a child");
		} else if(age >= 3 && age <= 5) {
			System.out.println("You're a toddler");
		} else if (age < 0) {
			System.out.println("Age is invalid");
		} else {
			System.out.println("You're a baby");
		}
		
	}

}
