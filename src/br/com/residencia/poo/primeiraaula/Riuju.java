package br.com.residencia.poo.primeiraaula;

import java.util.Scanner;

public class Riuju {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println(
				"Which expression equation do you want me to solve?" + "\n 1) 2 + 3 - 5 * 8 - 4 + 354 - 521 + 7 * 66"
						+ "\n 2) 2 + 7 * (14 - 21) + 28 * 3 * 42 + 740 - (156 + 4 + 40) * 9\n");
		if (sc.nextInt() == 1) {
			System.out.println("Result is: " + (2 + 3 - 5 * 8 - 4 + 354 - 521 + 7 * 66));
		} else {
			System.out.print("Result is: " + (2 + 7 * (14 - 21) + 28 * 3 * 42 + 740 - (156 + 4 + 40) * 9));
			sc.close();
		}
	}
}
