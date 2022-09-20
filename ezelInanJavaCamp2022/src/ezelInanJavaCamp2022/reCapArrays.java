package ezelInanJavaCamp2022;

public class reCapArrays {

	public static void main(String[] args) {
		double[] myList = {1.2,2.1,3.5,4.6};// tek satırlık dizeler yapmak istediğimizde bu şekilde işlem yapabilirizi
		double total=0;
		double max = myList[0];
		
		//değişkenlerini tanımladığımız dizileri for döngüsü içine alarak istediğimiz işlemi yaptırabiliriz. 
		for (double number:myList) {
			if (max<number) {
				max =number;
				}
			total = total + number;// burada bğtğn dizeleri toplama komutu verdik
			System.out.println(number);// burada number list i yazmasını istedik 
		}
		
		System.out.println("toplam=" + total);
		 System.out.println("en Büyük=" + max);
	}
}
