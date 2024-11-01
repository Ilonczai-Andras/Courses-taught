class Main  
{
    public static void main(String[] args) 
    {
        if (args.length != 2) 
        {
            System.out.println(" Adjon meg két számot paraméterben!");
        }
        else
        {   
            int eleje = Integer.parseInt(args[0]);
            int vege = Integer.parseInt(args[1]);

            double result = 0;

            for (int i = eleje; i <= vege; i++) 
            {   
                double d = i;
                result = result + Math.pow(d, d);
            }
            System.out.printf("%.0f",result);
        }
    }
}