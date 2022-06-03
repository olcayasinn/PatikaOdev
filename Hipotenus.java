import java.util.Scanner;
public class Hipotenus {

	public static void main(String[] args) {
		int knr1,knr2;
		double hipotenus;
		Scanner girdi = new Scanner(System.in);
		System.out.print("1. Kenari giriniz: ");
		knr1 = girdi.nextInt();
		System.out.print("2. Kenari giriniz: ");
		knr2 = girdi.nextInt();
		hipotenus = Math.sqrt((knr1*knr1)+(knr2*knr2));
		System.out.println("Hipotenus = "+ hipotenus);
	}

}
