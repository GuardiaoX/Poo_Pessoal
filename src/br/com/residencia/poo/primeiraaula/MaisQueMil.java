package br.com.residencia.poo.primeiraaula;

public class MaisQueMil {

	public static void main(String[] args) {
		int result = 0, testf = 1000;
		int[] fours = { 0, 1000, 1000, 1000, 1000 };
		int[] prim = { 0, 1, 2, 3, 5 };
		
		for (int i = 1; i < 5; i++) {
			while (testf % 4 != 0 || testf == fours[i - 1]) {
				testf++;
				if (testf % 4 == 0) {
					fours[i] = testf;
				}
			}
			;
		
		}
		;
		for (int i = 1; i < 5; i++) {
			result = result + fours[i] - prim[i];	
		}
		System.out.println("The result is "+ result);
	}
}