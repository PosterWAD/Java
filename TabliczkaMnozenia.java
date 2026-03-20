public class Main
{
	public static void main(String[] args) {
		naglowek();
        wiersze();
        stopka();
	}

    static void naglowek() {
        System.out.print("Tabliczka Mnożenia");
        System.out.println();
        for (int i = 0; i <= 10; i++) {
            System.out.printf("____");
        }
    System.out.printf("_");
    System.out.println();

        for (int i = 0; i <= 10; i++) {
            if (i == 0) System.out.printf("|//|");
            else
            System.out.printf("%3d|", i);
            
        }
        System.out.println();
    }
    
    static void wiersze() {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("|%2d", i);
            for (int j = 1; j <= 10; j++) {
                System.out.printf("|%3d", i * j);
            }
            System.out.printf("|");
            System.out.println();
        }
    }
    
    static void stopka() {
        for (int i = 0; i <= 10; i++) {
            System.out.printf("▔▔▔▔");
            
        }
    }
    
}