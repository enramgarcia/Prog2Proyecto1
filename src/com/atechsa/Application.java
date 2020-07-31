package com.atechsa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {
	
	private static BufferedReader bfr;

	public static void main(String[] args) throws IOException {
		bfr = new BufferedReader(new InputStreamReader(System.in));
		
		do {
			menu();
			
			System.out.print("Desea continuar? (s/N): ");
		} while(bfr.readLine().toLowerCase().equals("s"));
	}
	
	public static void menu() throws NumberFormatException, IOException {
		int opcion;
		
		System.out.println("\tMenu");
		System.out.println("1- Sumar dos números enteros");
		System.out.println("2- Restar dos números enteros");
		System.out.println("3- Dividir dos números enteros");
		System.out.println("4- Multiplicar dos números enteros");
		System.out.print("Ingrese opciones 1-4: ");
		
		opcion = Integer.parseInt(bfr.readLine());
		
		switch (opcion) {
			case 1:
				sumar();
				break;
				
			case 2:
				restar();
				break;
				
			case 3:
				dividir();
				break;
				
			case 4:
				multiplicar();
				break;
				
				default:
					System.out.println("Opción no válida, imprimiendo menu otra vez.");
					menu();
					return;
		}
	}
	
	public static int preguntarNumero() throws NumberFormatException, IOException {
		System.out.print("Entregrese número: ");
		return Integer.parseInt(bfr.readLine());
	}
	
	public static void imprimirResultador(char operacion, int a, int b, int r) {
		System.out.println(String.format("%d %c %d = %d", a, operacion, b, r));
	}

	public static void sumar() throws NumberFormatException, IOException {
		int a = preguntarNumero(),
			b = preguntarNumero();
		
		imprimirResultador('+', a, b, (a+b));
	}
	
	public static void restar() throws NumberFormatException, IOException {
		int a = preguntarNumero(),
			b = preguntarNumero();
		
		imprimirResultador('-', a, b, (a+b));
	}
	
	public static void dividir() throws NumberFormatException, IOException {
		int a = preguntarNumero(),
			b = preguntarNumero();
		
		System.out.println(String.format("%d / %d = %.2f", a, b,((float)a/b)));
	}
	
	public static void multiplicar() throws NumberFormatException, IOException {
		int a = preguntarNumero(),
			b = preguntarNumero();
			
			imprimirResultador('*', a, b, (a*b));
	}
}
