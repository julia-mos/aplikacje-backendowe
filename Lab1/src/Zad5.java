
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class Zad5 {
    public static void main(String[] args) {
        ZonedDateTime localDate = ZonedDateTime.now();
        System.out.println("Czas lokalny: "+localDate);

        ZonedDateTime globalDate = ZonedDateTime.now( ZoneOffset.UTC );
        System.out.println("Czas globalny: "+globalDate);

    }
}
