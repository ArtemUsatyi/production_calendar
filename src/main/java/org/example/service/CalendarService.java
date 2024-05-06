package org.example.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import static java.util.Objects.isNull;

public class CalendarService {
    WeekendDays weekendDays = new WeekendDays();
    LocalTime startTimeMorning = LocalTime.of(9, 0);
    LocalTime endTimeMorning = LocalTime.of(13, 0);
    LocalTime startTimeAfternoon = LocalTime.of(13, 45);
    LocalTime endTimeAfternoon = LocalTime.of(18, 0);

    public boolean checkDateCalendar(LocalDate date) {
        String dayOfWeek = weekendDays.getWeekendDays().get(date);
        if (isNull(dayOfWeek)) {
            String dayWeek = String.valueOf(date.getDayOfWeek());
            return NameTypeDaysCalendar.getTemplateByNameDate(dayWeek);
        }
        return NameTypeDaysCalendar.getTemplateByNameDate(dayOfWeek);
    }

    public Boolean checkDateAndTimeCalendar(LocalDateTime dateTime){
        LocalDate date = dateTime.toLocalDate();
        if(checkDateCalendar(date)) {
            return true;
        }

        LocalTime time = dateTime.toLocalTime();
        return (!time.isAfter(startTimeMorning) || !time.isBefore(endTimeMorning)) &&
                (!time.isAfter(startTimeAfternoon) || !time.isBefore(endTimeAfternoon));
    }
}
