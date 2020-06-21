package presentationExercises;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Time {


    public static void timeNow() {
        LocalDateTime timeHere = LocalDateTime.now();
        System.out.println("LocalDateTime: " + timeHere);
        Instant now = Instant.now();
        System.out.println("Instant: " + now);
    }

    public static void tokyoDateTime() {
        Clock clock = Clock.system(ZoneId.of("Asia/Tokyo"));
        LocalDateTime timeHere = LocalDateTime.now(clock);
        System.out.println(timeHere);
    }

    public static void dateFormat() {
        LocalDateTime timeHere = LocalDateTime.now();
        DateTimeFormatter custom = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss");
        System.out.println("Date in format yyyy/MM/dd hh:mm:ss: " +custom.format(timeHere));
    }

    public static void main(String[] args) {
        timeNow();
        tokyoDateTime();
        dateFormat();

    }

}
