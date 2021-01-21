package com.itt.calculadora;

/**
 * 
 * La clase <b>Cociente</b> implementa los métodos que realizan la operación
 * matemática básica de división, adicionalmente proporciona los
 * métodos:calcular el inverso de un número y calcular la raíz cuadrada de un
 * número
 * 
 * @author Raúl Ruiz Sanz
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
	 * Realiza la división de dos números reales</br>
	 * Casos especiales:</br>
	 * <ul>
	 * <li>Si el divisor tiene valor 0 se mostrará el mensaje "El divisor no puede
	 * tomar el valor 0"</li>
	 * </ul>
	 * 
	 * @param num1 es el dividendo de la división
	 * @param num2 es el divisor de la división
	 * @return devuelve la división de num1 entre num2
	 */

	public static double divReales(double num1, double num2) {

		return (num1 / num2);
	}

	/**
	 * Realiza la división de dos números enteros devolviendo un número entero</br>
	 * Casos especiales:</br>
	 * <ul>
	 * <li>Si el divisor tiene valor 0 se mostrará el mensaje "El divisor no puede
	 * tomar el valor 0"</li>
	 * <li>Si la división no es exacta podemos consultar el resto con el operador
	 * modulo</li>
	 * <ul>
	 * <li>Ejemplo: resto=num1%num2</li>
	 * </ul>
	 * </ul>
	 * 
	 * @param num1 es el dividendo de la división
	 * @param num2 es el divisor de la división
	 * @return devuelve la división de num1 entre num2
	 */

	public static int divEnteros(int num1, int num2) {

		return (num1 / num2);
	}

	/**
	 * Calcula el inverso de un número</br>
	 * Casos especiales:</br>
	 * <ul>
	 * <li>El inverso de 0 devolverá 0</li>
	 * </ul>
	 * 
	 * @param num1 número del que queremos calcular el inverso
	 * @return devuelve la división de 1 entre num1</br>
	 */
	public static double inverso(double num) {

		return (1 / num);
	}

	/**
	 * Calcula la raíz cuadrada de un número entero</br>
	 * Casos especiales:</br>
	 * <ul>
	 * <li></li>
	 * </ul>
	 * 
	 * @param num1 número del que queremos calcular la raíz cuadrada
	 * @return devuelve raíz cuadrada de num1</br>
	 */
	public static double raiz(int num) {

		return (0);
	}

}
