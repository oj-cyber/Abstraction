public class Main {
    public static void main(String[] args) {
        System.out.println("====Car===");
        car car=new car("Toyota","Camry",2020,"blue");
        car.displaydetails(); car.StartEngine();
        System.out.println();

        System.out.println("====Motor Cycle===");
        Bike bike=new Bike("Kawasaki","BMW",2023,"Touring","Two wheeler");
        bike.displaydetails(); bike.StartEngine();
        System.out.println();


        System.out.println("====Track===");
        Track track=new Track("Ford","F-150",2020,2.5);
        track.displaydetails(); track.StartEngine();



    }
}