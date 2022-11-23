package Impuestos;

import java.util.Scanner;

import Utilites.Input;

public class Rent extends Place{
	private double rentAmount;

	public Rent() {
		super();
	}

	public Rent(String code, String address, int people) {
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
		System.out.println("Vivienda Rentada");
		super.showPlace();
		System.out.println("Y debe pagar un impuesto mensual de " + super.getTax());
		System.out.println("\n");
	}

	@Override
	public double calcTax() {
		rentAmount = Input.checkDouble("el monto del alquiler");
		return rentAmount * 0.1;
	}

	public double getRentAmount() {
		return rentAmount;
	}

	public void setRentAmount(double rentAmount) {
		this.rentAmount = rentAmount;
	}
}
