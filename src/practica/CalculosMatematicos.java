package practica;

import java.util.ArrayList;
/**
 * @author PaulaSanchez
 * @since 22-04-2025
 */
public class CalculosMatematicos {
	/**
	 * constructor
	 */
	public CalculosMatematicos() {		
	}
	/**
	 * devuelve por pantalla el maximo común divisor de 2 números
	 * @param numA int
	 * @param numB int
	 */
	public void calcularMCD(int numA, int numB) {
		int a = numA, b = numB;
		while (b != 0) {
		int temp = b;
		b = a % b;
		a = temp;
		}
		System.out.println("El máximo común divisor de "+numA+ " y "+numB+" es " + a);
		}

	/**
	 * 
	 * @param numero int
	 * calcula los factoriales de un numero y los devuelve por pantalla, además de dar un mensaje indicando si el número es o no primo, utilizando los metodos noesprimo y factoriales
	 */

	public void calculosRefactorizados(int numero) {
		
		
		// Calculamos los factoriales primos
		ArrayList<Integer> miArray = new ArrayList();
		boolean noEsPrimo = false;
		//Añadimos el 1
		miArray.add(1);
		
		noEsPrimo = noEsPrimo(numero, miArray, noEsPrimo);			
		
		System.out.println("Los factoriales primos del número introducido son: "+miArray);
		
		for (int  i = 2; i< numero ; i++) {
			noEsPrimo = false;			
			if(numero%i==0) {
				noEsPrimo = true;				
				i=numero;
			}
		}
		
		if(noEsPrimo) {
			System.out.println("El número "+numero+ " NO es primo");
		} else System.out.println("El número "+numero+ " SI es primo");
	}
/**
 *  metodo para comprobar si un numero es o no primo
 * @param numero int
 * @param miArray ArrayList
 * @param noEsPrimo boolean 
 * @return 
 * devuelve un booleano, si el booleano es true el numero no es primo, y si es false el booleano es primo
 */
	public boolean noEsPrimo(int numero, ArrayList<Integer> miArray, boolean noEsPrimo) {
		int j;
		for (int  i = 2; i< numero ; i++) {
			noEsPrimo = false;
			j = 2;
			noEsPrimo = factorialesPrimos(noEsPrimo, j, i);
			if(!noEsPrimo&&numero%i==0) {
				miArray.add(i);								
			}
			
		}
		return noEsPrimo;
	}
/**
 * metodo para comprobar que factoriales son primos
 * @param noEsPrimo
 * @param j int
 * @param i int
 * @return devuelve un booleano que determina si cada uno de los factoriales es primo
 */
	public boolean factorialesPrimos(boolean noEsPrimo, int j, int i) {
		while(j<i) {
			if(i%j==0) {
				noEsPrimo = true;
				j=i;				
			} else j++;
		}
		return noEsPrimo;
	}			
}
