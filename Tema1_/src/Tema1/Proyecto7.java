package Tema1;

import java.util.Scanner;

public class Proyecto7 {

	public static void main(String[] args) {
		// 1. Preguntarle al usuario acerca de su año de nacimiento
		System.out.println("¿Hola me podrias decir en que año naciste?");
		// 2. Esperar a que el usuario coneste
		Scanner scanner = new Scanner(System.in);
		Integer numero = scanner.nextInt();
		// 3. Responder indicando la edad del usuario restando el año actual con el de su nacimiento
		Integer numero2 = 2023;
		Integer resultado = numero2 - numero;
		System.out.println("Entonces tienes" + " " + resultado + " " + "años ¿No?");
	}

}
