package org.institutoserpis.ed;

import java.util.Scanner;

public class SumaProfe {
	public static void main(String[] args){
		System.out.println("Programa para sumar dos numeros.");
		System.out.print("Introduce el primero : ");
		Scanner scanner = new Scanner(System.in);
		String primerDato = scanner.nextLine();
		
		System.out.println("Has introducido : " +primerDato);
		scanner.close();
	}
}
