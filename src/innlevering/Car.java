package innlevering;

public class Car {

    private String regNumber;
    private int productionYear;
    private Driver driver;
    private Engine engine;

    public Car(){
        engine = new Engine();
    }

    public Car(Driver assignedDriver){
        this();
        driver = assignedDriver;
    }
    public void drive(){
        if (driver != null){
            engine.start();
            System.out.println("Engine started");
        } else {
            System.out.println("Missing driver");
        }
    }
}
