import java.util.Scanner;
import java.util.Locale;

public class Main {



    public static void main(String[] args) {
        
        Scanner skaner = new Scanner(System.in);
        System.out.println("Podaj swoje wyrażenie do obliczenia, pojedyncze spacje oddzielają liczby i operandy.");
        System.out.println("Podaj wyrażenie (np. 7 + 4):");
        String tekst = skaner.nextLine(); 
        String[] czesci = tekst.split(" "); 

        if (czesci.length == 3) {
            double x = Double.parseDouble(czesci[0]);
            String znak = czesci[1];
            double y = Double.parseDouble(czesci[2]);

            double wynik = oblicz(x, znak, y);
            System.out.println("Wynik: " + wynik);
        } else {
            System.out.println("Błąd: Wpisz działanie oddzielając elementy spacjami (np. 2 + 2)");
        }
        
        skaner.close();
    }    

    public static double oblicz(double x, String znak, double y) {

        switch (znak) {
            case "+":
                return x + y;
            case "-":
                return x - y;
            case "*":
                return x * y;
            case "x": 
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