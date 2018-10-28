package polymorphism;

public class Bmw extends Car {

    private boolean sportMode;
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public boolean isSportMode() {
        return sportMode;
    }

    @Override
    public boolean isEngine() {
        System.out.println("We have an BMW engine!");
        return engine;
    }


    @Override
    public String getName() {
        System.out.println("This is a BMW car");
        return name;
    }




    public Bmw(String name, int cylinders) {
        super(name, cylinders);
    }


}
