import java.util.Scanner;

public class KierownikSprzedazy extends Sprzedawca{
    private String uprawnienia;
    private double dodatekFunkcyjny;

    public KierownikSprzedazy() {
        System.out.println("Wprowadz dane o kierowniku sprzedazy");
        System.out.println("Wprowadz uprawnienia kierownika sprzedazy: ");
        Scanner suprawnienia = new Scanner(System.in);
        this.uprawnienia = suprawnienia.next().toString();
        System.out.println("Wprowadz dodatek funkcyjny kierownika sprzedazy: ");
        Scanner sdodatekFunkcyjny = new Scanner(System.in);
        this.dodatekFunkcyjny = sdodatekFunkcyjny.nextDouble();
    }

    @Override
    public void oSprzedawcy() {
        super.oSprzedawcy();
        System.out.println("INFORMACJE O SPRZEDAWCY NA STANOWISKU: KIEROWNIK SPRZDAZY: ");
        System.out.println("Uprawnienia kierownika sprzedazy: "+uprawnienia);
        System.out.println("Dodatek funkcyjny kierownika sprzedazy: "+dodatekFunkcyjny + "%");

    }

    public void placaZUwzglednieniemDodatku()
    {
        double placa=getWynagrodzenie() + getWynagrodzenie()*(dodatekFunkcyjny/100);
        System.out.println("Placa kierownika sprzedazy z uwzglednieniem dodatku funkcyjnego wynosi:  "+ placa);
    }
}
