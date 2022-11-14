import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Apple> apples = new ArrayList<Apple>();
    static ArrayList<Apple> deniedApples = new ArrayList<Apple>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String option = "";

        while (!option.equals("4")) {
            System.out.println("1) Registrar \t2) Porcentaje de Rechazadas\t3) Buscar \t4) Terminar");

            option = scanner.nextLine();

            if (option.equals("1")) {
                Apple apple = Apple.enterApple();
                if (apple.type.equals("RECHAZADA")) {
                    deniedApples.add(apple);
                } else {
                    apples.add(apple);
                }
                apple.print();
            } else if (option.equals("2")) {
                deniedPercentage();
            } else if (option.equals("3")) {
                findApple();
            } else if (option.equals("4")) {
                System.out.println("Adios...\n");
            } else {
                System.out.println("Ingrese una opción correcta...\n");
            }
        }

        scanner.close();
    }

    static void deniedPercentage() {
        double percentage = (100 * deniedApples.size()) / (apples.size() + deniedApples.size());
        System.out.print("El porcentaje de las manzanas rechazadas fue del: " + percentage + "%\n");
    }

    static void findApple() {
        Scanner scanner = new Scanner(System.in);
        boolean finded = false;

        System.out.println("Ingrese el codigo:");
        String code = scanner.next();

        for (Apple apple : apples) {
            if (apple.code.equals(code)) {
                finded = true;
                apple.print();
                break;
            }
        }
        if (!finded) {
            System.out.println("No encontramos su manzana quizas fue rechaza, o no fue ingresada");
        }
    }

}