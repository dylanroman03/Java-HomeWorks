import java.util.Scanner;

public class Apple {
	public double size, weight;
	public String code, type;

	public Apple(double size, double weight, String code, String type) {
		this.size = size;
		this.weight = weight;
		this.code = code;
		this.type = type;
	}

	static Apple enterApple() {
		Scanner scanner = new Scanner(System.in);
		double weight = 0.00;
		double size = 0.00;
		String code;

		weight = validData("Peso");
		size = validData("Diametro");

		System.out.println("Ingrese el" + Color.BLUE + " codigo " + Color.RESET + "de la mazana:\t");

		code = scanner.next();

		return new Apple(size, weight, code, checkType(size, weight));
	}

	static double validData(String tipo) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el " + Color.BLUE + tipo + Color.RESET + " de la mazana:\t");

		while (!scanner.hasNextDouble()) {
			System.out.println(Color.RED + "Dato Incorrecto\n" + Color.RESET + "Ingrese el " + Color.BLUE + tipo + Color.RESET + " de la mazana:\t");
			scanner.next();
		}

		return Double.parseDouble(scanner.next());
	}

	static String checkType(double size, double weight) {
		if (weight > 450 && size >= 9 && size <= 12) {
			return "PREMIUM";
		} else if (weight >= 300 && weight <= 450 && size >= 8 && size <= 11) {
			return "EXTRA";
		} else if (weight < 300 && size >= 7 && size <= 9) {
			return "NATURAL";
		} else {
			return "RECHAZADA";
		}
	}

	public void print() {
    System.out.println(Color.PURPLE + code + "\t" + type + "\t" + weight + "gr \t" + size + "cm\n" + Color.RESET);
	}

}
