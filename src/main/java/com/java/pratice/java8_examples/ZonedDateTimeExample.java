package com.java.pratice.java8_examples;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZonedDateTimeExample {
    public static void main(String[] args){
        LocalDateTime date = LocalDateTime.now();
        LocalDateTime date2 = LocalDateTime.of(2024,7,10,10,30);
        System.out.println("Current date:" +date);
        DateTimeFormatter format1 =
                DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedCurrentDate = date.format(format1);
        System.out.println("formatted current Date and"+
                " Time : "+formattedCurrentDate);

        // to get the current zone
        ZonedDateTime currentZone = ZonedDateTime.now();
        System.out.println("the current zone is "+
                currentZone.getZone());

        // getting time zone of specific place
        // we use withZoneSameInstant(): it is
        // used to return a copy of this date-time
        // with a different time-zone,
        // retaining the instant.
        ZoneId tokyo = ZoneId.of("Asia/Tokyo");

        ZoneId kolkata = ZoneId.of("Asia/Kolkata");
        ZonedDateTime currentZone1 = ZonedDateTime.now().withZoneSameInstant(kolkata);
        System.out.println("Kolkata time now:" +currentZone1);

        ZonedDateTime tokyoZone =
                currentZone.withZoneSameInstant(tokyo);

        System.out.println("tokyo time zone is " +
                tokyoZone);

        DateTimeFormatter format =
                DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formatedDateTime = tokyoZone.format(format);

        System.out.println("formatted tokyo time zone "+
                formatedDateTime);
    }
}
