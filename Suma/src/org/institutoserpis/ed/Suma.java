package org.institutoserpis.ed;
import java.util.Scanner;

public class Suma {
	public static void main(String[] args) {
		double num1, num2;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Programa para sumar dos numeros: ");
		System.out.print("Introduce el primer numero : ");
		num1 = teclado.nextDouble();
		System.out.print("Introduce el segundo numero : ");
		num2 = teclado.nextDouble();
		double sumatotal = num1+num2;
		System.out.println("El resultado de la suma es : "+sumatotal);
		teclado.close();
	}
}

