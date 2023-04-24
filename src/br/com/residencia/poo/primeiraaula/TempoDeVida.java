package br.com.residencia.poo.primeiraaula;

import java.util.Scanner;

public class TempoDeVida {
	static int[] age = new int[6];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int avarage = 0;

		for (int i = 0; i < 6; i++) {
			if (i == 0) {
				System.out.println("How old are you?");

			} else {
				System.out.println("How old is friend " + (i + 1) + "?");
			}
			age[i] = sc.nextInt();
			avarage = avarage + age[i];
		}
		
		avarage = avarage / 6;
		System.out.println("Your avarage age is "+avarage+".")
		;
		sc.close();
	}
}
