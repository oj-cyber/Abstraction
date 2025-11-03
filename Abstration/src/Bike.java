public class Bike extends vehicle {
    private String ridingMode;
    private String type;

    public Bike(String make, String model, int year, String ridingMode, String type) {
        super(make, model, year);
        this.ridingMode = ridingMode;
        this.type = type;
    }
    public void displaydetails(){
        System.out.println("Make:"+" "+make);
        System.out.println("Model:"+" "+model);
        System.out.println("Year:"+" "+year);
        System.out.println("Riding Mode:"+" "+ridingMode);
        System.out.println("Type:"+" "+type);

    }
    public void StartEngine() {
        System.out.println("Motor cycle engine started roaring ");
    }
}

