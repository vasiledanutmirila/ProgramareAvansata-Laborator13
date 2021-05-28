## Compulsory (1p)

- [x] Create a package with the name res. Inside this package create the files: Messages.properties, Messages_ro.properties.

- [x] Create the package com and implement the following classes describing commands:
    - DisplayLocales: to display all available locales
    - SetLocale: to set the application current locale.
    - Info: to display informations about the current or a specific locale. When the user sets a specific language tag, various information obtained using standard Java classes such as Currency or DateFormatSymbols should be displayed in a text area, as in the following example:
        - Country: Romania (România)
          - Language: Romanian (română)
          - Currency: RON (Romanian Leu)
          - Week Days: luni, marţi, miercuri, joi, vineri, sâmbătă, duminică
          - Months: ianuarie, februarie, martie, aprilie, mai, iunie, iulie, august, septembrie, octombrie, noiembrie, decembrie
          - Today: May 8, 2016 (8 mai 2016)
- [x] Create the package app and the main class LocaleExplore. Inside this class, read commands from the keyboard and execute them.
- [x] All the locale-sensitive information should be translated in at least two languages (english-default and romanian), using the resource files.