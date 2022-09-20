package ezelInanJavaCamp2022;

public class miniProjeAsalSayi {

	public static void main(String[] args) {

		/*int number = 25;
		int remainder = number % 2;
		System.out.println(remainder);*/

		int sayi = 7;
		boolean isPrime = true;

		for (int i = 2; i < sayi; i++) {
			
			if (sayi % i == 0) {
				isPrime = false;
			}
		}

		if ( isPrime) {
			System.out.println(sayi + " Asaldır.");
			
		} else {
			System.out.println(sayi + " Asal Değildir.");
		}
	}

}

