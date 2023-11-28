package Tema1;

import java.util.Scanner;

public class Proyecto8 {

	public static void main(String[] args) {
		// 1. Preguntarle al usuario cuanto dinero le gustaria ganar al año
		System.out.println("Oye, ¿Cuanto dinero te gustaria ganar anualmente?");
		// 2. Esperar a que el usuario conteste indicando la cantidad
		Scanner scanner = new Scanner(System.in);
		Integer cantidad = scanner.nextInt();
		// 3. Responder indicando la cantidad que ganaria mensualmente
		Integer meses = 12;
		Integer resultado = cantidad / meses;
		System.out.println("Entonces estarias ganando un total de" + " " + resultado + " " + "euros mensuales ¿Cierto?");

	}

}
