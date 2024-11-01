import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Item
{
    private int id;
    private String name;
    //private Integer Counter = 0;

    public Item(int id, String name)
    {
        this.setId(id);
        this.setName(name);;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Integer getId()
    {
        return this.id;
    }

    public String getName()
    {
        return this.name;
    }
    public static String getNameFromListById (final List<Item> items, Integer id)
    {
        for (Item item : items) 
        {
            if (item.id == id) 
            {
                return item.name;
            }
            
        }
        return "";
    }
}

public class Main 
{
    public static void main(String[] args) 
    {
        List<String> lines = FileUtils.readLines("input.csv");
        lines.remove(0);
        List<Item> items = new ArrayList<>(null);

        /*for (String line : lines) 
        {
            System.out.println(lines);
        }*/

        
        for (String line : lines) 
        {   
            String[] values = line.split(",");
            Integer id = Integer.parseInt(values[0]);
            String name = values[1];
            items.add(new Item(id, name));
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Adj meg egy id-t");

        Integer id =  scanner.nextInt();
        System.out.printf("Targy neve: %s", Item.getNameFromListById(items, id));

        scanner.close();
    }
}
