package org.example.service;

public enum NameTypeDaysCalendar {
    WEEKEND,
    SATURDAY,
    SUNDAY,
    WORKED;

    public static boolean getTemplateByNameDate(String nameDate) {
        if (String.valueOf(WORKED).equals(nameDate)) return false;

        for (NameTypeDaysCalendar nameType : NameTypeDaysCalendar.values()) {
            if (String.valueOf(nameType).equals(nameDate)) return true;
        }
        return false;
    }
}
