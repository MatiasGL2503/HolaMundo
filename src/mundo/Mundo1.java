package mundo;

import java.util.Scanner;

public class Mundo1 {
	public static void main(String[] args) {
		// estoy abriendo scanner
		Scanner scanner = new Scanner(System.in);
		// 1. Escribir pregunta de cuál es el color favorito
		System.out.println("Cual es tu color favorito?");
		// 2. Leer lo que escriba el usuario
		String color = scanner.nextLine();
		// 3. Escribir el mensaje "Me encanta el" + color
		System.out.println("Me gusta el color!! " +  color);
		
		
		scanner.close(); //Estoy cerrando scanner 
		
		
	}

}
