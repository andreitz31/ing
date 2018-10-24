public class Vehicle {
   private String steer="NONE";
   public enum Directions {
      NONE , FORWARD , BACK , LEFT , RIGHT ;
   }
    public String getSteer() {
        return steer;
    }

    public void setSteer(String steer) {
        this.steer = steer;
    }
    public void changeDirection(String steer){
       boolean check=false;
       for(Directions d : Directions.values()){
           if(d.name().equals(steer))  check=true;
       }
       if(check){
           this.steer=steer;
       }
       else{
           System.out.println("Please give us a valid direction");
       }

    }


}
