package app;

import com.DisplayLocales;
import com.Info;
import com.SetLocale;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class LocaleExplorer {
    public static void main(String[] args) {
        String baseName = "Messages";
        ResourceBundle messages = ResourceBundle.getBundle(baseName);
Scanner keyboard = new Scanner(System.in);
        boolean isRunning = true;

        while(isRunning) {
            System.out.println(messages.getString("prompt"));
            String line = keyboard.nextLine();
            String[] command = line.split(" ", 2);
            switch (command[0]) {
                case "locales":
                    System.out.println(messages.getString("locales"));
                    DisplayLocales.display();
                    messages = ResourceBundle.getBundle(baseName, Locale.getDefault());
                    break;
                case "locale.set":
                    SetLocale.set(new Locale(command[1]));
                    messages = ResourceBundle.getBundle(baseName, Locale.getDefault());
                    System.out.println(messages.getString("locale.set").replace("{0}", command[1]));
                    break;
                case "info":
                    System.out.println(messages.getString("info").replace("{0}", Locale.getDefault().getLanguage()));
                    Info.infoCurrent();
                    break;
                case "exit":
                    isRunning = false;
                    break;
                default:
                    System.out.println(messages.getString("invalid"));
            }
        }
    }
}
