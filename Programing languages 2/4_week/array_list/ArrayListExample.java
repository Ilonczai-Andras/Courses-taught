import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        // Elemszám hozzáadása
        numbers.add(10);
        numbers.add(50);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println("Numbers: " + numbers);

        // Elem eltávolítása index alapján
        numbers.remove(1); // a 50-es elem eltávolítása
        System.out.println("After removal: " + numbers);

        // Dinamikusan hozzáadott elem
        numbers.add(60);
        System.out.println("After adding 60: " + numbers);

        // Elem eltávolítása objektum alapján
        numbers.remove(Integer.valueOf(30)); // A 30-as elem eltávolítása
        System.out.println("After removing 30: " + numbers);

        // Elem módosítása index alapján
        numbers.set(2, 70); // A harmadik elem módosítása 70-re
        System.out.println("After setting index 2 to 70: " + numbers);

        // Elem lekérdezése index alapján
        int firstElement = numbers.get(0);
        System.out.println("First element: " + firstElement);

        // Lista méretének lekérdezése
        System.out.println("Size of the list: " + numbers.size());

        // Lista rendezése növekvő sorrendbe
        Collections.sort(numbers);
        System.out.println("Sorted list (ascending): " + numbers);

        // Lista rendezése csökkenő sorrendbe
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("Sorted list (descending): " + numbers);

        // Lista ürességének ellenőrzése
        boolean isEmpty = numbers.isEmpty();
        System.out.println("Is list empty: " + isEmpty);

        // Elem hozzáadása adott indexre
        numbers.add(1, 25);
        System.out.println("After adding 25 at index 1: " + numbers);

        // Elem eltávolítása adott indexről és annak visszaadása
        int removedElement = numbers.remove(2);
        System.out.println("Removed element at index 2: " + removedElement);
        System.out.println("List after removal: " + numbers);

        // Lista összes elemének törlése
        numbers.clear();
        System.out.println("List after clearing: " + numbers);
    }
}
