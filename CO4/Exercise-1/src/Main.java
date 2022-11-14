import java.util.Scanner;

public class Main {
	static int vectorSize = 0;
	static Product[] productArray;

	public static void main(String[] args) {
				String option = "";
				Scanner scanner = new Scanner(System.in);

        vectorSize = Service.validInt("la cantidad de productos");
				productArray = new Product[vectorSize];

				for (int i = 0; i < vectorSize; i++) {
					productArray[i] = Product.loadData();	
					productArray[i].show();
				}
				System.out.print("\033[H\033[2J");  

				while (!option.equals("6")) {
            System.out.println("1) Promedio \t2) Total en almacen\t3) Mostrar Cantidad\t4) Ganancia Neta\t5) Productos con production por debajo\t6) Salir");

            option = scanner.nextLine();

            if (option.equals("1")) {
							int avarege = average();
							System.out.println("El promedio de Cantida es de: " + avarege);
            } else if (option.equals("2")) {
							totalInDeposit();
            } else if (option.equals("3")) {
							showQuantity();
            } else if (option.equals("4")) {
							totalGain();
            } else if (option.equals("5")) {
							lowerProducts();
            } else if (option.equals("6")) {
							System.out.println("Adios...");
						} else {
							System.out.println("Ingrese una opcion correcta");
						}
        }
    }

	public static int average() {
		int sum = 0;
		for (int i = 0; i < vectorSize; i++) {
			sum += productArray[i].getQuantity();
		}	

		return (sum / vectorSize);
	}

	public static void showQuantity() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese el nombre del producto:");
		String name = scanner.next();

		for (int i = 0; i < vectorSize; i++) {
			if (productArray[i].name.equals(name)) {
				double quantity = productArray[i].getQuantity();
				System.out.println("Cantidad Producida de " + name + " es " + quantity);
			}
		}
	}

	public static void totalGain() {
		double sum = 0;
		for (int i = 0; i < vectorSize; i++) {
			double quantity = productArray[i].getQuantity();
			double price = productArray[i].getPrice();
			double cost = productArray[i].getCost();

			sum += (price - cost) * quantity;
		}

		System.out.println("La ganancia total seria de " + sum + " Bs");
	}


	public static void lowerProducts() {
		int avarage = average();	
		System.out.println("Los Productos con cantidad menor al promedio son");
		for (int i = 0; i < vectorSize; i++) {
			if (productArray[i].getQuantity() < avarage) {
				System.out.println(productArray[i].name + " " + productArray[i].getQuantity());
			}
		}	
	}

	public static void totalInDeposit() {
		double sum = 0;
		for (int i = 0; i < vectorSize; i++) {
			double quantity = productArray[i].getQuantity();
			double price = productArray[i].getPrice();

			sum += price * quantity;
		}

		System.out.println("El total en almacen es de " + sum  + " Bs");
	}
}