package burger;

import java.util.ArrayList;

public class DeluxeBurger extends Hamburger {


    enum AdditionalDeluxe {
         FRIES , DRINK
    }
    private String meat;
    private String bread;
    private int price=0;
    private ArrayList<String> additional = new ArrayList<String>();

    public DeluxeBurger(){
        this.meat = "veal";
        this.bread= "white";
        this.price = BillsStore.BASE_BURGER_PRICE;
        this.price=this.price+BillsStore.ADDITINAL_PRICE;
        this.price=this.price+BillsStore.ADDITINAL_PRICE;
        this.additional.add("FRIES");
        this.additional.add("DRINK");
    }

    @Override
    public void addAdditional(String... ingredients) {
        System.out.println("You cannot add ingredients to the DELUXE menu! ");
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
