package FileUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {
    public static List<String> readLines(String fileName)
    {
        List<String> lines = new ArrayList<String>();

        try
        {
            String line;
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            while ((line = br.readLine()) != null)
            {
                lines.add(line);
            }
            br.close();
        }
        catch (FileNotFoundException e)
        {
            //e.printStackTrace();
            System.out.println("File nincs meg");
        }
        catch (IOException e)
        {
            System.out.println("IO hiba");
        }

        return lines;
    }
    public static void WriteLines(List<String> list, String fileName)
    {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            for (String line : list)
            {
                bw.write(line+"\n");
            }
            System.out.println("Fájl sikeresen íródott: " + fileName);
        } catch (IOException e) {
            System.err.println("Hiba történt a fájl írása közben: " + e.getMessage());
        }
    }
}
