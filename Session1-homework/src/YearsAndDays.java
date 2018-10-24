public class YearsAndDays {

    // metoda cu return String pentru a putea testa mai facil
    public static String calculator(int minutes){
        double yearsShow,daysShow;
        double years,days;
        if(minutes<0) {
            System.out.println("Invalid Value");
            return "Invalid Value";
        }else{
            days = minutes*1.0/60/24;
            years = days/365;
            yearsShow=Math.floor(years);
            daysShow=days-yearsShow*365;
            String str = minutes + " minutes = "+ (int)yearsShow+ " y and "+daysShow+" d";
            System.out.println(minutes + " minutes = "+ (int)yearsShow+ " y and "+daysShow+" d");
            return str;
        }
    }
}
