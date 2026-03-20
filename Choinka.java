public class Main {
    public static void main(String[] args) {
        choinka();
    }

    static void choinka() {
        
    for (int max = 1; max <=2*max + 1; max++) {
        
        for (int i = 1; i <= max; i++) {
            
            for (int s = 1; s <= 5 - i; s++) {
                System.out.print(" "); // s jako spacja
            }
            
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println(); 
        }
        
        if (max == 5) break;
        }

            
        }
        
    }
