package com;

import java.util.Locale;

public class SetLocale {
    /**
     * This method sets a new locale
     *
     * @param locale represents the new locale
     */
    public static void set(Locale locale) {
        Locale.setDefault(locale);
    }
}
