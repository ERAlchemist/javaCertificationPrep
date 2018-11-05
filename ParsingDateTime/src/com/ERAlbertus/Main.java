package com.ERAlbertus;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {

    public static void main(String[] args) {
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM dd yyyy");
	    LocalDate date = LocalDate.parse("02 15 2010", formatter);
        LocalTime time = LocalTime.parse("11:33");

        System.out.println(date);
        System.out.println(time);

        String text = date.format(formatter);
        System.out.println(text);
        LocalDate parsedDate = LocalDate.parse(text, formatter);
        System.out.println(parsedDate);

        LocalDate myDate = LocalDate.of(2010, Month.MAY, 5);
        String dateString = formatter.format(myDate);
        System.out.println(dateString);

        LocalDate anotherDate = LocalDate.parse(dateString, formatter);
        anotherDate.plusMonths(5).plusDays(5);
        System.out.println(formatter.format(anotherDate));

        LocalDateTime d = LocalDateTime.of(2017, 5, 10, 11, 22, 33);
        Period p = Period.ofDays(1).ofYears(2);
        d = d.minus(p);
        DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        System.out.println(f.format(d));

    }
}
