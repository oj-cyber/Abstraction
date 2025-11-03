public class Track extends vehicle{
    private double mileage;

    public Track(String make, String model, int year, double mileage,double price) {
        super(make, model, year,price);
        this.mileage = mileage;
    }
    public void displaydetails(){
        System.out.println("Make:"+" "+make);
        System.out.println("Model:"+" "+model);
        System.out.println("Year:"+" "+year);
        System.out.println("Mileage:"+" "+mileage+"km/h");
        System.out.println("Price:"+" "+" "+"$"+price);

    }
    public void StartEngine() {
        System.out.println("Track engine started with a deep rumble");
    }
}
