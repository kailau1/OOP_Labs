
public class TenGreenBottles {

	public static void main(String[] args) {
		String word = "";
		String word2 = "";

		for (int n = 10; n > 0; n--)	{
			if (n == 1) {
				word = "bottle";
			} else {
				word = "bottles";
			}
			if (n-1 == 1) {
				word2 = "bottle";
			} else {
				word2 = "bottles";
			}
			
			System.out.println(n +  " green " + word + ", hanging on the wall");
			System.out.println(n + " green " + word + ", hanging on the wall");
			System.out.print("And if one green bottle ");
			System.out.println("should accidentally fall");
			System.out.print("There'll be " + (n-1) + " green " + word2 + ", ");
			System.out.println("hanging on the wall");
			System.out.println();
		}
		}

}
