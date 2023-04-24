package br.com.residencia.poo.primeiraaula;

import java.util.Scanner;

public class MiniCalculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] maths = new int[6];

		System.out.println("What's the first number?");
		maths[0] = sc.nextInt();
		System.out.println("What's the second number?");
		maths[1] = sc.nextInt();
		maths[2] = maths[0] + maths[1];
		maths[3] = maths[0] - maths[1];
		maths[4] = maths[0] * maths[1];
		maths[5] = maths[0] / maths[1];

		System.out.println(" Number 1: " + maths[0] + "\n Number 2 :" + maths[1] + "\n Sum: " + maths[2]
				+ "\n Subtraction: " + maths[3] + "\n Multiplication: " + maths[4] + "\n Division: " + maths[5]);

		sc.close();
	}

}
