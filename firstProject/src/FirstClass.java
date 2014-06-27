import java.util.Scanner;

public class FirstClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0, i;
		Scanner src = new Scanner(System.in);
		int x = src.nextInt();
		for(i=1; i<= x*2;i+=2){
				a += i;
				//i=i+1;
		}
		System.out.println(a);
		
	
	}

	public static boolean isPrime(int n) {
		for (int i = 2; i <= (int)Math.sqrt(n); i++)
			if (n % i == 0)
				return false;

		return true; 	
	}

}
