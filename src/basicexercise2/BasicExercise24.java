package basicexercise2;

import java.util.Scanner;

public class BasicExercise24 {

	public static void main(String[] args) {

		boolean lluvia;
		boolean tarea;
		boolean biblioteca;
		boolean permiso;
		boolean salida;
		Scanner read = new Scanner (System.in);
		System.out.println("¿Está lloviendo?");
			lluvia= read.nextBoolean();
		System.out.println("¿Has hecho la tarea?");
			tarea = read.nextBoolean();
		System.out.println("¿Necesitas ir a la biblioteca?");
			biblioteca = read.nextBoolean();
		permiso = lluvia && tarea ;
		salida = permiso || biblioteca;
		System.out.println(salida);
			
			
	}

}
