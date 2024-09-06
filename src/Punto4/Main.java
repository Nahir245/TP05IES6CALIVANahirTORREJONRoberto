package Punto4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número entre 1 y 9
        System.out.print("Ingresa un número entero entre 1 y 9: ");
        int numero = scanner.nextInt();

        // Verificar que el número esté en el rango [1,9]
        if (numero < 1 || numero > 9) {
            System.out.println("El número no está en el rango permitido.");
        } else {
            // Mostrar la tabla de multiplicar del número ingresado
            System.out.println("Tabla de multiplicar del " + numero + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
        }
        scanner.close();
    }
}
