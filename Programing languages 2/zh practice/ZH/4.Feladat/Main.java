import java.util.List;

class Main
{
    public static void main(String[] args) 
    {
        List<String> nevek = FileUtils.readLines("nevek.txt");
        int counter = 0;

        if (args.length != 1) 
        {
            System.out.println("Hiba! Paraméternek egy nevet adjon meg!");
        }
        else
        {
            for (String nev : nevek) 
            {
                if (nev.equals(args[0])) 
                {
                    counter++;
                }
            }
            System.out.println(counter);
        }
    }
}