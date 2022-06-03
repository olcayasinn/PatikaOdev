import java.util.Scanner;

public class AnaSinif {

	public static void main(String[] args) {
		
		int mat,fizik,turkce,tarih,muzik;
		Scanner inp = new Scanner(System.in);
		System.out.print("Matematik notunuzu giriniz: ");
		mat = inp.nextInt();
		System.out.print("Fizik notunuzu giriniz: ");
		fizik = inp.nextInt();
		System.out.print("Turkce notunuzu giriniz: ");
		turkce = inp.nextInt();
		System.out.print("Tarih notunuzu giriniz: ");
		tarih = inp.nextInt();
		System.out.print("Muzik notunuzu giriniz: ");
		muzik = inp.nextInt();
		int toplam = mat+fizik+turkce+tarih+muzik;
		double ort = toplam / 5.0;
		boolean sonuc= ort>=60;
		System.out.println("Ortalamaniz: "+ort);
		System.out.println(sonuc ? "Gectiniz." : "Kaldiniz.");
		
	}

}
