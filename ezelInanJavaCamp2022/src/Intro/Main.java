package Intro;

public class Main {
	//main javada başlangıç noktasıdır
	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		String ortaMetin = "İlginizi çekebilir";
		String altMetin = "Vade Süresi"; //= ile veri atama işlemi yapılır. Değişken isimlendirmeleri camel case yazılır.
		
		System.out.println(ortaMetin);
		
		int vade = 12;
		
		double dolarDun = 18.14;
		double dolarBugun = 18.10;
		
		 boolean dolarDustuMu =  false;

         String okYonu = "";
         
         if (dolarBugun<dolarDun) {
        	okYonu = "down.swg";
			System.out.println(okYonu);
		} 
         else if (dolarBugun>dolarDun) {
			okYonu = "up.swg";
			System.out.println(okYonu);
		}
         else {
        	 okYonu = "equal.swg";
 			System.out.println(okYonu);
		}

		//array
         
         String[] krediler = {"hızlı kredi", "Maaşını Halkbanktan","Mutlu Emekli"};
         for (int i = 0; i < krediler.length; i++) {
        	 System.out.println(krediler[i]);
			
		}
		}
	}
