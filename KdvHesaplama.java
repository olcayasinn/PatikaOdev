import java.util.Scanner;

public class KdvHesaplama {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Fiyat giriniz: ");
		Double fiyat = input.nextDouble();
		Double kdv = fiyat * 0.18;
		System.out.println("Kdv tutari: " + kdv + "TL");
		double vergili= kdv+fiyat;
		System.out.println("Kdv'li fiyat:" + vergili+ "TL");
	}

}
