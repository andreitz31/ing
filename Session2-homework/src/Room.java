import java.util.ArrayList;
// Creating room class using two types of composition;
// 1) Using interface "Building"
// 2) Using the class "Furniture"

public class Room implements Building {
   private String position;
   private int dimensions;
   private int floorNumber;
   public ArrayList<Furniture> furniture = new ArrayList<Furniture>();


    @Override
    public void setPostion(String cardinalPoint) {
        this.position=cardinalPoint;
    }

    @Override
    public void setDimensions(int squareMeters) {
       this.dimensions=squareMeters;
    }

    @Override
    public void setFloorNumber(int floorNumber) {
      this.floorNumber=floorNumber;
    }

    @Override
    public String getPosition() {
        return this.position;
    }

    @Override
    public int getDimensions() {
        return this.dimensions;
    }

    @Override
    public int getFloorNumber() {
        return this.floorNumber;
    }
}
