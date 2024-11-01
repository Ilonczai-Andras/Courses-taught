import java.util.List;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Hiba! Paraméternek egy nevet adjon meg!");
            System.exit(1);
        }

        List<String> nevek = FileUtils.readLines("nevek.txt");
        int counter = 0;

        for (String nev : nevek) {
            if(nev.equals(args[0]))
            {
                counter++;
            }
            
        }
        System.out.println("Nevek száma: " + counter);
    }
}