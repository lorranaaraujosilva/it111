import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class MyTimeDate {
    public static void main(String[] args) {

        // lets display the current day

        LocalDate CurrentDate = LocalDate.now();

        System.out.println(CurrentDate);

        // see the month, day of the week and the year, year needs to be an integer

        Month CurrentMonth = CurrentDate.getMonth();
        System.out.println(CurrentMonth);

        DayOfWeek CurrentDayOfWeek = CurrentDate.getDayOfWeek();
        System.out.println(CurrentDayOfWeek);

        int CurrentYear = LocalDate.now().getYear();
        System.out.println(CurrentYear);

        // we would like to know the number of the day

        int CurrentDayNumber = LocalDate.now().getDayOfMonth();
        System.out.println(CurrentDayNumber);

        System.out.println("Today is " +CurrentDayOfWeek+ ", " +CurrentMonth+ ", " +CurrentDayNumber+ ", " +CurrentYear );


    }
}
