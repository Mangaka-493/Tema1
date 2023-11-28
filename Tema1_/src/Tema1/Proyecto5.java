package Tema1;

import java.util.Scanner;

public class Proyecto5 {

	public static void main(String[] args) {
		// 1. Pedirle el nombre al usuario
		System.out.println("¿Hola me podrias decir cual es tu nombre?");
		// 2. Esperar a que el usuario escriba su nombre
		Scanner scanner = new Scanner(System.in);
		String nombre = scanner.nextLine();
		// 3. Responder con un mensaje de bienvenida
		System.out.println("¡Bienvenido" + " " + nombre + "!");
		// 4. Preguntarle al usuario su lugar de procedencia
		System.out.println("¿Y de donde eres exactamente?");
		// 5. Esperar a que el usuario escriba el lugar de donde vive
		String lugar = scanner.nextLine();
		// 6. Preguntarle al usuario como se vive en esa localidad
		System.out.println("¿Ah de" + " " + lugar + "?" + " " + "¿Y que tal se vive en esa localidad?");
		// 7. Esperar a que el usuario responda la pregunta
		String respuesta = scanner.nextLine();
		// 8. Responder con un mensaje de despedida
		System.out.println("¡Gracias, un saludo!");

	}

}
