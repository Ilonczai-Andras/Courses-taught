
import java.util.Scanner;


public class Main 
{
    public static void main(String[] args) 
    {
        //Scanner scanner = new Scanner(System.in);
        //System.out.print("Adj meg szamokat szokozzel elvalasztva: ");
        //String nev = scanner.nextLine();
        //scanner.close();

        //String[] szam =  nev.split(" ");
        //int hossz = szam.length;

        int[] szamok = {87, 0, -1 , 12};//new int[hossz];
        int hossz = szamok.length;

        //for (int i = 0; i < hossz; i++) 
        //{
        //    szamok[i] = Integer.valueOf(szam[i]);
        //}
        
        Arrazutils.printArray(szamok, hossz);
        Arrazutils.bubbleSort(szamok, hossz);
        //szamok = Arrazutils.sortDescend(szamok);
        Arrazutils.printArray(szamok, hossz);
    }
}
