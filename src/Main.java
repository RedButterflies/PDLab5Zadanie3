public class Main {
    public static void main(String[] args) {
        System.out.println("Sprzedawca: ");
        Sprzedawca sprzedawcaJozek = new Sprzedawca();
        sprzedawcaJozek.oSprzedawcy();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Kierownik sprzedazy: ");
        KierownikSprzedazy kierownikLucus = new KierownikSprzedazy();
        kierownikLucus.oSprzedawcy();
        kierownikLucus.placaZUwzglednieniemDodatku();
    }
}