package ejerciciotema1;

import java.util.Scanner;

public class EjercicioTema19 {

	public static void main(String[] args) {
		//Declaramos variables.
		int num1; //Se guardará el primero número introducido por el usuario.
		int num2;// Se guardará el segundo número introducido por el usuario.
		boolean resultado; /* Dependiendo de la igualdad de los datos introducidos,
		nos mostrará true o false.*/
		//Creamos el Scanner
		Scanner read = new Scanner (System.in);
		//Solicitamos al usuario un número.
		System.out.println("Introduzca un número: ");
		//Obligamos al Scanner leer el teclado.
			num1= read.nextInt();
		//Solicitamos al usuario un número, pudiendo este ser igual o diferente al anterior.
		System.out.println("Introduzca un número igual o diferente: ");
		//Obligamos al Scanner leer el teclado.
			num2 = read.nextInt();
		/*Mediante un boolean, igualamos los dos número y, en caso de ser números iguales, 
		devolverá true, por el contrario, false.*/
			resultado= num1 == num2 ;
		//Como resultado, se le mostrará al usuario si son iguales estos números o no.
		System.out.println(resultado);
		//Finalmente, cerramos el Scanner. 
		read.close();
	}

}
