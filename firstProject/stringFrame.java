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
			