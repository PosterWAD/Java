import java.util.Scanner;
import java.util.Locale;

public class Main {



    public static void main(String[] args) {
        
        Scanner skaner = new Scanner(System.in);

        System.out.print("Podaj pierwszą liczbę: ");
        double x = skaner.nextDouble();
        System.out.print("Podaj drugą liczbę: ");
        double y = skaner.nextDouble();
        System.out.print("Podaj znak operacji jaką chcesz wykonać: ");
        String znak = skaner.next();
        double wynik = oblicz(x, znak, y);

        // Wypisujemy wynik na ekran
        System.out.println("Wynik: " + wynik);
    }

    public static double oblicz(double x, String znak, double y) {

        switch (znak) {
            case "+":
                return x + y;
            case "-":
                return x - y;
            case "*":
                return x * y;
            case "/":
                // Zabezpieczenie przed dzieleniem przez zero
                if (y == 0) {
                    System.out.println("Nie można dzielić przez zero!");
                    return 0;
                }
                return x / y;
            default:
                System.out.println("Nieznany znak operacji (" + znak + "). Użyj +, -, x, /");
                return 0;
        }
    }
}