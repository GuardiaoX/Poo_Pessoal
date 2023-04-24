package br.com.residencia.poo.primeiraaula;

//import java.util.Locale;
import java.util.Scanner;

public class Termometro {

	public static void main(String[] args) {
		// Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double fah, cels;

		System.out.println("Which convert do you need?\n1)Fahrenheit to celsius \n2)Celsius to fahrenheit");
		if (sc.nextInt() == 1) {
			for (int i = 0; i < 20; i++) {
				System.out.println("\n");
			}
			System.out.println("Tell the fahrenheit temperature: ");
			fah = sc.nextDouble();
			cels = (fah - 32) / 1.8;

			System.out.println(
					String.format("%.2f", fah) + " fahrenheit is " + String.format("%.2f", cels) + " celsius.");
		} else {
			for (int j = 0; j < 20; j++) {
				System.out.println("\n");
			}
			;
			System.out.println("Tell the celsius temperature: ");
			cels = sc.nextDouble();
			fah = (cels * 1.8) + 32;
			System.out.println(
					String.format("%.2f", cels) + " celsius is " + String.format("%.2f", fah) + " fahrenheit.");

		}

		sc.close();
	}

}
