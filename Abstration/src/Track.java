public class Track extends vehicle{
    private double loadcapacity;

    public Track(String make, String model, int year, double loadcapacity) {
        super(make, model, year);
        this.loadcapacity = loadcapacity;
    }
    public void displaydetails(){
        System.out.println("Make:"+" "+make);
        System.out.println("Model:"+" "+model);
        System.out.println("Year:"+" "+year);
        System.out.println("Load capacity:"+" "+loadcapacity+"tons");

    }
    public void StartEngine() {
        System.out.println("Track engine started with a deep rumble");
    }
}
