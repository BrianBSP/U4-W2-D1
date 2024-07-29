package es1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static <input> void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        Random random = new Random();
        numbers[0] = random.nextInt(1, 10);
        numbers[1] = random.nextInt(1, 10);
        numbers[2] = random.nextInt(1, 10);
        numbers[3] = random.nextInt(1, 10);
        numbers[4] = random.nextInt(1, 10);

        System.out.println(Arrays.toString(numbers));

        while (true) {
            System.out.println("Inserisci un numero da mettere all'interno dell'array. Il numero deve essere compreso da 1 e 10.");
            int input = Integer.parseInt(scanner.nextLine());

            if (input == 0) {
                System.out.println("Hai spento l'applicazione!!");
                break;
            } else if (input > 0 && input <= 10) {
                numbers[4] = input;
                System.out.println(Arrays.toString(numbers));
            } else {
                System.out.println("Attenzione!! Inserisci un numero compreso tra 1 e 10");
            }
        }

    }

}