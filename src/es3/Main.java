package es3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Main {
    private static Logger logger = LoggerFactory.getLogger(Main.class);


    public static void main(String[] args) {
        ContoCorrente contoCorrente = new ContoCorrente("Aldo Baglio", 1000);
        ContoOnline contoOnline = new ContoOnline("Giacomo Poretti", 1500, 500);

        Scanner scanner = new Scanner(System.in);

        // gestione eccezioni ContoCorrente

       /* while (true) {
            System.out.println("Salve " + contoCorrente.getTitolare() + " inserisci l'importo da prelevare: ");
            double importo = Double.parseDouble(scanner.nextLine());

            contoCorrente.preleva(importo);
            System.out.println("Prelievo Effettuato con successo. Saldo rimanente: " + contoCorrente.getSaldo());
        }*/
        // ho commentato perchè mi dava errore nel ciclo seguente...

        // gestione eccezioni ContoOnline
        logger.info("ciao");
        logger.error("errore");
        while (true) {
            System.out.println("Salve " + contoOnline.getTitolare() + " inserisci l'importo da prelevare: ");
            double importo = Double.parseDouble(scanner.nextLine());

            contoOnline.preleva(importo);
            System.out.println("Prelievo effettuato con successo. Saldo rimanente: " + contoOnline.getSaldo());

        }

    }

}
