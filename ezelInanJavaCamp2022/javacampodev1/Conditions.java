
//şart blokları
public class Conditions {

	public static void main(String[] args) {
	int sayi = 14;
	
	if(sayi<20) {
		System.out.println("sayı 20 den küçüktür");//her zaman ilk şart bloğu karşılanıyorsa onu kullanır ve 
		//diğer blokları çalıştırmaz.
	}
	else if (sayi<15){
		System.out.println("sayı 15 den küçüktür");
	}
	else {
		System.out.println("sayi mayi yoktur");
	}
	}

}
