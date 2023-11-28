package Tema1;

import java.util.Scanner;

public class Proyecto6 {

	public static void main(String[] args) {
		
		// 1. Preguntarle su edad al usuario
		System.out.println("¿Hola me podrias decir cuantos años tienes?");
		// 2. Esperar a que el usuario responda a la pregunta
		Scanner scanner = new Scanner(System.in);
		Integer edad = scanner.nextInt();
		// 3. Responder con un mensaje que indique la edad que dijo el usuario
		System.out.println("Su edad es de" + " " + edad + " " + "años.");

	}

}
