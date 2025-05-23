public class Main
{
    public static void main(String[] args)
    {
        double springCosts = 149.99;
        double summerCosts = 84.99;
        double autumnCosts = 212.86;
        double winterCosts = 476.87;
        double totalCosts = 0;

        totalCosts = springCosts + summerCosts + autumnCosts + winterCosts;

        System.out.println("Your home maintenance costs for Spring are: $" + springCosts);
        System.out.println("Your home maintenance costs for Summer are: $" + summerCosts);
        System.out.println("Your home maintenance costs for Autumn are: $" + autumnCosts);
        System.out.println("Your home maintenance costs for Winter are: $" + winterCosts);
        System.out.println("Your total yearly maintenance cost is: $" + totalCosts);
    }
}