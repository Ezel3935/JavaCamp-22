package ezelInanJavaCamp2022.javaCamp1Ders;

public class SesliHarfler {

	public static void main(String[] args) {
		char harf='E';
		
		
		switch (harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Kalın sesli harf");
			break;

		default:
			System.out.println("İnce sesli harf");
			break;
		}

	}

}
