package practica;

import java.util.ArrayList;

public class CalculosMatematicos {
	
	public CalculosMatematicos() {		
	}
	public void calcularMCD(int numA, int numB) {
		int a = numA, b = numB;
		while (b != 0) {
		int temp = b;
		b = a % b;
		a = temp;
		}
		System.out.println("El máximo común divisor de "+numA+ " y "+numB+" es " + a);
		}


	public void calculos(int numero) {
		
		
		// Calculamos los factoriales primos
		ArrayList<Integer> miArray = new ArrayList();
		boolean noEsPrimo = false;
		int j;
		
		//Añadimos el 1
		miArray.add(1);
		
		for (int  i = 2; i< numero ; i++) {
			noEsPrimo = false;
			j = 2;
			while(j<i) {
				if(i%j==0) {
					noEsPrimo = true;
					j=i;				
				} else j++;
			}
			if(!noEsPrimo&&numero%i==0) {
				miArray.add(i);								
			}
			
		}			
		
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
}
