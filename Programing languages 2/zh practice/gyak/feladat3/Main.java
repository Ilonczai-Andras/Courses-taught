public class Main {
    public static void main(String[] args) {
        if(args.length != 2)
        {
            System.out.println("Hiba! Adjon meg két számot paraméterben!");
            System.exit(1);
        }
        int elso = Integer.parseInt(args[0]);
        int masodik = Integer.parseInt(args[1]);
        if(elso > masodik)
        {
            System.out.println("Hiba! A második megadott szám nagyobb legyen mint az első!");
            System.exit(1);
        }
        double result = 0;

        for (int i = elso; i <= masodik; i++) 
        {
            double d = i;
            result = result + Math.pow(d, d);
        }
        System.out.printf("%.0f", result);
    }
}