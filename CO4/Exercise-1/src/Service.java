import java.util.Scanner;

public final class Service {
	static int validInt(String tipo) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese " + Color.BLUE + tipo + Color.RESET + "\t");

		while (!scanner.hasNextInt()) {
			System.out.println(Color.RED + "Dato Incorrecto\n" + Color.RESET + "Ingrese " + Color.BLUE + tipo + "\t");
			scanner.next();
		}

		return Integer.parseInt(scanner.next());
	}
	
	static double validDouble(String tipo) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese " + Color.BLUE + tipo + Color.RESET + "\t");

		while (!scanner.hasNextDouble()) {
			System.out.println(Color.RED + "Dato Incorrecto\n" + Color.RESET + "Ingrese " + Color.BLUE + tipo + "\t");
			scanner.next();
		}

		return Double.parseDouble(scanner.next());
	}
}
