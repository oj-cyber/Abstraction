public class car extends vehicle{
    private String color;

    public car(String make, String model, int year, String color) {
        super(make, model, year);
        this.color = color;
    }
    public void displaydetails(){
        System.out.println("Make:"+" "+make);
        System.out.println("Model:"+" "+model);
        System.out.println("Year:"+" "+year);
        System.out.println("Color:"+" "+color);
    }

    @Override
    public void StartEngine() {
        System.out.println("Car engine started smoothly");
    }
}
