public class Motorcycle extends Vehicle implements  IVehicleMotorcycle{


    public Motorcycle(String color, String year, double engine, int seats) {
        super(color, year, engine, seats);
    }

    @Override
    public void configureVehicle(String color, String year, double engine) {

    }

    @Override
    public void startVehicle() {

    }
}
