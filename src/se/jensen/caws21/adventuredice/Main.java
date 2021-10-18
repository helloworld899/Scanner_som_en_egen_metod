package se.jensen.caws21.adventuredice;
import java.util.Scanner;
import java.util.ArrayList;

/*
Denna kod lärde jag mig genom att tita på Björns video
från datumet 2021-10-15 1.Git, GitHub, Method override.
Se 17 minuter in i videon.
 */

public class Main {

    public static void main(String[] args) {

        System.out.println("Skriv nedan hur gammal du är");
        int age = enNyMetod();

        System.out.println("Skriv hur lång du är i cm");
        int height = enNyMetod();

        System.out.println("Du är " + age + " år gammal och");
        System.out.println("du är " + height + " cm lång.");

    }

    //  Scanner metod i datatypen int
    public static int enNyMetod() {
        Scanner myScan = new Scanner(System.in);

        int userInput = myScan.nextInt(); //Intellij föreslår enbart: return myScan.nextInt();
        return userInput;
    }
}

