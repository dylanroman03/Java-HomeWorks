package Implementacion;

import java.util.Arrays;

import Aerolinea.Azafata;
import Aerolinea.Pasajero;
import Aerolinea.Piloto;
import Aerolinea.Vuelos;
import Data.Datos;

public class Principal {
	public Datos datos; 
	public static Vuelos[] viajes = new Vuelos[5];
	public static Azafata[] azafataVec = new Azafata[1];
	public static Pasajero[] pasajeroVec  = new Pasajero[1];
	public static Piloto[] pilotoVec = new Piloto[1];

	public static void main(String[] args) {
		cargarDatos();
		mostrarCategoria();
		destinoFavorito();
		mejorPiloto();
	}

	public static void cargarDatos() {
		int indexAzafata = 0; 
		int indexPasajero = 0; 
		int indexPiloto = 0;

		for (int i = 0; i < Datos.datos_persona.length; i++) {
			String dato = Datos.datos_persona[i];
			String[] partes = dato.split(";");
			switch (partes[4]) {
				case "1":
				 	Pasajero pasajero = new Pasajero(Integer.parseInt(partes[0]), partes[1], Integer.parseInt(partes[2]), Integer.parseInt(partes[3]), "", partes[5], Integer.parseInt(partes[6]));
					
					if(indexPasajero > 0) {
						pasajeroVec = Arrays.copyOf(pasajeroVec, indexPasajero + 1);
					}

					pasajeroVec[indexPasajero] = pasajero;
					indexPasajero++;
					break;
				case "2":
				 	Azafata azafata = new Azafata(Integer.parseInt(partes[0]), partes[1], Integer.parseInt(partes[2]), Integer.parseInt(partes[3]), "", Double.parseDouble(partes[5]), Integer.parseInt(partes[6]));

					if(indexAzafata > 0) {
						azafataVec = Arrays.copyOf(azafataVec, indexAzafata + 1);
					}

					azafataVec[indexAzafata] = azafata;
					indexAzafata++;
					break;
				case "3":
				 	Piloto piloto = new Piloto(Integer.parseInt(partes[0]), partes[1], Integer.parseInt(partes[2]), Integer.parseInt(partes[3]), "", Integer.parseInt(partes[5]));

					if(indexPiloto > 0) {
						pilotoVec = Arrays.copyOf(pilotoVec, indexPiloto + 1);
					}

					pilotoVec[indexPiloto] = piloto;
					indexPiloto++;
					break;
			}

		}

		for (int i = 0; i < Datos.datos_vuelos.length; i++) {
			String dato = Datos.datos_vuelos[i];
			String[] partes = dato.split(";");
			Vuelos vuelo = new Vuelos(partes[0], Integer.parseInt(partes[1]), partes[2]);
			viajes[i] = vuelo;
		}
	}

	public static void mostrarCategoria() {
		System.out.println("\nPasajeros");
		for (int i = 0; i < pasajeroVec.length; i++) {
			pasajeroVec[i].mostrar();
		}	

		System.out.println("\nAzafatas");
		for (int i = 0; i < azafataVec.length; i++) {
			azafataVec[i].mostrar();
		}	

		System.out.println("\nPilotos");
		for (int i = 0; i < pilotoVec.length; i++) {
			pilotoVec[i].mostrar();
		}	
		System.out.println("\n");
	}

	public static void destinoFavorito() {
		String[] destinos = new String[pasajeroVec.length];
		int monto = 0;
		int max = 0;
		int viajeMax = 0;

		for (int i = 0; i < pasajeroVec.length; i++) {
			for (int j = 0; j < viajes.length; j++) {
				if (viajes[j].getVuelo() == pasajeroVec[i].getVuelo()) {
					Vuelos vuelo = viajes[j];	
					destinos[i] = vuelo.getDestion();
				}
			}	
		}		


		for (int i = 0; i < destinos.length; i++) {
			int e = 0;

			for (int j = 0; j < destinos.length; j++) {
				if (destinos[i] == destinos[j]) {
					e++;					
				}	
			}	

			if (e > max) {
				max = e;	
				viajeMax = i;
			}
		}

		for (int i = 0; i < pasajeroVec.length; i++) {
			for (int j = 0; j < viajes.length; j++) {
				String destino = viajes[j].getDestion();
				int vuelo = viajes[j].getVuelo();

				if (vuelo == pasajeroVec[i].getVuelo() && destino.compareTo(destinos[viajeMax]) == 0) {
					monto = monto + pasajeroVec[i].getValorPasaje();
				}
			}	
		}		

		System.out.println("El destino favorito es: " + destinos[viajeMax]);
		System.out.println("El monto total es de: " + monto + "\n");
	}

	public static void mejorPiloto() {
		int max = 0;
		Piloto mejorPiloto = new Piloto();

		for (Piloto piloto : pilotoVec) {
			if (piloto.getHoras() > max) {
				max = piloto.getHoras();	
				mejorPiloto = piloto;
			}
		}

		System.out.println("El mejor piloto es:");
		mejorPiloto.mostrar();
	}
}