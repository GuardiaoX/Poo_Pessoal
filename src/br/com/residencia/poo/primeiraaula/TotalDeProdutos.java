package br.com.residencia.poo.primeiraaula;

import java.util.Scanner;

public class TotalDeProdutos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sold;

		System.out.println("How many products do you want to buy?");
		sold = sc.nextInt();
		for (int i = 0; i < 20; i++) {
			System.out.println("\n");
		}
		System.out.println("Congradulations, you just bought " + sold + " products!!!");

		sc.close();
	}

}
