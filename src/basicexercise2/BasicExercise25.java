package basicexercise2;

import java.util.Scanner;

public class BasicExercise25 {

	public static void main(String[] args) {
//Declaramos las variables necesarias, en este caso serán las notas que introducirá el usuario y la nota media.
		int notaPrimer;
		int notaSegundo;
		int notaTercer;
		double notaMedia;
		Scanner read= new Scanner (System.in);
	System.out.println("Introduzca la nota del primer trimestre: ");
			notaPrimer = read.nextInt();
	System.out.println("Introduzca la nota del segundo trimestre: ");
			notaSegundo = read.nextInt();
	System.out.println("Introduzca la nota del primer trimestre: ");
			notaTercer = read.nextInt();
		
			notaMedia = (double)(notaPrimer + notaSegundo + notaTercer)/3;
		System.out.println("La nota media en el boletín es de:" + (int) notaMedia);
		System.out.println("La nota media que aparecerá en el expediente es de: " +  notaMedia);
	}

}
