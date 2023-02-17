package Zadania.Zadanie_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class App2 {

    // Note: nie wolono Ci zmieniać tej części kodu
    private static final List<String> IMIONA_DOZWOLONE = List.of(
            "Maria", "Ania", "Katarzyna", "Dawid", "Julia", "Bartosz"
    );


    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        System.out.println("Podaj liczbe imion do sprawdzenia");
        int liczba = Integer.parseInt(reader.readLine());
        System.out.println("Podaj imiona");

        for (int i = 0; i < liczba; i++) {
            String imie = reader.readLine();
            String noweImie = imie.replace(".", "").trim();

            if (IMIONA_DOZWOLONE.contains(noweImie)) {
                list.add(noweImie);
            }

        }
        System.out.println("Znaleziono dopasowanie dla:" + list);

    }

}

