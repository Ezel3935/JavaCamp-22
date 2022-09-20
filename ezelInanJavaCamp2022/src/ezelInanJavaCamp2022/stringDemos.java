package ezelInanJavaCamp2022;

public class stringDemos {

	public static void main(String[] args) {
		String msg = "bugün hava çok güzel!";
		System.out.println(msg);

		System.out.println("eleman sayısı:" + msg.length());
		System.out.println("5.eleman:" + msg.charAt(4));
		System.out.println(msg.concat(" yaşasın!!!"));//concat birleştirme komutudur.
		System.out.println(msg.startsWith("b"));//boolean 
		System.out.println(msg.endsWith("!"));//boolean
		
		char[] karakterler= new char[5];
		msg.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
			System.out.println(msg.indexOf("a"));
			System.out.println(msg.lastIndexOf("e"));
		

	}

}
