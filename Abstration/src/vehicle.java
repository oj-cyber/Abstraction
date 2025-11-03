public abstract class vehicle {
    protected String make;
    protected String model;
    protected int year;
    protected  double price;

    public vehicle(String make, String model, int year,double price) {
        this.make = make;
        this.model = model;
        this.year = year;

    }
    public abstract void displaydetails();
    public void StartEngine(){
        System.out.println(make+" "+ model+"engine started");
    }
}
