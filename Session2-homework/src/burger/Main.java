package burger;

public class Main {

    public static void main(String[] args) {
        BillsStore.getInstance();
        BillsStore.getProfit();
        HealthyBurger hb = new HealthyBurger();
        hb.addAdditional("AIR","AVOCADO","AIR","AIR","AIR","AIR");
        hb.viewPrice();
        hb.buy();
        hb.buy();
        DeluxeBurger db = new DeluxeBurger();
        db.addAdditional("ONION");
        db.viewPrice();
        db.buy();
        BillsStore.getProfit();

    }
}