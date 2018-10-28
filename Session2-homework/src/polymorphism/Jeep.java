package polymorphism;

public class Jeep extends Car {

    private boolean offRoadMode;
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public boolean isOffRoadMode() {
        return this.offRoadMode;
    }

    @Override
    public boolean isEngine() {
        System.out.println("We have an Jeep engine!");
        return engine;
    }


    @Override
    public String getName() {
        System.out.println("This is a Jeep car");
        return name;
    }
    public Jeep(String name, int cylinders) {
        super(name, cylinders);
    }
}
