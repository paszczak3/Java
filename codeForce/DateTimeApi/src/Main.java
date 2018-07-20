import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Instant instant = Instant.now();

        Customer customer = new Customer();
        Date d = customer.getCreationDate();
        d.setTime(0L);

        Instant end = Instant.now();
        Duration elasped = Duration.between(instant,end);
        long millis = elasped.toMillis();
        System.out.println(millis);

        LocalDate localDate = LocalDate.of(2000,Month.FEBRUARY,14);
        Period p = localDate.until(LocalDate.now());
        long days = localDate.until(LocalDate.now(),ChronoUnit.DAYS  );
        System.out.println("years = " + p.getYears());
        System.out.println("days = " + days);

        LocalDate now = LocalDate.now();
        LocalDate nextSunday = now.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));

    }
}
