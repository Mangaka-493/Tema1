package Tema1;

import java.util.Scanner;

public class Proyecto4 {

	public static void main(String[] args) {

		// 1. Le preguntamos al usuario su numero favorito
		System.out.println("¿Podrias decirme cual es tu numero favorito?");
		// 2. Esperamos a que el usuario responda la pregunta
		Scanner scanner = new Scanner(System.in);
		Integer numeroFavorito = scanner.nextInt();
		scanner.nextLine();
		// 3. Le preguntamos al usuario su ciudad favorita
		System.out.println("¿Ahora podrias decirme cual es tu ciudad favorita?");
		// 4. Esperamos a que el usuario conteste la pregunta
		String ciudadFavorita = scanner.nextLine();
		// 5. Respondemos con un mensaje de agradecimiento
		System.out.println("De acuerdo, ¡Muchas Gracias!");
		
	}

}
