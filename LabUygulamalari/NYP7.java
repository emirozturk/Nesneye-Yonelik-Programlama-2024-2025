class Polinom{
    private double[] katsayilar;
    private double alt;
    private double ust;
    private double hata=0.001;
    public Polinom(double[] katsayilar){
        this.katsayilar = katsayilar;
    }
    private double f(double x) {
        double y = 0.0;
        for (int i = 0; i < katsayilar.length; i++) {
            y += katsayilar[i] * Math.pow(x, katsayilar.length - 1 - i);
        }
        return y;
    }

    public void araligiBelirle(double alt,double ust){
            this.alt = alt;
            this.ust = ust;
    }
    public double kokBul(){
      int maksimum_iterasyon = 1000;
        if (f(alt) * f(ust) >= 0) {
            System.out.println("Hata: Belirtilen aralıkta fonksiyonun işareti değişmiyor. Kök bulunamayabilir.");
            return Double.NaN;
        }

        double orta_nokta = alt;
        for (int i = 0; i < maksimum_iterasyon; i++) {
            orta_nokta = (alt + ust) / 2.0; // Orta nokta hesaplanıyor
            double fonksiyon_degeri = f(orta_nokta); // Fonksiyonun orta noktadaki değeri hesaplanıyor
            if (fonksiyon_degeri == 0) {
                System.out.println("Kesin Kök Bulundu!");
                return orta_nokta;
            }
            else if (Math.abs(fonksiyon_degeri) < hata) {
                System.out.println("Yaklaşık Kök Bulundu!");
                return orta_nokta;
            }

            if (f(alt) * fonksiyon_degeri < 0) {
                ust = orta_nokta; // Kök alt aralıkta
            } else {
                alt = orta_nokta; // Kök üst aralıkta
            }
        }
        System.out.println("Maksimum iterasyon sayısına ulaşıldı, kök bulunamadı.");
        return Double.NaN;
    }
// Hata payı ve maks. iterasyon için getter/setter ekleyin.
}


public class Main {
    public static void main(String[] args) {
        double[] katsayilar = {1,0,-4}; // f(x) = x²-4
        Polinom p = new Polinom(katsayilar);
        p.araligiBelirle(0, 8);
        double kok=p.kokBul();
        System.out.println(kok);
    }
}