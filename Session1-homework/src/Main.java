public class Main {
    public static void main(String[] args){
        Car car = new Car();
        car.changeGear(1);
        car.changeSpeed(25);
        Car porsche = new Porsche();
        ((Porsche) porsche).setSportMode(true);
        YearsAndDays yd = new YearsAndDays();
        yd.calculator(561600);
    }
}
