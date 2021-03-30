package com.senati.eti;
import java.util.Scanner;
public class Caso2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] numero = new int[5];
		
		System.out.println("Ingreso de números");
		System.out.println("==================");
		
		int num_mayor = 0, num_menor = 0, sumatoria = 0;
		

		for (int x =0; x < numero.length; x++) {
			System.out.print("Número " + (x + 1) + ": ");
			numero[x] = sc.nextInt();
			
			if (x == 0) {
				num_mayor = numero[x];
				num_menor = numero[x];
			}
			if (numero[x] > num_mayor) num_mayor = numero[x];
			
			if (numero[x] < num_menor) num_menor = numero[x];
			
			sumatoria += numero[x];
		}
		
		System.out.println("\n--- R E S U L T A D O S ---");
		System.out.println("Número mayor: " + num_mayor);
		System.out.println("Número menor: " + num_menor);
		System.out.println("Sumatoria: " + sumatoria);
	}
}