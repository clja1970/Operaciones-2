package es.studium.Operaciones2;

import java.util.Scanner;

public class Operaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int numero1, numero2;
		System.out.println("Dame un número ");
		numero1 = teclado.nextInt();
		System.out.println("Dame otro número ");
		numero2 = teclado.nextInt();
		System.out.println("La suma de los dos números es: " + sumafun(numero1, numero2));
		System.out.println("La resta de los dos números es: " + restafun(numero1, numero2));
		System.out.println("El producto de los dos números es: " + productofun(numero1, numero2));
		teclado.close();
		if (numero2 != 0) {
			System.out.println("La división de los dos número es: " + cocientefun((float) numero1, (float) numero2));
		} else {
			System.out.println("La division no se puede hacer");
		}
	}

	public static int sumafun(int a, int b) {
		return a + b;
	}

	public static int restafun(int a, int b) {
		return a - b;
	}

	public static int productofun(int a, int b) {
		return a * b;
	}

	public static float cocientefun(float a, float b) {
		return a / b;
	}
}
