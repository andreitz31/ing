package polymorphism;

public class Amphibian extends Jeep {


    private boolean waterMode;
    private boolean offRoadMode;
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public boolean isWaterMode() {
        return this.waterMode;
    }

    public boolean isOffRoadMode() {
        return this.offRoadMode;
    }

    @Override
    public boolean isEngine() {
        System.out.println("We have an Amphibian engine!");
        return engine;
    }


    @Override
    public String getName() {
        System.out.println("This is an Amphibian car");
        return name;
    }
    public Amphibian(String name, int cylinders) {
        super(name, cylinders);
    }
}
