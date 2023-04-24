package br.com.residencia.poo.primeiraaula;

import java.util.Scanner;

public class BemVindo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name, lastname;
		

		
		
		System.out.println("What's your name?");
		name = sc.nextLine();
		System.out.println("What's your last name?");
		lastname = sc.nextLine();
		System.out.println("Hello "+name+" "+lastname+", wellcome to the code universe!");
		sc.close();
	}

}
