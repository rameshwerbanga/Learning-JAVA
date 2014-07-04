import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class FirstClass {

	/**
	 * @param args
	 */
		public static void main(String[] args) {
			//Ascii to char conversion
			Scanner input = new Scanner(System.in);
			System.out.println("Enter one ascii value");
			int alpha = input.nextInt();
			char a = (char) alpha;
			System.out.println(a);
		}
}