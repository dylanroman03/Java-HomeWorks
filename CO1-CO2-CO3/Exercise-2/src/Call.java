import java.util.Scanner;

public class Call {
    public double duration;
    public double price;

    public Call(double duration, double price) {
        this.duration = duration;
        this.price = price;
    }

    public static void main(String[] args) {}

    static Call enterCall() {
        Scanner scanner = new Scanner(System.in);
        double duration = 0.00;
        double price = 0.00;

        System.out.println(Color.GREEN 
                            + "Ingrese los minutos de su llamada:\t"  
                            + Color.RESET);

        while (!scanner.hasNextDouble()) {
            System.out.println(Color.RED 
                                + "Dato Incorrecto\n" 
                                + Color.RESET 
                                + "Ingrese la duracion de su llamada:\t");
            scanner.next();
        }

        duration = Double.parseDouble(scanner.next());
        price = calculate(duration);

        return new Call(duration, price);
    }

    static int calculate(double duration) {
        if (duration < 4) {
            return 28;
        } 

        int rest = (int) (duration - 3);
        return 28 + (rest * 16);
    }
}