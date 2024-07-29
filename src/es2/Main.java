package es2;

import exceptions.NumberZeroException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-------- km ---------");
        System.out.println("Inserisci i km percorsi:");
        double km = Integer.parseInt(scanner.nextLine());
        System.out.println("------- gasolio --------");
        System.out.println("Inserisci i litri di gasolio consumati:");
        double gasolioConusmato = Integer.parseInt(scanner.nextLine());

        System.out.println("------- km/litri --------");
        System.out.println("I km percorsi ogni litro di carburante sono: ");
        System.out.println(kmAlLitro(km, gasolioConusmato));
        // kmAlLitro(km, gasolioConusmato);


    }

    public static double kmAlLitro(double km, double litriConsumati) {
        double kmLitro = 0;
        if (litriConsumati == 0)
            try {
                throw new NumberZeroException();
            } catch (NumberZeroException e) {
                throw new RuntimeException(e);
            }

        kmLitro = km / litriConsumati;
        return kmLitro;
    }
}
