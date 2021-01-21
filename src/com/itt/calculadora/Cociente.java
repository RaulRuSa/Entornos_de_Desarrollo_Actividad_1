package com.itt.calculadora;

/**
 * 
 * La clase <b>Cociente</b> implementa los m�todos que realizan la operaci�n
 * matem�tica b�sica de divisi�n, adicionalmente proporciona los
 * m�todos:calcular el inverso de un n�mero y calcular la ra�z cuadrada de un
 * n�mero
 * 
 * @author Ra�l Ruiz Sanz
 * @version 1.0
 * @since 20-01-2021
 *
 */

public class Cociente {
	/**
	 * Constructor de la clase Resta
	 */
	public Cociente() {

	}

	/**
	 * Realiza la divisi�n de dos n�meros reales</br>
	 * Casos especiales:</br>
	 * <ul>
	 * <li>Si el divisor tiene valor 0 se mostrar� el mensaje "El divisor no puede
	 * tomar el valor 0"</li>
	 * </ul>
	 * 
	 * @param num1 es el dividendo de la divisi�n
	 * @param num2 es el divisor de la divisi�n
	 * @return devuelve la divisi�n de num1 entre num2
	 */

	public static double divReales(double num1, double num2) {

		return (num1 / num2);
	}

	/**
	 * Realiza la divisi�n de dos n�meros enteros devolviendo un n�mero entero</br>
	 * Casos especiales:</br>
	 * <ul>
	 * <li>Si el divisor tiene valor 0 se mostrar� el mensaje "El divisor no puede
	 * tomar el valor 0"</li>
	 * <li>Si la divisi�n no es exacta podemos consultar el resto con el operador
	 * modulo</li>
	 * <ul>
	 * <li>Ejemplo: resto=num1%num2</li>
	 * </ul>
	 * </ul>
	 * 
	 * @param num1 es el dividendo de la divisi�n
	 * @param num2 es el divisor de la divisi�n
	 * @return devuelve la divisi�n de num1 entre num2
	 */

	public static int divEnteros(int num1, int num2) {

		return (num1 / num2);
	}

	/**
	 * Calcula el inverso de un n�mero</br>
	 * Casos especiales:</br>
	 * <ul>
	 * <li>El inverso de 0 devolver� 0</li>
	 * </ul>
	 * 
	 * @param num1 n�mero del que queremos calcular el inverso
	 * @return devuelve la divisi�n de 1 entre num1</br>
	 */
	public static double inverso(double num) {

		return (1 / num);
	}

	/**
	 * Calcula la ra�z cuadrada de un n�mero entero</br>
	 * Casos especiales:</br>
	 * <ul>
	 * <li></li>
	 * </ul>
	 * 
	 * @param num1 n�mero del que queremos calcular la ra�z cuadrada
	 * @return devuelve ra�z cuadrada de num1</br>
	 */
	public static double raiz(int num) {

		return (0);
	}

}
