package Tema1;

import java.util.Scanner;

public class Proyecto9 {

	public static void main(String[] args) {
		// 1. Preguntarle al usuario el precio de un producto sin IVA
		System.out.println("¿Cuanto cuesta este producto sin IVA?");
		// 2. Esperamos a que el usuario responda la pregunta
		Scanner scanner = new Scanner(System.in);
		Float precio = scanner.nextFloat();
		// 3. Calculamos el precio del producto con el IVA estandar
		Float IVA = (float) 1.21;
		Float resultado = precio + IVA;
		System.out.println("Entonces el precio final seria de" + " " + resultado + " " + "euros ¿Verdad?");

	}

}
