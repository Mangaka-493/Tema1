package Tema1;

import java.util.Scanner;

public class Proyecto_10 {

	public static void main(String[] args) {
		// 1. Preguntarle al usuario cual es su altura
		System.out.println("¿Oye podrias decirme tu estatura?");
		// 2. Esperamos a que el usuario responda la pregunta
		Scanner scanner = new Scanner(System.in);
		Float estatura = scanner.nextFloat();
		// 3. Preguntarle al usuario cuanto pesa
		System.out.println("¿Y cuanto pesas?");
		// 4. Esperamos a que el usuario responda la pregunta
		Integer peso = scanner.nextInt();
		// 5. Recogemos los datos y calculamos el IMC
		Float estaturaAlCuadrado = estatura * 2;
		Float resultado = peso / estaturaAlCuadrado;
		// 6. Mostramos el resultado de dicho IMC
		System.out.println("Entonces tu IMC seria de" + " " + resultado + " " + "¿Verdad?");
		
	}

}
