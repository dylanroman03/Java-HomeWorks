package Service;
import java.util.Scanner;


public final class Service {
	static int validInt(String tipo) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese " +  tipo +  "\t");

		while (!scanner.hasNextInt()) {
			System.out.println("Dato Incorrecto\n" +  "Ingrese " +  tipo + "\t");
			scanner.next();
		}

		return Integer.parseInt(scanner.next());
	}
	
	static double validDouble(String tipo) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese " +  tipo +  "\t");

		while (!scanner.hasNextDouble()) {
			System.out.println("Dato Incorrecto\n" +  "Ingrese " +  tipo + "\t");
			scanner.next();
		}

		return Double.parseDouble(scanner.next());
	}
}
