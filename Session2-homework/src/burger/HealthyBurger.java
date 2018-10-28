package burger;

import java.util.ArrayList;

public class HealthyBurger extends Hamburger {


    enum AdditionalHealthy {
        FRESHAIR , WATER  , ONION , AIR , AVOCADO  , SUPERFRESHAIR
    }
    private String meat;
    private String bread;
    private int price=0;
    private ArrayList<String> additional = new ArrayList<String>();

    public HealthyBurger(){
        this.meat = "NO-MEAT";
        this.bread= "black";
        this.price = this.price + BillsStore.BASE_BURGER_PRICE;
    }

    @Override
    public boolean checkIngredient(String str) {
        int ct=0;
        for (AdditionalHealthy a : AdditionalHealthy.values()) {

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


    @Override
    public void addAdditional(String... ingredients) {
        if(ingredients.length>6){
            System.out.println("Please choose maximum 6 additional ingredients");
            return;
        }
        for(String ingredient : ingredients){
            if(checkIngredient(ingredient)){
                additional.add(ingredient);
                this.price=this.price+BillsStore.ADDITINAL_PRICE;
            }
            else{
                System.out.println("Please choose a valid and healthy ingredient");
            }
        }
    }
    @Override
    public void viewPrice(){
        System.out.println("Base burger cost is : "+BillsStore.BASE_BURGER_PRICE+" $");
        for(String adds : this.additional){
            System.out.println(adds+" cost is : "+BillsStore.ADDITINAL_PRICE+" $");
        }
        System.out.println("The final cost is : "+this.price+" $");
    }
    @Override
    public void buy(){
        System.out.println("You have bought 1 burger ! Enjoy !");
        BillsStore.addProfit(price);
    }
}
