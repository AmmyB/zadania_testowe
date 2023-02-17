package Zadania.Zadanie_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class App1 {

    // Note: nie wolono Ci zmieniać tej części kodu
    private static final List<String> IMIONA_DOZWOLONE = List.of(
            "Maria", "Ania", "Katarzyna", "Dawid", "Julia", "Bartosz"
    );


    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Podaj imie");
        String imie = reader.readLine();

        String noweImie = imie.replace(".", " ").trim();


        if (IMIONA_DOZWOLONE.contains(noweImie)) {
            System.out.println("Podane imie wystepuje na liscie");
        } else {
            System.out.println("Podane imie nie wystepuje na liscie");
        }

    }
}
