package org.example;

import org.example.service.CalendarService;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        CalendarService calendarService = new CalendarService();

        LocalDate date = LocalDate.of(2024, 1, 8);
        System.out.println("Проверка день по производственному календарю - " + calendarService.checkDateCalendar(date));

        LocalDateTime dateTime = LocalDateTime.of(2024, 1, 12, 12, 10);
        System.out.println("Проверка день и времни по производственному календарю - " + calendarService.checkDateAndTimeCalendar(dateTime));
    }
}