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
    String Fueltype[] = {"Standard", "Standard", "Standard", "Standard", "Premium"};
    String Vin = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";



    // Vin
    public String vinGen() {
        String vinTemp = "";
        for (int i=0; i<17; i++) {
            char letter = Vin.charAt(rand.nextInt(35));
            vinTemp += letter;
        }
        return vinTemp;
    }
    // Default Constructor
    public car()
    {
        rand = new Random();
        int num = rand.nextInt(Make.length);
        this.make = Make[num];
        this.model = Model[num];
        this.year = rand.nextInt(2000, 2024);
        this.color = Color[rand.nextInt(Color.length)];
        this.vin = vinGen();
        this.topspeed = rand.nextInt(90, 200);
        this.efficency = rand.nextDouble(18.0, 30.0);
        this.fueltype = Fueltype[num];
        this.fueltank = rand.nextInt(12, 20);
        this.mileage = rand.nextDouble(0.0, 300000.0);
        this.range = this.fueltank * this.efficency;
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

    public String toString()
    {
        return this.year + " " + this.make + " " + this.model;
    }

    public String carFax()
    {
        return this.color + " " + this.year + " " + this.make + " " + this.model + System.lineSeparator() + this.mileage + " Miles" + System.lineSeparator() + "VIN: " + this.vin + System.lineSeparator() + "Top Speed: " + this.topspeed + System.lineSeparator() + this.efficency + " MPG: " + this.fueltype + " " + " Gallon Capacity: " + this.fueltank + " Range: " + this.range;
    }


}
