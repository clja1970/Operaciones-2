package es.studium.Operaciones2;

import java.util.Scanner;

public class Operaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int numero1, numero2;
		System.out.println("Dame un n�mero ");
		numero1 = teclado.nextInt();
		System.out.println("Dame otro n�mero ");
		numero2 = teclado.nextInt();
		System.out.println("La suma de los dos n�meros es: " + sumafun(numero1, numero2));
		System.out.println("La resta de los dos n�meros es: " + restafun(numero1, numero2));
		System.out.println("El producto de los dos n�meros es: " + productofun(numero1, numero2));
		teclado.close();
		if (numero2 != 0) {
			System.out.println("La divisi�n de los dos n�mero es: " + cocientefun((float) numero1, (float) numero2));
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
