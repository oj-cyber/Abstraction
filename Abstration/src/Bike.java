public class Bike extends vehicle {
    private String ridingMode;
    private String type;


    public Bike(String make, String model, int year, String ridingMode, String type,double price) {
        super(make, model, year,price);
        this.ridingMode = ridingMode;
        this.type = type;
    }

    public void displaydetails(){
        System.out.println("Make:"+" "+make);
        System.out.println("Model:"+" "+model);
        System.out.println("Year:"+" "+year);
        System.out.println("Riding Mode:"+" "+ridingMode);
        System.out.println("Type:"+" "+type);
        System.out.println("Price:"+" "+" "+"$"+price);

    }
    public void StartEngine() {
        System.out.println("Motor cycle engine started roaring ");
    }
}

