

public class MukemmelSayi {

	public static void main(String[] args) {
		int number = 16;
		int total = 0;
		
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				total = total+i;
			}
			
		}
		
		if (total == number) {
			System.out.println("mükemmel sayıdır");
			
		} else {
			System.out.println("Mükemmel sayı değildir");
		}
		
	}

}
