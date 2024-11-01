import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // ArrayList létrehozása és elemek hozzáadása
        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jane");
        names.add("Mike");
        names.add("Alice");
        names.add("Bob");

        String[] tomb = { "hello", "Table", "BUS", "CoMPUteR" };

        // 1. foreach ciklus használata ArrayList-en
        System.out.println("foreach ciklus ArrayList-en:");
        for (String name : tomb) {
            System.out.println(name);
        }

        System.out.println("--------------------------");

        // 2. Hagyományos for ciklus használata indexeléssel ArrayList-en
        System.out.println("Hagyományos for ciklus ArrayList-en:");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        System.out.println("--------------------------");

        // 3. forEach metódus lambda kifejezéssel ArrayList-en
        System.out.println("forEach metódus lambda kifejezéssel ArrayList-en:");
        names.forEach(name -> System.out.println(name));

        System.out.println("--------------------------");

        // 4. while ciklus ArrayList-en
        System.out.println("while ciklus ArrayList-en:");
        int index = 0;
        while (index < names.size()) {
            System.out.println(names.get(index));
            index++;
        }

        System.out.println("--------------------------");

        // 5. Gyakori ArrayList metódusok használata
        
        // add() metódus: elem hozzáadása a végére
        names.add("David");
        System.out.println("Hozzáadva: David");
        names.forEach(name -> System.out.println(name));

        System.out.println("--------------------------");

        // add() metódus: elem hozzáadása egy adott indexre
        names.add(2, "Emma");
        System.out.println("Hozzáadva: Emma a 2. indexre");
        names.forEach(name -> System.out.println(name));

        System.out.println("--------------------------");

        // get() metódus: elem lekérése index alapján
        String secondName = names.get(1);
        System.out.println("Az 1. indexű elem: " + secondName);

        System.out.println("--------------------------");

        // set() metódus: elem módosítása adott indexen
        names.set(1, "Jenny");
        System.out.println("Az 1. indexű elem módosítva: Jenny");
        names.forEach(name -> System.out.println(name));

        System.out.println("--------------------------");

        // remove() metódus: elem eltávolítása index alapján
        names.remove(3);
        System.out.println("3. indexű elem eltávolítva");
        names.forEach(name -> System.out.println(name));

        System.out.println("--------------------------");

        // remove() metódus: elem eltávolítása objektum alapján
        names.remove("Bob");
        System.out.println("Bob eltávolítva");
        names.forEach(name -> System.out.println(name));

        System.out.println("--------------------------");

        // contains() metódus: elem keresése a listában
        boolean hasMike = names.contains("Mike");
        System.out.println("Mike a listában van: " + hasMike);

        System.out.println("--------------------------");

        // indexOf() metódus: elem indexének lekérdezése
        int indexOfEmma = names.indexOf("Emma");
        System.out.println("Emma indexe: " + indexOfEmma);

        System.out.println("--------------------------");

        // size() metódus: lista méretének lekérdezése
        int listSize = names.size();
        System.out.println("A lista mérete: " + listSize);

        System.out.println("--------------------------");

        // isEmpty() metódus: üresség ellenőrzése
        boolean isEmpty = names.isEmpty();
        System.out.println("A lista üres: " + isEmpty);

        System.out.println("--------------------------");

        // clear() metódus: lista kiürítése
        names.clear();
        System.out.println("Lista kiürítve");
        System.out.println("A lista mérete: " + names.size());
    }
}
