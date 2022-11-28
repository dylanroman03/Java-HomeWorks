package Impuestos;

import java.util.Scanner;

import Utilites.Input;

public class Own extends Place{
	private String date;

	public Own() {
		super();
	}

	public Own(String code, String address, int people) {
		super(code, address, people);
	}

	@Override
	public void loadData() {
		super.loadData();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese la Sugerencia:");
		super.setSuggest(scanner.next());

		super.setTax(calcTax());
	}

	@Override
	public void showPlace() {
		System.out.println("Vivienda Propia");
		System.out.println("Comprada el " + date);
		super.showPlace();
		System.out.println("Y debe pagar un impuesto mensual de de " + super.getTax());
		System.out.println("\n");
	}

	@Override
	public double calcTax() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese la fecha de compra:");
		date = scanner.next();
		double amount = Input.checkInt("el monto de la compra");
		return (amount * 0.01) / 12;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
