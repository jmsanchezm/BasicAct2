package basicexercise2;

import java.util.Scanner;

public class BasicExercise23 {

	public static void main(String[] args) {
//Declaramos las variables que necesitamos.
			int numero;
			int	resto;
			boolean par;
//Creamos el Scanner.
		Scanner readnum = new Scanner(System.in);
//Solicitamos al usuario introducir un número al azar para verificar si es verdadero o falso.
	System.out.println("Introduzca un número para saber si es par: ");
				numero= readnum.nextInt();
//Calculamos el módulo del número introducido que nos dirá el resto de la división. 
				resto = numero % 2 ;
//Le ponemos la condición al boolean de si e
					par =  resto == 0 ;
	System.out.println(resto);
//Finalmente, cerramos el Scanner.
readnum.close();

	}

}
