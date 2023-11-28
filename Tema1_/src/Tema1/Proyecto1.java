package Tema1;

import java.util.Scanner;

public class Proyecto1 {

public static Integer valor = 2; 
public static Float pi = 3.14F;
	
	public static void main(String[] args) {
		
		// 1.Solicitamos al usuario el radio de un circulo
		System.out.println("Dame el radio de una circunferencia");
		// 2. Esperamos a que el usuario responda a la frase
		Scanner scanner = new Scanner(System.in);
		Double radio = scanner.nextDouble();
		// 3. Calculamos el area de dicho circulo
		double area = valor * pi * radio;
		System.out.println("El area de la circunferencia seria de "+ area + " metros cuadrados");
		// 4. Calculamos el perimetro de la circunferencia
		Double diametro = radio * radio;
		Double perimetro = pi * diametro;
		System.out.println("Y el perimetro de dicha circunferencia seria de " + perimetro);
		
		
	}

}
