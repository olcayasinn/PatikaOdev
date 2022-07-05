import java.util.Scanner;

public class ManavKasa {

	public static void main(String[] args) {
		float ArmutFiyat = 2.14f, ElmaFiyat = 3.67f, DomatesFiyat = 1.11f, MuzFiyat = 0.95f, PatlicanFiyat = 5.00f;
		int Armut, Elma, Domates, Muz, Patlican ;
		float Tutar; 
		Scanner input = new  Scanner(System.in);
		System.out.print("Armut kac kilo? : ");
		Armut = input.nextInt();
		
		System.out.print("Elma kac kilo? : ");
		Elma = input.nextInt();
		
		System.out.print("Domates kac kilo? : ");
		Domates = input.nextInt();
		
		System.out.print("Muz kac kilo? : ");
		Muz = input.nextInt();
		
		System.out.print("Patlican kac kilo? : ");
		Patlican = input.nextInt();
		
		Tutar = ArmutFiyat*Armut + Elma*ElmaFiyat + Domates*DomatesFiyat + Muz*MuzFiyat + Patlican*PatlicanFiyat;
		System.out.print("Toplam Tutar= " + Tutar + "TL");
	}

}
