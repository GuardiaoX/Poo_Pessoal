package br.com.residencia.poo.primeiraaula;

import java.util.Locale;

public class BalancoTrimestral {
	static double gastos_meses[] = { 15000.00, 23000.00, 17000.00 };
	static double gastos_total = 0.0;

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		for (int i = 0; i < 3; i++) {
			System.out.println("Adicionando: " + gastos_meses[i] + "\n");
			gastos_total += gastos_meses[i];
		}
		System.out.println("O total de gastos desse trimestre foram: " + gastos_total);
	}
}
