package burger;

import java.util.ArrayList;

public class Hamburger {
    enum Additional {
        LETTUCE , CHORIZZO  , ONION , CHEESE , AVOCADO  , CARROT , FRIES , DRINK
    }
    private String meat;
    private String bread;
    private int price=0;
    private ArrayList<String> additional = new ArrayList<String>();

    public  boolean checkIngredient(String str) {
        int ct = 0;
        for (Additional a : Additional.values()) {
            if (a.name().equals(str)) {
                ct=1;
                return true;
            }
            else
            {
                ct=0;
            }
        }
        if(ct==1) return true;
        else return false;
    }


    public Hamburger(){
        this.meat = "veal";
        this.bread= "white";
        this.price = BillsStore.BASE_BURGER_PRICE;
    }
    public void addAdditional(String... ingredients){
        if(ingredients.length>4){
            System.out.println("Please choose maximum 4 additional ingredients");
            return;
        }
        for(String ingredient : ingredients){
          if(checkIngredient(ingredient)){
              additional.add(ingredient);
             this.price=this.price+BillsStore.ADDITINAL_PRICE;
          }
          else{
              System.out.println("Please choose a valid ingredient");
          }
        }
    }
    public void viewPrice(){
        System.out.println("Base burger cost is : "+BillsStore.BASE_BURGER_PRICE+" $");
        for(String adds : this.additional){
            System.out.println(adds+" cost is : "+BillsStore.ADDITINAL_PRICE+" $");
        }
        System.out.println("The final cost is : "+this.price+" $");
    }
    public void buy(){
        System.out.println("You have bought 1 burger ! Enjoy !");
        BillsStore.addProfit(price);
    }

}
