package rpg;

import rpg.model.*;
import rpg.service.SystemWalki;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Postac gracz = null;

        System.out.println("=== TEKSTOWY SYMULATOR RPG ===");
        System.out.print("Podaj imie bohatera: ");
        String imie = scanner.nextLine();

        System.out.println("Wybierz klase:\n[1] Wojownik\n[2] Mag");
        int wybor = scanner.nextInt();

        if (wybor == 1) {
            gracz = new Wojownik(imie);
        } else {
            gracz = new Mag(imie);
        }

        Przeciwnik goblin = new Przeciwnik("Goblin Mnich", 60, 10);
        SystemWalki.rozpocznijBitwe(gracz, goblin);
    }
}
