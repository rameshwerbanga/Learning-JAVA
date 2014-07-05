
public class leapYear {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// find leap year between 2001 to 2100
		System.out.println("Leap years between 2001 to 2100 are:");
		for(int i = 2001; i <= 2100; i++){
			if((i % 4 == 0 && i % 100 != 0 ) || i % 400 == 0)
				System.out.println(i);
		}

	}

}
