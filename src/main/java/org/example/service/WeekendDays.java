package org.example.service;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class WeekendDays {
    Map<LocalDate, String> weekendDaysMap = new HashMap<>();

    private void addWeekendDays() {
        weekendDaysMap.put(LocalDate.of(2024, 1, 1), "WEEKEND");
        weekendDaysMap.put(LocalDate.of(2024, 1, 2), "WEEKEND");
        weekendDaysMap.put(LocalDate.of(2024, 1, 3), "WEEKEND");
        weekendDaysMap.put(LocalDate.of(2024, 1, 4), "WEEKEND");
        weekendDaysMap.put(LocalDate.of(2024, 1, 5), "WEEKEND");
        weekendDaysMap.put(LocalDate.of(2024, 1, 6), "WEEKEND");
        weekendDaysMap.put(LocalDate.of(2024, 1, 8), "WEEKEND");
        weekendDaysMap.put(LocalDate.of(2024, 2, 23), "WEEKEND");
        weekendDaysMap.put(LocalDate.of(2024, 3, 8), "WEEKEND");
        weekendDaysMap.put(LocalDate.of(2024, 4, 29), "WEEKEND");
        weekendDaysMap.put(LocalDate.of(2024, 4, 30), "WEEKEND");
        weekendDaysMap.put(LocalDate.of(2024, 5, 1), "WEEKEND");
        weekendDaysMap.put(LocalDate.of(2024, 5, 9), "WEEKEND");
        weekendDaysMap.put(LocalDate.of(2024, 5, 10), "WEEKEND");
        weekendDaysMap.put(LocalDate.of(2024, 6, 12), "WEEKEND");
        weekendDaysMap.put(LocalDate.of(2024, 11, 4), "WEEKEND");
        weekendDaysMap.put(LocalDate.of(2024, 12, 30), "WEEKEND");
        weekendDaysMap.put(LocalDate.of(2024, 12, 31), "WEEKEND");

        weekendDaysMap.put(LocalDate.of(2024, 12, 28), "WORKED");
        weekendDaysMap.put(LocalDate.of(2024, 4, 27), "WORKED");
        weekendDaysMap.put(LocalDate.of(2024, 11, 2), "WORKED");
    }

    public Map<LocalDate, String> getWeekendDays() {
        addWeekendDays();
        return weekendDaysMap;
    }
}
