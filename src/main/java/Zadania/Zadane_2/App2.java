package Zadania.Zadane_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class App2 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Random random = new Random();
        System.out.println("Podaj rozmiar choinki");
        int rozmiar = Integer.parseInt(reader.readLine());
        System.out.println("Podaj prawdopodobieństwo wystąpienia bombki");
        double bombka = Double.parseDouble(reader.readLine());
        double min = 0.1;
        double max = 1.0;
        while (bombka < min || bombka > max){
            System.out.println("Podaj poprawną wartość z przedziału od 0.1 do 1.0");
            bombka = Double.parseDouble(reader.readLine());
        }


        for (int i = 0; i <= rozmiar; i++) {

            for (int j = rozmiar; j > i; j--) {
                System.out.print(" ");
            }


            for (int k = 0; k < (i * 2) - 1; k++) {
                if (random.nextDouble() <= bombka){
                    System.out.print("O");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println(" ");
        }


    }

}
