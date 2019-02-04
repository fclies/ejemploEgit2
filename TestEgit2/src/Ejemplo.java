
public class Ejemplo {

	public static void main(String[] args) {
		/*
		 * Programa Java que realize lo siguiente: declarar una variable N de
		 * tipo int, una variable A de tipo double y una variable C de tipo char
		 * y asigna a cada una un valor. A continuaci�n muestra por pantalla: el
		 * valor de cada variable, la suma de N + A, la diferencia de A - N y el
		 * valor num�rico correspondiente al car�cter que contiene la variable
		 * C.
		 */

		int n = 4;
		double a = 7.2;
		char c = 'n';

		// Mostrar el valor de cada variable:

		System.out.println("N = " + n);
		System.out.println("A = " + a);
		System.out.println("C = " + c);
		// Mostrar la suma de N + A:

		double suma = n + a;
		System.out.println("La suma de la variable N (" + n + ") m�s la variable A (" + a + ") da como 		resultado " + suma);

		// Mostrar la diferencia de A - N:

		double resta = a - n;

		System.out.println(
				"La resta de la variable A (" + a + ") m�s la variable N (" + n + ") da como resultado " + resta);
		
		// Mostrar el valor num�rico de la variable C:

		int cNum = (int) c;

		System.out.println("El valor num�rico de la variable C (" + c + ") es " + cNum);

	}

}
