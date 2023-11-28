package Tema1;

import java.util.Scanner;

public class Proyecto3 {

	public static void main(String[] args) {
		// 1. Solicitamos al usuario dos numeros enteros
				System.out.println("Introduzca dos numeros enteros");
				// 2. Esperamos a que el usuario responda la pregunta
				Scanner scanner = new Scanner(System.in);
				String numero1 = scanner.nextLine();
				String numero2 = scanner.nextLine();
				// 3. Multiplicamos ambos numeros enteros
				Integer conversion1;
				conversion1 = Integer.parseInt(numero1);
				Integer conversion2;
				conversion2 = Integer.parseInt(numero2);
				Integer resultado = conversion1 * conversion2;
				// 4. Respondemos mostrando el resultado de dicha multiplicacion
				System.out.println("El resultado es " + resultado);
				
		
	}

}
