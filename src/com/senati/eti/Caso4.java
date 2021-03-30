package com.senati.eti;
import java.util.Scanner;
public class Caso4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Integer [] numero = new Integer[5];
		
		int num_par = 0, num_impar = 0;
		float sumatoria = 0, promedio = 0;
		
		System.out.println("Ingreso de n�meros");
		System.out.println("==================");
		
		for (int x = 0; x < numero.length; x++) {
			System.out.print("Ingrese n�mero " + (x + 1) + ": ");
			numero[x] = sc.nextInt();
		}
		
		for (int x = 0; x < numero.length; x++) {
			if (numero[x] % 2 == 0)
				num_par += 1;
			else
				num_impar += 1;
			
			sumatoria += numero[x];
		}
		
		promedio = sumatoria / 5;
		
		System.out.println("-----------------------------");
		System.out.println("---- R E S U L T A D O S ----");
		System.out.println("------------------------- ---");
		System.out.println("Cantidad de n�meros pares: " + num_par);
		System.out.println("Cantidad de n�meros impares: " + num_impar);
		System.out.println("Promedio: " + promedio);
	}
}