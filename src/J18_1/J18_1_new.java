package J18_1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class J18_1_new {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] names = new String[5];
        String name;

        for (int i = 0; i < 5; i++) {
            System.out.print("Podaj swoje imię: ");
            name = sc.nextLine();

            names[i] = name;
        }

        for (int i = 0; i < names.length; i++) {
            System.out.println("Sposób 1: Cześć " + names[i]);
        }

        for (String i : names) {
            System.out.println("Sposób 2: Cześć " + i);
        }
    }
}

