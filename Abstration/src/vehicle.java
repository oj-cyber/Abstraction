public abstract class vehicle {
    protected String make;
    protected String model;
    protected int year;

    public vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    public abstract void displaydetails();
    public void StartEngine(){
        System.out.println(make+" "+ model+"engine started");
    }
}
