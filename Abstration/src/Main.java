public class Main {
    public static void main(String[] args) {
        System.out.println("====Car===");
        car car=new car("Toyota","Camry",2020,"blue",7000);
        car.displaydetails(); car.StartEngine();
        System.out.println();

        System.out.println("====Motor Cycle===");
        Bike bike=new Bike("Kawasaki","BMW",2023,"Touring","Two wheeler",10000);
        bike.displaydetails(); bike.StartEngine();
        System.out.println();


        System.out.println("====Track===");
        Track track=new Track("Ford","F-150",2020,2.5,9900);
        track.displaydetails(); track.StartEngine();



    }
}