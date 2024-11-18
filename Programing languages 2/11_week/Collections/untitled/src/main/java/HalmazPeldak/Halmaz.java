package HalmazPeldak;

import java.util.HashSet;
import java.util.Set;

public class Halmaz {
    // Létrehoz egy halmazt és hozzáad elemeket
    public static void halmazPeldak() {
        Set<String> halmaz = new HashSet<>();

        halmaz.add("Alma");
        halmaz.add("Banán");
        halmaz.add("Cseresznye");
        halmaz.add("Banán"); // Ez nem kerül bele újra, mert a halmaz nem tartalmaz duplikációkat

        System.out.println("Halmaz elemei: " + halmaz);

        // Elemet keres a halmazban
        boolean vanCseresznye = halmaz.contains("Cseresznye");
        System.out.println("Tartalmazza a halmaz a 'Cseresznye'-t? " + vanCseresznye);

        // Elemet töröl
        halmaz.remove("Banán");
        System.out.println("Halmaz elemei a törlés után: " + halmaz);

        // Halmaz méretének kiírása
        System.out.println("Halmaz mérete: " + halmaz.size());
    }

    //komolyabb példa
    // Felhasználók regisztrációja
    private static final Set<String> regisztraltFelhasznalok = new HashSet<>();

    // Regisztrációs metódus
    public static boolean regisztralFelhasznalo(String email) {
        if (regisztraltFelhasznalok.contains(email)) {
            System.out.println("Sikertelen regisztráció: Már létezik ilyen e-mail cím -> " + email);
            return false;
        } else {
            regisztraltFelhasznalok.add(email);
            System.out.println("Sikeres regisztráció: " + email);
            return true;
        }
    }

    // Az összes regisztrált felhasználó listázása
    public static void listazRegisztraltFelhasznalok() {
        System.out.println("Regisztrált felhasználók:");
        for (String email : regisztraltFelhasznalok) {
            System.out.println(email);
        }
    }
}
