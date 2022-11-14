import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Call> calls = new ArrayList<Call>();


    public static void main(String[] args) {
        addCalls();
    }

    static void addCalls() {
        Scanner scanner = new Scanner(System.in);
        String option = "";

        while (!option.equals("2")) {
            System.out.println("1) Registrar Llamada \t 2) Terminar");

            option = scanner.nextLine();

            if (option.equals("1")) {
                Call newCall = Call.enterCall();
                calls.add(newCall);
            } else if (option.equals("2")) {
                showCalls();
                System.out.println("Adios...\n");
            } else {
                System.out.println("Ingrese una opción correcta...\n");
            }
        }

        scanner.close();

    }

    static void showCalls() {
        String message = "Tus Llamadas\n" 
                        + Color.BLUE 
                        + "Duración\t" 
                        + Color.PURPLE 
                        + "Precio\n";

        for (Call call : calls) {
            message += Color.BLUE + call.duration + "\t\t" + Color.PURPLE + call.price + "\n" + Color.RESET;
        }
        System.out.println(message);
    }
}