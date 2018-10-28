package polymorphism;

public class Car {

    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(String name,int cylinders){
        this.cylinders=cylinders;
        this.name = name;
        engine = true;
        wheels = 4;
    }

    public boolean isEngine() {
        System.out.println("We have an engine!");
        return engine;
    }

    public int getCylinders() {
        System.out.println("Whe have"+this.cylinders+ " cylinders");
        return cylinders;
    }

    public String getName() {
       System.out.println("This is a prototype car");
        return name;
    }

    public int getWheels() {
        System.out.println("We have 4 wheels");
        return wheels;
    }
}
