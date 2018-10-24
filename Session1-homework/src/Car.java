import java.util.Timer;

public class Car extends Vehicle {
    private int gear=0;
    private int speed=0;

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void changeGear(int gearNumber){
        if((((this.gear>gearNumber)&&(this.gear+2<gearNumber))||((this.gear<gearNumber)&&(this.gear>gearNumber-2)))&&(gearNumber>=0)){
            this.gear=gearNumber;
        }
        else{
            System.out.println("Wrong move !");
        }
    }
    public void changeSpeed(int wishedSpeed){
        if(wishedSpeed<0) {
            System.out.println("If you want to go back , change the steer to 'BACK'");
            return;
        }
        if(wishedSpeed>this.speed) {
            while (wishedSpeed > this.speed) {
                this.speed++;
                System.out.println(this.speed);
            }
        }
            else{
                while(wishedSpeed<this.speed){
                    this.speed--;
                    System.out.println(this.speed);
                }
            }
        }
    }



