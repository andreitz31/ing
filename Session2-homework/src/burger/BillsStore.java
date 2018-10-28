package burger;

public class BillsStore {
    public static final int ADDITINAL_PRICE = 1;
    public static final int BASE_BURGER_PRICE = 4;

    private static int profit;

    private static BillsStore store = new BillsStore();

    public static BillsStore getInstance(){
        return store;
    }

    public static void addProfit(int sum){
        profit = profit + sum;
    }
    public static int getProfit(){
        System.out.println("The profit is "+ profit + " $");
        return profit;
    }

}
