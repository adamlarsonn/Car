import java.util.Random;
public class car
{
    private String make;
    private String model;
    private int year;
    private String color;
    private String vin;
    private int topspeed;
    private double efficency;
    private double range;
    private String fueltype;
    private double fueltank;
    private double mileage;
    private Random rand;

    String Make[] = {"Kia", "Honda", "Toyota", "Nissan", "Audi"};
    String Model[] = {"Forte", "Civic", "Prius", "Altima", "R8"};
    String Color[] = {"Red", "Blue", "Grey", "White", "Black",};
    String Fueltype[] = {"Standard Gasoline", "Premium Gasoline", "Diesel"};
    String Vin = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";



    // Vin

    // Default Constructor
    public car(String make, String model, int year, String color, String vin, int topspeed, double efficency, double range, String fueltype, double fueltank, double mileage)
    {
        rand = new Random();
        int num = rand.nextInt(Make.length);
        this.make = Make[num];
        this.model = Model[num];
        this.year = year(rand.nextInt(2000, 2024));
        this.color = Color[rand.nextInt];
        this.vin = ;
        this.topspeed = topspeed;
        this.efficency = efficency;
        this.range = range;
        this.fueltype = fueltype;
        this.fueltank = fueltank;
        this.mileage = mileage;
    }

    // Existing Constructor
    public car(String make, String model, int year, String color, String vin, int topspeed, double efficency, double range, String fueltype, double fueltank, double mileage)
    {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.vin = vin;
        this.topspeed = topspeed;
        this.efficency = efficency;
        this.range = range;
        this.fueltype = fueltype;
        this.fueltank = fueltank;
        this.mileage = mileage;
    }


}
