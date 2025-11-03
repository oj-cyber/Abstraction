public class car extends vehicle{
    private String color;

    public car(String make, String model, int year, String color,double price) {
        super(make, model, year,price);
        this.color = color;
    }
    public void displaydetails(){
        System.out.println("Make:"+" "+make);
        System.out.println("Model:"+" "+model);
        System.out.println("Color:"+" "+color);
        System.out.println("Price:"+" "+" "+"$"+price);
    }

    @Override
    public void StartEngine() {
        System.out.println("Car engine started smoothly");
    }
}
