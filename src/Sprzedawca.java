import java.util.Scanner;

public class Sprzedawca {
    private String imie;
    private String nazwisko;
    private String kodSprzedawcy;
    private String doKiedyZatrudniony;
    private String dzial;
    private double wynagrodzenie;

    public Sprzedawca() {
        System.out.println("Wprowadz dane sprzedawcy");
        System.out.println("Wprowadz imie: ");
        Scanner simie = new Scanner(System.in);
        this.imie = simie.next().toString();
        System.out.println("Wprowadz nazwisko: ");
        Scanner snazwisko = new Scanner(System.in);
        this.nazwisko = snazwisko.next().toString();
        System.out.println("Wprowadz kod sprzedawcy: ");
        Scanner skodSprzedawcy = new Scanner(System.in);
        this.kodSprzedawcy = skodSprzedawcy.next().toString();
        System.out.println("Do kiedy zatrudniony jest sprzedawca? (Wprowadz date [dd-mm-rr])");
        Scanner sdoKiedyZatrudniony = new Scanner(System.in);
        this.doKiedyZatrudniony = sdoKiedyZatrudniony.next().toString();
        System.out.println("Do jakiego dzialu nalezy sprzedawca? (Nazwa dzialu)");
        Scanner sdzial = new Scanner(System.in);
        this.dzial = sdzial.next().toString();
        System.out.println("Wprowadz wynagrodzenie sprzedawcy: ");
        Scanner swynagrodzenie = new Scanner(System.in);
        this.wynagrodzenie = swynagrodzenie.nextDouble();
    }
    public void oSprzedawcy()
    {
        System.out.println("INFORMACJE O SPRZEDAWCY");
        System.out.println("Imie: "+ imie);
        System.out.println("Nazwisko: "+nazwisko);
        System.out.println("Kod sprzedawcy: "+ kodSprzedawcy);
        System.out.println("Do kiedy zatrudniony: " + doKiedyZatrudniony);
        System.out.println("Dzial: "+ dzial);
        System.out.println("Wynagrodzenia: "+ wynagrodzenie);

    }

    public double getWynagrodzenie() {
        return wynagrodzenie;
    }
}
