package J19;

import java.util.Random;

public class J19_new {
    public static void main(String[] args) {
        Random los = new Random();
        int[] tab = new int[10];

        int min, max, moreThenAvarage, lessThenAvarage, equalWithAvarage;
        double avarage, sum;


        //losowe wypełnianie tabeli: int x = los.nextInt(21) - 10

        for (int i = 0; i < tab.length; i++) {
            int x = los.nextInt(21) - 10;
            tab[i] = x;
        }

        for (int i : tab) {
            System.out.print(" " + i + " ");
        }

        // najmniejszy element z tablicy

        min = tab[0];
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < min) {
                min = tab[i];
            }
        }
        System.out.println();
        System.out.println("MIN = " + min);

        //największy element tablicy

        max = tab[0];
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > max) {
                max = tab[i];
            }

        }
        System.out.println("MAX = "+max);

        //średnia arytmetyczna
        sum = 0;
        avarage = 0;

        for (int i = 0; i < tab.length; i++){
        sum += tab[i];
        }
        avarage = sum/tab.length;

        System.out.println("średnia arytmetyczna = "+avarage);

        //więcej niż średnia

        moreThenAvarage = 0;
        lessThenAvarage = 0;
        equalWithAvarage = 0;
        for (int i = 0; i < tab.length; i++){

            if (tab[i]>avarage) {
                moreThenAvarage += 1;
            }else if (tab[i]<avarage){
                lessThenAvarage += 1;
            }else {
                equalWithAvarage += 1;
            }
        }
        System.out.println("Liczb powyżej średniej = "+moreThenAvarage);
        System.out.println("Liczb poniżej średniej = "+lessThenAvarage);
        System.out.println("Liczb równych średniej = "+equalWithAvarage);

        //odwrotna kolejność
        System.out.println("odwrotna kolejność: ");
        for (int i = tab.length-1; i>-1; i--){
            System.out.print(" "+tab[i]+" ");
        }

    }

}
