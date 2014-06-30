import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class FirstClass {

	/**
	 * @param args
	 */
		public static void main(String[] args) {
			System.out.println("Enter any string");
			Scanner scan = new Scanner(System.in);
			String text = scan.nextLine();
			System.out.println(text);
			String splited[] = text.split(" ");
			//for(String str : splited)
				//System.out.println(str);
			//code to find the max lenght sub string
			int max=0, temp=0;
			for(int i = 0; i < splited.length; i++) {
				temp = splited[i].length();
				if(temp >= max){
					max = temp;
				}	
			}
			String spcae;
			for(int i = 1; i <= max+4; i++) {
				System.out.print("*");
			}
			System.out.println();
			for(String str : splited) {
				temp = str.length();
				if(temp < max){
					int diff = max - temp;
					System.out.print("* " + str);
					for(int i = 1; i <= diff; i++){
						System.out.print(" ");
					}
					System.out.println(" *");	
				}					
				else
				System.out.println("* " + str + " *");	
			}	
			for(int i = 1; i <= max+4; i++) {
				System.out.print("*");
			}
			

			
			
			
			/* System.out.println("Enter any number");
			Scanner src = new Scanner(System.in);
			int x = src.nextInt();
			int pro = 1, sum = 0, temp=0, result = 0;
			for(int i = 1; i <= x; i++){
				temp = i;
				while(temp > 0){
					sum += temp % 10;
					pro *= temp % 10;
					temp /= 10;
				}
				result = sum * pro;
				if(i == result)
					System.out.println(result);
				temp = 0;
				sum = 0;
				pro = 1;
			}
					
			
			int len = 0, sum = 0, temp=0 ;
			for(int i = 100; i <= x; i++){
				s = String.valueOf(i);
				len = s.length();
				temp = i;
				while(temp > 0){
					sum += Math.pow(temp % 10, len);
					temp /= 10;
				}
				if(sum == i)
					System.out.println(i);
					sum = 0;
				}
				
				
			}
			*/
		
		/*ArrayList<Integer> list = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = scan.nextInt();

		for (int i = 2; i <= n; i++)
			if (isPrime(i)) 
				if(isPrime(reverse(i)))
					list.add(reverse(i));
	
		Collections.sort(list);
		Collections.reverse(list);
		System.out.println(list);
	}

	public static boolean isPrime(int n) {
		for (int i = 2; i <= (int)Math.sqrt(n); i++)
			if (n % i == 0)
				return false;

		return true; 	
	}

	public static int reverse(int n) {
		return Integer.parseInt(new StringBuffer(String.valueOf(n)).reverse().toString());
	}*/

}
}
