package polymorphism;

public class Main {
    enum lala {
        ANDREI, ION
    }

    public static void main(String[] args) {
        Car car = new Car("prototip", 4);
        car.isEngine();
        Car bmw = new Bmw("BMW", 12);
        bmw.getName();
        Car jeep = new Jeep("jeep", 12);
        jeep.getName();
        Car amph = new Amphibian("Broasca", 5);
        Jeep a = new Amphibian("Aro", 6);
        a.getName();
        //Bmw bz = new Amphibian();  Wrong

    }
}
