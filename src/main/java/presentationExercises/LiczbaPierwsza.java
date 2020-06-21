package presentationExercises;

import java.util.Scanner;

public class LiczbaPierwsza {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę, program sprawdzi, czy jest to liczba pierwsza");
        int liczba = scanner.nextInt();


        if (liczba < 3){

        }
        boolean isPrime = true;
        for (int i = 3; i < liczba; i++) {
            if (liczba % i == 0 ) isPrime = false;
        }
        System.out.println(isPrime);
    }
}










