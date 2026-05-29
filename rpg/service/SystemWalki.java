package rpg.service;

import rpg.model.Postac;
import java.util.Scanner;

public class SystemWalki {
    public static void rozpocznijBitwe(Postac gracz, Postac przeciwnik) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nRozpoczyna sie walka: " + gracz.getImie() + " VS " + przeciwnik.getImie());

        while (gracz.czyZyje() && przeciwnik.czyZyje()) {
            System.out.println("\n[1] Atak | [2] Ucieczka");
            int wybor = scanner.nextInt();

            if (wybor == 1) {
                gracz.atakuj(przeciwnik);
                if (przeciwnik.czyZyje()) {
                    przeciwnik.atakuj(gracz);
                }
            } else {
                System.out.println("Uciekles z pola bitwy!");
                return;
            }
        }

        if (gracz.czyZyje()) {
            System.out.println("\nWygrales! " + przeciwnik.getImie() + " zostal pokonany.");
        } else {
            System.out.println("\nZginales... Koniec gry.");
        }
    }
}
