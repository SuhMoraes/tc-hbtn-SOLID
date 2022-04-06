public class Main {

    private static TypeVehicle typeVehicle;
    public static void main(String[] args){
        typeVehicle = TypeVehicle.CAR;

        if (typeVehicle == TypeVehicle.CAR){
            Vehicle vehicle = new Vehicle("Azul",2.6);
            vehicle.car();
        } else if (typeVehicle == TypeVehicle.MOTORCYCLE){
            Vehicle vehicle = new Vehicle("white", "2010", 250, 2);
            vehicle.motorcycle();
        }
    }
}
