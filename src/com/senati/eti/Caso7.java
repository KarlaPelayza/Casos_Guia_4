package com.senati.eti;
import java.util.Scanner;
public class Caso7 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int x=0;
			int [][] lista = new int[3][4];
			
			System.out.println("Ingrese los numeros para la matriz");
			System.out.println("----------------------------------");
			
			int num_mayor = 0,num_menor = 0;
			float promedio=0, sumatoria=0;
			
			for (int f = 0; f < lista.length; f++) {
				for (int c = 0; c < lista[0].length; c++) {
					x++;
					System.out.print("Número " + x +"(F" + (f+1) + ",C"+ (c+1)+"):");
					lista[f][c] = sc.nextInt();
					
					if (f == 0 && c == 0) {
						num_mayor = lista[f][c];
						num_menor = lista[f][c];
						sumatoria += lista[f][c];
						promedio = sumatoria/12;
					}
					
					if (lista[f][c] > num_mayor) num_mayor = lista[f][c];
					if (lista[f][c] < num_menor) num_menor = lista[f][c];
				}
			}
			
			System.out.println("---------------------------");
			System.out.println("--- R E S U L T A D O S ---");
			System.out.println("---------------------------");
			System.out.println("Número mayor: " + num_mayor);
			System.out.println("Número menor: " + num_menor);
			System.out.println("Sumatoria: " + sumatoria);
			System.out.println("Promedio: " + promedio);
	
		}
	}