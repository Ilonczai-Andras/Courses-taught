package SzotarPeldak;

import java.util.HashMap;
import java.util.Map;

public class Szotar {
    public static void szotarPeldak() {
        Map<Integer, String> szotar = new HashMap<>();

        szotar.put(1, "Alma");
        szotar.put(2, "Banán");
        szotar.put(3, "Cseresznye");

        System.out.println("Szótár elemei: " + szotar);

        // Érték lekérdezése egy kulcs alapján
        String ketto = szotar.get(2);
        System.out.println("A 2-es kulcshoz tartozó érték: " + ketto);

        // Kulcs-érték pár törlése
        szotar.remove(3);
        System.out.println("Szótár elemei a törlés után: " + szotar);

        // Iterálás a szótár elemein
        System.out.println("Kulcs-érték párok:");
        for (Map.Entry<Integer, String> entry : szotar.entrySet()) {
            System.out.println("Kulcs: " + entry.getKey() + ", Érték: " + entry.getValue());
        }
    }

    //komoly példa
    // Raktár készlet (termék azonosító -> darabszám)
    private static final Map<String, Integer> raktarKeszlet = new HashMap<>();

    // Termék hozzáadása
    public static void hozzaadTermek(String azonosito, int darabszam) {
        raktarKeszlet.put(azonosito, raktarKeszlet.getOrDefault(azonosito, 0) + darabszam);
        System.out.println("Hozzáadva: " + darabszam + " db a(z) " + azonosito + " termékből.");
    }

    // Termék törlése
    public static void torolTermek(String azonosito) {
        if (raktarKeszlet.containsKey(azonosito)) {
            raktarKeszlet.remove(azonosito);
            System.out.println("A(z) " + azonosito + " termék törölve lett a raktárból.");
        } else {
            System.out.println("Nem található a termék azonosító: " + azonosito);
        }
    }

    // Raktárkészlet listázása
    public static void listazRaktarKeszlet() {
        System.out.println("Raktár készlet:");
        for (Map.Entry<String, Integer> entry : raktarKeszlet.entrySet()) {
            System.out.println("Termék: " + entry.getKey() + ", Darabszám: " + entry.getValue());
        }
    }
}
