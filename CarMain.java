public class Main
{

    public static void main(String args[])
    {
        car adam = new car("Kia", "Forte", 2023, "Grey","1829689390", 160,33.00,438.0, "Standard Gasoline",415.0, 12000.0);
        System.out.println(adam);
        car adam2 = new car();
        System.out.println(adam2);
        System.out.println(adam2.carFax());
    }

}
