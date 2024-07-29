package es2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-------- km ---------");
        System.out.println("Inserisci i km percorsi:");
        int km = Integer.parseInt(scanner.nextLine());
        System.out.println("------- gasolio --------");
        System.out.println("Inserisci i litri di gasolio consumati:");
        int gasolioConusmato = Integer.parseInt(scanner.nextLine());

        System.out.println("------- km/litri --------");
        System.out.println("I km percorsi ogni litro di carburante sono: ");
        System.out.println(kmAlLitro(km, gasolioConusmato));

    }

    public static int kmAlLitro(int km, int litriConsumati) {
        return km / litriConsumati;
    }
}
