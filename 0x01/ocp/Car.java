public class Car extends Vehicle implements  IVehicleCar{

    private Integer seat;

    public Car(String color, String year, double engine, int seats, Integer seat) {
        super(color, year, engine, seats);
        this.seat = seat;
    }

    public Car(String color, String year, double engine, int seats) {
        super(color, year, engine, seats);
    }

    @Override
    public void configureVehicle(String color, String year, double engine, int seats) {

    }

    @Override
    public void startVehicle() {

    }
}
