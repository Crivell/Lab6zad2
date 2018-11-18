import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        LocalDate te = LocalDate.of(1939,9,1);
        LocalDate te1 = LocalDate.of(1945,5,2);

        System.out.println(ChronoUnit.DAYS.between(te,te1));

        LocalDate da = LocalDate.ofYearDay(2016,68);

        System.out.println(da);

        System.out.println(howMany(LocalDate.of(1996,12,11)));
    }

    private static int howMany(LocalDate da){
        int buf = 0;
        int year = LocalDate.now().getYear()-da.getYear();

        for(int i=0;i<year;i++){
            if(da.isLeapYear()){
                buf++;
            }
            da = da.plusYears(1);
        }

        return buf;
    }
}
