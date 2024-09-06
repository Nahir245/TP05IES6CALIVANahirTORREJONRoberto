package Punto2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Cree un objeto Scanner para leer la entrada
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();
        // si el numero divido dos es o
        if (numero % 2 == 0) {
            
            System.out.println("El número es par y su triple es: " + (numero * 3));
        // caso contrario el resto es distinto de cero entonces es impar
        } else {
            
            System.out.println("El número es impar y su doble es: " + (numero * 2));
        }
        
        // Cierroel objeto Scanner
        scanner.close();
    }
}


        
        