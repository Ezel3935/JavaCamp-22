package ezelInanJavaCamp2022.javaCamp1Ders;

public class SwitchBlokları {

	public static void main(String[] args) {
		//switch bloklarıyla dallandırma yapılır
		char grade = 'C'; //verilen not ne ise aşağıdaki bloklardan geçerli olanı kullanır.
		
				switch (grade) {
				case 'A':
					System.out.println("Mükemmel, geçtiniz");
					break;
				case 'B':
					System.out.println("çok güzel,geçtiniz");
					break;
				case 'C':
					System.out.println("İyi,Geçtiniz");
					break;
				case 'D':
					System.out.println("Geçtiniz");
					break;
				case 'E':
					System.out.println("Kaldın,git çalış");
					break;
					default: System.out.println("Geçersiz not");
					break;
				}
		}

}
