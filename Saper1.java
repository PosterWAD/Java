import java.util.Random; // Wymagane do losowania

public static void main(String[] args) {
        // 1. Definiujemy rozmiar planszy
        int wiersze = 5;
        int kolumny = 5;
        int miny = 0;
        // 2. Tworzymy tablicę dwuwymiarową (naszą planszę)
        int[][] plansza = new int[wiersze][kolumny];

            Random maszynaLosujaca = new Random();
            
        while(miny < 5) {

                int losowyWiersz = maszynaLosujaca.nextInt(wiersze);
                int losowaKolumna = maszynaLosujaca.nextInt(kolumny);
                
                if (plansza[losowyWiersz][losowaKolumna] != -1) {
                    plansza[losowyWiersz][losowaKolumna] = -1; // Postaw minę
        miny++; // Zwiększ licznik TYLKO jeśli postawiono nową minę
    }
        }
       

        // 5. Drukujemy planszę używając zagnieżdżonych pętli (identycznych jak w C!)
        System.out.println("Twoja plansza:");
        for (int r = 0; r < wiersze; r++) {
            for (int c = 0; c < kolumny; c++) {
                // Jeśli jest mina, wypisz "M ", jeśli puste, wypisz "0 "
                if (plansza[r][c] == -1) {
                    System.out.print("M ");
                } else {
                    System.out.print(plansza[r][c] + " ");
                }
            }
            System.out.println(); // Przejście do nowej linii po każdym wierszu
        }
    }
