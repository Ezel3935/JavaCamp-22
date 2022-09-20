package ezelInanJavaCamp2022;

public class arraysDemo {

	public static void main(String[] args) {
		String ogrenci1="Ezel";
		String ogrenci2="Furkan";
		String ogrenci3="Edi";
		String ogrenci4="Emre";
		String ogrenci5="Taha";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		System.out.println(ogrenci5);
		
		System.out.println("----------------");
		//burada index oluştuurup arrayleri for döngüsüyle sıraladık
		String[] ogrenciler = new String[3];
		
		ogrenciler[0]="Ezel";
		ogrenciler[1]="Furkan";
		ogrenciler[2]="Edi";
		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]); //dizilerde verdiğin [] değerin dışına çıkarsan index out of bound hatası alırsın 
			
		}
		for (String ogrenci:ogrenciler) {
			System.out.println(ogrenci);
		}
	}

}
