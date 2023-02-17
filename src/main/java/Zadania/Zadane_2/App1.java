package Zadania.Zadane_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App1 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Podaj rozmiar choinki");
        int rozmiar = Integer.parseInt(reader.readLine());

        for (int i = 0; i <= rozmiar; i++) {

            for (int j = rozmiar; j > i; j--) {
                System.out.print(" ");
            }

            for (int k = 0; k < (i * 2) - 1; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }


    }

}
