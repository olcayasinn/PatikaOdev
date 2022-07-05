import java.util.Scanner;

public class VucutKitle {

	public static void main(String[] args) {

		double boy,kitle;
		int kilo;
		Scanner input = new Scanner(System.in);
		System.out.print("Lutfen kilonuzu giriniz: ");
		kilo = input.nextInt();
		System.out.print("Lutfen boyunuzu(metre cinsinden) giriniz: ");
		boy = input.nextDouble();
		kitle = kilo / (boy * boy);
		System.out.print("Vucut kitle indeksiniz = " + kitle);
	}

}
