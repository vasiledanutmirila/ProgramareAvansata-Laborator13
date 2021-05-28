package com;

import java.util.Locale;

public class DisplayLocales {
    /**
     * This method displays all available locales
     */
    public static void display() {
        Locale[] locales = Locale.getAvailableLocales();
        for (Locale locale : locales) {
            System.out.println(locale.toString());
        }
    }
}
