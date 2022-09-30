package basicexercise2;

import java.util.Scanner;

public class BasicExercise22 {

	public static void main(String[] args) {
		
//Declaramos las variables neceasrias.
			int edad;
			boolean mayorEdad;
//Creamos el Scanner para que la máquina pueda leer los datos introducidos por el usuario.
		Scanner readedad = new Scanner (System.in);
		System.out.println("Introduzca su edad para verificar si es mayor de edad: ");
				edad = readedad.nextInt(); 
/*Al utilizar un boolean , según el dato introducido, se le devolverá al usuario  true o 
	false, dependiendo de si es mayor o menor de edad.*/
				mayorEdad= edad >= 18 ;
//A continuación se le mostrará en pantalla al usuario la respuesta.
			System.out.println(mayorEdad);
//Finalmente, cerramos el Scanner.
			readedad.close();
		}
	

	}

