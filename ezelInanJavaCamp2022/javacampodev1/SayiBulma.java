

public class SayiBulma {

	public static void main(String[] args) {
		int[] numbers = new int[] { 1, 2, 5, 7, 9, 0 };
		int findnumber = 5;
		boolean exists=false;
		
		for (int number : numbers) {
			if (number == findnumber) {
				exists = true;
				break;
			}
			
		}
		if (exists) {
			System.out.println(findnumber + " mevcuttur");
		}else {
			System.out.println(findnumber + " mevcut değildir");
		}
	}
}
