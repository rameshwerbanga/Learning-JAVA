import java.util.Scanner;
public class Quiz {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// generate 3 single digit int and ask the user to multiply them and evaluate it
		System.out.println("Multiply the following three int");
		int num1 = (int)(1 + (Math.random() * 9));
		int num2 = (int)(1 + (Math.random() * 9));
		int num3 = (int)(1 + (Math.random() * 9));
		int result = num1 * num2 * num3;
		System.out.print(num1 + " * "+ num2 + " * " + num3 + " = " );
		Scanner input = new Scanner(System.in);
		int ans = input.nextInt();
		if(ans == result)
			System.out.println("Your ans is correct");
		else
			System.out.println("Your ans is wrong, the correct ans is " + result);
		
		
	}

}
