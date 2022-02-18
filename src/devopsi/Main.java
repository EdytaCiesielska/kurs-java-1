package devopsi;

public class Main {

    public static void main(String[] args) {

        /*
        Stwórz zmienne i przypisz do nich wartości :
        val_integer typu integer z wartością 250
        val_string typu String z wartością “Akademia jest super !”
        val_double typu zmiennoprzecinkowej z wartością 1.234555
        Wyświetl wszystkie zmienne na konsoli w postaci “Zmienna X ma wartosc Y”
         */

        System.out.println("-------- ZADANIE 1 ------------");

        int val_integer = 250;
        String val_string = "Akademia jest super !";
        double val_double = 1.234555;

        System.out.println("Zmienna val_integer ma wartosc " + val_integer);
        System.out.println("Zmienna val_string ma wartosc " + val_string);
        System.out.println("Zmienna val_double ma wartosc " + val_double);

        /*
        Zadeklaruj tablice 10 liczb typu int i przeiteruj po niej od indexu 0 do 19 (od 1 do 20).
        W czasie iteracji sprawdź czy dana liczba jest parzysta (liczba%2==0),
        jeśli tak to wyświetla napis “Liczba X jest parzysta”, gdzie X to dana liczba,
        w przeciwnym wypadku wyświetl sama liczbe.
        */

        System.out.println("-------- ZADANIE 2 ------------");

        int[] tablica = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        try {
            for (int i = 0; i <= 20; i++) {
                if (tablica[i] % 2 == 0) {
                    System.out.println("Liczba " + tablica[i] + " jest parzysta");
                } else {
                    System.out.println(tablica[i]);
                }

            }
        }
        catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Indeks większy niż ilość elementów w tabeli.");
        }

        /*
        Używając pętli while, zrób sumę liczb od 1 do 500 i ją wyświetl.
         */

        System.out.println("-------- ZADANIE 3 ------------");

            int number = 1;
            int sum_of_numbers = 0;
            while (number <=500){
                sum_of_numbers = sum_of_numbers + number;
                number++;
            }
            System.out.println("Suma liczb od 0 do 500 wynosi " + sum_of_numbers);

        /*
        Napisz program, który obliczy średnia liczb z tablicy int i na jej podstawie wystawi ocenę (char) (A >=4, B >=3 i <4, C < 3), następnie używając
        switch wyświetla odpowiedni komunikat w zależności od oceny (A=Super, B=Srednio, C=Slabo, Domsylnie= cos nie tak…)
        */

        System.out.println("-------- ZADANIE 4 ------------");

        int[] tablica2 = {5,4,5};
        double sum_of_elements = 0;
        double average = 0;
        char mark = 'X';

        for (int i = 0; i < tablica2.length;i++) {
          //  System.out.println(tablica2[i]);
            sum_of_elements = sum_of_elements + tablica2[i];
        }
        //System.out.println(sum_of_elements);
        average = sum_of_elements / tablica2.length;
        //System.out.println(average);

        if (average >= 4) mark = 'A';
        else if (average >= 3 && average < 4) mark = 'B';
        else if (average < 3) mark = 'C';

        switch (mark) {
            case 'A':
                System.out.println("Super");
                break;
            case 'B':
                System.out.println("Średnio");
                break;
            case 'C':
                System.out.println("Słabo");
                break;
            default:
                System.out.println("Coś nie tak ...");

        }
    }
}
