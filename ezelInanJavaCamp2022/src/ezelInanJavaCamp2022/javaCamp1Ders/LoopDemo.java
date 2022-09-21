package ezelInanJavaCamp2022.javaCamp1Ders;

public class LoopDemo {
//bir değişken default olarak tanımlandıysa sadece tanımlandığı yerde geçerlidir. yani for döngüsünde tanımlandıysa for döngüsünde geçerli olacaktır.
	// eğer int=1 yaparsak tanımlanan değişken hep 1 olarak kalacağı için sonsuz
	// döngü(infinite loop) olacaktır.
	public static void main(String[] args) {
		// FOR
		for (int i = 1; i < 10; i++) {
			System.out.println(i);
		} // döngü başladıktan sonra gerekli şartlar sağlanana kadar devam eder. yani bu
			// durumda i 1 den başladığı için
			// i=10 olana kadar kod çalışacaktır
		System.out.println("Döngü sonlandı.");// i<10 ifadesine göre sonlandırma noktası oluşturuyoruz.

		for (int i = 1; i < 10; i += 2) {// i+=2 yaptığımız için 2 li artacaktır sayı
			System.out.println(i);
		}
		System.out.println("Döngü sonlandı.");// i<10 ifadesine göre sonlandırma noktası oluşturuyoruz.

		
		// WHILE
		int i = 1;// değişken değerini burada belirtiyoruz
		while (i < 10) {
			System.out.println(i);
			i++;
		} // eğer int=1 yaparsak ve herhangi bir sonlandırma noktası belirtmezsek,
			// tanımlanan değişken hep 1 olarak kalacağı için sonsuz döngü(infinite loop)
			// olacaktır.bu yüzden default değişken tanımlanıyor.

		System.out.println("while döngüsü çalıştırıldı.");
		
		
		//DO- WHILE DÖNGÜSÜ
		//do-while döngüsünde program satır satır çalışır.yani j=100 yaparsak 100 yazdırır j<10 olsa bile ama
		//wile döngüsünde şart sağlanıyorsa çalışır yani int=20 yaparsak yukarıdaki örnekte bu döngü de i<10 olduğu için while şartı sağlanamaz, döngüye girmez ve çalışmaz 
		int j=1;
		do {
			System.out.println(j);
			j++;
		} while (j<10);
		System.out.println("do-while döngüsü çalıştırıldı.");
		
	}

}
