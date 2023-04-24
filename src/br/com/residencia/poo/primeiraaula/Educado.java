package br.com.residencia.poo.primeiraaula;

import java.util.Scanner;

public class Educado {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nickname;

		System.out.println("What's your name?");
		sc.nextLine();
		System.out.println("How do you want to be called?");
		nickname = sc.nextLine();
		System.out.println("\nHello dear " + nickname + "!");
		sc.close();
	}
}
