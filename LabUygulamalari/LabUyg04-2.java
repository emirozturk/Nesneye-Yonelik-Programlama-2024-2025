class Donusturucu {
    private static final double PI = 3.14;

    public static double santigrattanFahrenheite(double celsius) {
        return (celsius * 9 / 5) + 32;
    }


    public static double kmdenMile(double km) {
        return km * 0.621371;
    }
    public static double yariCaptanCevre(double r) {
        return 2*PI*r;
    }


    public static String kucukHarftenBuyukHarfe(String text) {
        return text.toUpperCase(Locale.forLanguageTag("tr-TR"));
    }
}
public class Main {
    public static void main(String[] args) {

        System.out.println("30 °C = "+ Donusturucu.santigrattanFahrenheite(30)+"°F");
        System.out.println("20 km = "+ Donusturucu.kmdenMile(20)+" mil");
        System.out.println("r=2 => çevre= "+ Donusturucu.yariCaptanCevre(2));
        System.out.println(Donusturucu.kucukHarftenBuyukHarfe("Bugün gökyüzü masmavi, " +
                "çiçekler rengârenk ve kuşlar neşeyle şarkı söylüyor."));
    }
}