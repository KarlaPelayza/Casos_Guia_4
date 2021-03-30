package com.senati.eti;
import java.util.Scanner;
public class Casos5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] arrCodigo = {"A-123", "A-456", "A-789", "A-777"};
		String[] arrNombre = {"Joe Castillo", "Rosa Flores", "Carla Ramos", "Ricardo Paredes"};
		int[] arrNota = {15, 10, 17, 8};
		
		System.out.println("Búsqueda de datos");
		System.out.println("=================");
		System.out.print("Ingrese código: ");
		String codigo = sc.nextLine();
		
		int p = -1;
		
		for (int x = 0; x < arrCodigo.length; x++) {
			if (codigo.equals(arrCodigo[x])) {
				p = x;
				break;
			}
		}
		
		String estado = "Desaprobado";
		
		if (arrNota[p] >= 13)
			estado = "Aprobado";
		
		if (p == -1) {
			System.out.println("\n====================");
			System.out.println("CÓDIGO NO ENCONTRADO");
			System.out.println("====================");
		}
		else {
			System.out.println("\n=================");
			System.out.println("CÓDIGO REGISTRADO");
			System.out.println("=================");
			System.out.println("Codigo: " + arrCodigo[p]);
			System.out.println("Alumno(a): " + arrNombre[p]);
			System.out.println("Nota: " + arrNota[p]);
			System.out.println("Estado: " + estado);
		}
	}
}