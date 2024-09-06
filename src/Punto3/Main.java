package Punto3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Ingresa un numero entre 0 y 10:");
		int numero = scanner.nextInt();
		
		if (numero >= 0 && numero <= 10) {
			int factorial = 1;
			int i = numero;
			
			while (i > 1) {
				factorial *= i;
				i--;
		
			}
			System.out.println("El resultado es: " + factorial);
		}

	}

}
