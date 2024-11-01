public class Dog 
{
    private String név;
    private String fajta;
    private String nem;
    private double tomeg;

    public Dog(String név, String fajta, String nem, double tomeg)
    {
        this.név = név;
        this.fajta = fajta;
        this.nem = nem.toLowerCase();
        this.tomeg = tomeg;
    }

    @Override
    public String toString()
    {
        return String.format("Dog(%s (%s), %s, %.1fkg)",név, fajta, nem, tomeg);
    }

    public String getBreed()
    {
        return this.fajta;
    }

    public String getGender()
    {
        return this.nem;
    }

    public String getWeight() 
    {
        return String.format("%.0f",tomeg);
    }

    public int compareWeight(Dog d) 
    {
        if (d.tomeg > this.tomeg) 
        {
            return - 1;
        }
        return 1;
    }

    public String getName() 
    {
        return this.név;
    }
}
