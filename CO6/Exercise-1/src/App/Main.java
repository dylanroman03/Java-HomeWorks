package App;
import java.util.Scanner;

import Impuestos.Comodato;
import Impuestos.Own;
import Impuestos.Place;
import Impuestos.Rent;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
        Own[] ownVector = new Own[3];
        Comodato[] comodatoVector = new Comodato[3];
        Rent[] rentVector = new Rent[3];

        for (int index = 0; index < 3; index++) {
            System.out.print("\033[H\033[2J"); 
            System.out.println("Datos de la casa propia #" + (index + 1));
            Own newOwn = new Own();
            newOwn.loadData();
            ownVector[index] = newOwn;
        }

        for (int index = 0; index < 3; index++) {
            System.out.print("\033[H\033[2J"); 
            System.out.println("Datos del Comodato #" + (index + 1));
            Comodato newComodato = new Comodato();
            newComodato.loadData();
            comodatoVector[index] = newComodato;
        }

        for (int index = 0; index < 3; index++) {
            System.out.print("\033[H\033[2J"); 
            System.out.println("Datos de la renta #" + (index + 1));
            Rent newRent = new Rent();
            newRent.loadData();
            rentVector[index] = newRent;
        }

        System.out.print("\033[H\033[2J"); 
        printVector(ownVector);
        System.out.println("Ingrese una tecla para mostrar el resumen de Comodato");
        scanner.next();
        System.out.print("\033[H\033[2J"); 
        printVector(comodatoVector);
        System.out.println("Ingrese una tecla para mostrar el resumen de Alquilada");
        scanner.next();
        System.out.print("\033[H\033[2J"); 
        printVector(rentVector);
    }

    static public void printVector(Place[] place){
        double total = 0.00;
        for (int i = 0; i < place.length; i++) {
            place[i].showPlace();
            total += place[i].getTax();
        }

        System.out.print("El total de es: " + total + "\n");
    }
}
