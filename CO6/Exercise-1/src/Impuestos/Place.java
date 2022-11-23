package Impuestos;

import java.util.Scanner;

import Utilites.Input;

public class Place {
	private String code, address, suggest;
	private int people;
	private double tax;

	
	public Place() {}

	public Place(String code, String address, int people) {
		this.code = code;
		this.address = address;
		this.people = people;
		this.suggest = "";
		this.tax = 0.00;
	}

	public double calcTax() {
		return 0.00;
	}

	public void showPlace() {
		System.out.println("Código: " + code);
		System.out.println("Dirección: " + address);
		System.out.println("Cuantos Viven es el hogar: " + people);
		System.out.println("Sugerencia: " + suggest);
	}

	public void loadData() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el código:");
		code = scanner.next();		

		System.out.println("Ingrese la dirección:");
		address = scanner.next();		

		people = Input.checkInt("la cantidad de personas");
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getSuggest() {
		return suggest;
	}

	public void setSuggest(String suggest) {
		this.suggest = suggest;
	}

	public int getPeople() {
		return people;
	}

	public void setPeople(int people) {
		this.people = people;
	}
	
	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax= tax;
	}

}
