import java.util.Scanner;

public class Daire {

	public static void main(String[] args) {
		double pi = 3.14;
		double cevre,alan; 
		Scanner input = new Scanner(System.in);
		System.out.print("Yaricapi giriniz: ");
		int r = input.nextInt();
		cevre = 2*pi*r;
		System.out.println("Dairenin cevresi: " + cevre);
		alan = pi*r*r;
		System.out.println("Dairenin alani: " + alan);

		
	}

}
