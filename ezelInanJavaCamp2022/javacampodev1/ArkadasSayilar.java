

public class ArkadasSayilar {

	public static void main(String[] args) {
		// 220-284
		int x = 220;
		int y = 284;
		int toplamx = 0;
		int toplamy = 0;

		for (int i = 1; i < x; i++) {
			if (x % i == 0) {
				toplamx = toplamx + i;
			}

		}
		for (int i = 1; i < y; i++) {
			if (y % i == 0) {
				toplamy = toplamy + i;
				
			}
			
		}
		if (x==toplamy && y==toplamx) {
			System.out.println(" Arkadaş Sayıdır");
			
		} else {
			System.out.println(" Arkadaş Sayı değildir");
			
			
		}
	}

}
