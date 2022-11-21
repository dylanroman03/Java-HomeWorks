package Impuestos;

import java.util.Scanner;

import Utilites.Input;

public class Comodato extends Place {
	private double tax;
	private int duration;

	public Comodato(){
		super();
	};

	public Comodato(String code, String address, int people) {
		super(code, address, people);
	}
	
	@Override
	public void loadData() {
		super.loadData();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese la Sugerencia:");
		super.setSuggest(scanner.next());

		tax = calcTax();
	}

	@Override
	public void showPlace() {
		System.out.println("Vivienda de Comodato\n");
		super.showPlace();
		System.out.println("Y debe pagar un impuesto mensual de " + tax);
	}

	@Override
	public double calcTax() {
		duration = Input.checkInt("duracion del comodato");
		double marketAmount = Input.checkDouble("monto del mercado actual");
		return marketAmount * 0.15;
	}
}
