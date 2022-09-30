package basicexercise2;

import java.util.Scanner;

public class Basicexercises2 {

	public static void main(String[] args) {
//Declaramos las variables .
			double kgperas;
			double kgmanzanas;
			double beneAnual;
//Creamos el Scanner, que nos permitirá leer los datos introducidos por el usuario.
		Scanner read = new Scanner(System.in);
//Solicitamos al usuario una cifra, los cuales son los kilos vendidos anualmente.
		System.out.print("Intrduzca los kilos vendidos de peras: ");
				kgperas = read.nextDouble();
		System.out.print("Introduzca los kilos vendidos de manzanas: ");
				kgmanzanas = read.nextDouble();
//Declaramos las constantes, que en este caso será elprecio por kilo de cada fruta.
				final double PRECIO_MANZ = 2.35;
				final double PRECIO_PERA = 1.95;
// Calculamos los beneficios.
					  kgmanzanas *= PRECIO_MANZ;
					  kgperas *= PRECIO_PERA;
					  beneAnual = kgmanzanas + kgperas;
//Como resultado, se le mostrará en pantalla al usuario, el número de beneficios obtenidos en el año.
		System.out.println("Los beneficios anuales obtenidos es de "+ beneAnual + " euros.");
//Cerramos el Scanner.
			read.close();
	}

}
