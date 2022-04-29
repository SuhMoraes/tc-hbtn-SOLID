public class Vehicle {

    private String color;
    private String year;
    private double engine;
    private int seats;

    public Vehicle(String color, String year, double engine, int seats){
        this.color  = color;
        this.year = year;
        this.engine = engine;
        this.seats = seats;
    }

    public Vehicle(String color, double engine) {
        this.color = color;
        this.engine = engine;
    }

    void car(){
        System.out.println("Criando um carro com Interface: "+ color +" "+ engine );
        startVehicle();
    }

    void motorcycle(){
        System.out.println("Criando uma moto: "+ year + " com " + engine + " cilindradas");
        startVehicle();
    }

    void startVehicle(){
        System.out.println("Ligando os Motores com Interface");
    }
}
