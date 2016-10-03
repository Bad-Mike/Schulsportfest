package Schulsportfest;

import java.util.Scanner;

/**
 * Created by mike on 03.10.16.
 */
public class SportWertung {

    public static void main(String[] args) {

        int a, b, c, d;
        String name;

        System.out.print("Name des Teilnehmers: ");
        name = new Scanner(System.in).nextLine();

        System.out.print("Punkte im Lauf: ");
        a = new Scanner(System.in).nextInt();

        System.out.print("Punkte im Wurf: ");
        b = new Scanner(System.in).nextInt();

        System.out.print("Punkte im Sprung: ");
        c = new Scanner(System.in).nextInt();

        d = a + b + c;

        if (d >= 130) {

            System.out.println();
            System.out.println(name + " erhealt eine Siegerurkunde mit " + d + " Punkten!");
        }   else if (d >= 100) {

            System.out.println();
            System.out.println(name + " erhealt eine Urkunde mit " + d + " Punkten!");
        }   else {

            System.out.println();
            System.out.println(name + " ist zu schlecht mit " + d + " Punkten!");
        }
    }
}
