package org.institutoserpis.ed;

public class suma10profe {
	public static void main(String[] args){
		int contador = 1;
		int suma = 0;
		while(contador<=10){
			suma+=contador;
			contador ++;
		}
		System.out.println("El resultado de la suma : "+suma );
	}
}
