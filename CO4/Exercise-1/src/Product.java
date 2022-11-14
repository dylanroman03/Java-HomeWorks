import java.util.Scanner;

public class Product {
	public String name;
	private String description;
	private double price;
	private double cost;
	private int quantity;

	public Product() {
		this.name = "name";
		this.description = "description";
		this.price = 0.00;
		this.cost = 0.00;
		this.quantity = 0;
	}

	public Product(String name, String description, double price, double cost, int quantity) {
		this.name = name;
		this.description = description;
		this.price = price;
		this.cost = cost;
		this.quantity = quantity;
	}

	public void show() {
		System.out.println("name\t description\t" + "price\t" + "cost\t" + "quantity\t");
		System.out.println(this.name + "\t"
											+ this.description + "\t" 
											+ this.price + "\t" 
											+ this.cost + "\t" 
											+ this.quantity + "\t");
	}
	
	public static Product loadData() {
		String name;
		String description;
		double price;
		double cost;
		int quantity;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese el nombre:");
		name = scanner.next();

		System.out.println("Ingrese la descripción:");
		description = scanner.next();

		price = Service.validDouble("el precio");
		cost = Service.validDouble("el costo inicial");
		quantity = Service.validInt("la cantidad");

		return new Product(name, description, price, cost, quantity);
	}

	// Getters && Setters
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
