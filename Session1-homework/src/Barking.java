import java.time.LocalTime;

public class Barking {
    public static boolean isItOkToBark(boolean barking , int hourOfDay){
        if(hourOfDay<0) return false;
        if((barking==true)&&((hourOfDay>22)||(hourOfDay<8))){
            return true;
        }
        else return false;

    }
}
