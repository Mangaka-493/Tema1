package Tema1;

import java.util.Scanner;

public class Proyecto2 {

	public static void main(String[] args) {
		// 1. Solicitamos al usuario dos numeros enteros
		System.out.println("Dame dos numeros enteros");
		// 2. Esperamos a que el usuario responda la pregunta
		Scanner scanner = new Scanner(System.in);
		Integer numero1 = scanner.nextInt();
		Integer numero2 = scanner.nextInt();
		// 3. Multiplicamos ambos numeros enteros
		Integer resultado = numero1 * numero2;
		System.out.println("El resultado seria " + resultado);

	}

}
