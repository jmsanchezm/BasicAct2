package ejerciciotema1;

import java.util.Scanner;

public class EjercicioTema110 {

	public static void main(String[] args) {
		double mLanzamiento; 
		double cmLanzamiento;
		Scanner read = new Scanner (System.in);
		System.out.println("Introduzca la longitud del lanzamiento en metros: ");	
		mLanzamiento = read.nextDouble();
		cmLanzamiento = mLanzamiento*100 ;
		System.out.println("La cantidad es de " + (int) cmLanzamiento + " cm.");
		read.close();
	}

}
