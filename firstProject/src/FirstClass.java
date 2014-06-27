import java.util.Scanner;

public class FirstClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = scan.nextInt();

		for (int i = 2; i <= n; i++)
			if (isPrime(i)) 
				if(isPrime(reverse(i)))
					System.out.println(reverse(i));
	}

	public static boolean isPrime(int n) {
		for (int i = 2; i <= (int)Math.sqrt(n); i++)
			if (n % i == 0)
				return false;

		return true; 	
	}

	public static int reverse(int n) {
		return Integer.parseInt(new StringBuffer(String.valueOf(n)).reverse().toString());
	}
}
