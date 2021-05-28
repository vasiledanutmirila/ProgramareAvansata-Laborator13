package com;

import java.text.DateFormatSymbols;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Info {
    /**
     * This method displays information about the current locale
     */
    public static void infoCurrent() {
        Locale locale = Locale.getDefault();

        int num = 0;

        System.out.println("Country: " + locale.getCountry());
        System.out.println("Language: " + locale.getLanguage());
        System.out.println("Currency: " + NumberFormat.getCurrencyInstance(locale).format(num));

        DateFormatSymbols symbols = new DateFormatSymbols(locale);
        String[] dayNames = symbols.getWeekdays();

        System.out.println("Week days: ");
        for (String day : dayNames) {
            System.out.print(day + " ");
        }
        System.out.println();

        String[] monthNames = symbols.getMonths();
        System.out.println("Months: ");
        for (String month : monthNames) {
            System.out.print(month + " ");
        }
        System.out.println();

        LocalDateTime today = LocalDateTime.now();
        System.out.println("Today: ");
        System.out.println(today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(locale)));
    }
}
