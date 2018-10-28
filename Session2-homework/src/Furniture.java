public class Furniture {

    private String name;
    private  int dimension;
    private  int price;

    public Furniture addFurniture(String  name,int dimension , int price){
        Furniture piece = new Furniture();
        piece.name = name;
        piece.dimension=dimension;
        piece.price = price;
        return piece;

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}
