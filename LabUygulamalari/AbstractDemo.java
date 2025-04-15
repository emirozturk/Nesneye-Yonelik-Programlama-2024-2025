// Hayvan adında bir soyut sınıf
abstract class Hayvan {
    private String ad; // Soyut sınıflar örnek değişken içerebilir

    // Soyut sınıflar yapıcı (constructor) içerebilir
    public Hayvan(String ad) {
        this.ad = ad;
    }

    // Somut (concrete) bir metot - tüm hayvanlar yemek yer
    public void yemekYe() {
        System.out.println(ad + " yemek yiyor.");
    }

    // Soyut (abstract) bir metot - her hayvan farklı ses çıkarır
    // Alt sınıflar bunu uygulamak zorundadır
    public abstract void sesCikar();

    // Getter metodu
    public String getAd() {
        return ad;
    }
}

// Hayvan soyut sınıfını miras alan somut bir sınıf
class Kopek extends Hayvan {

    public Kopek(String ad) {
        super(ad); // Üst sınıfın yapıcısını çağırır
    }

    // Soyut metodu uygulama (override) zorunluluğu
    @Override
    public void sesCikar() {
        System.out.println(getAd() + " diyor ki: Hav hav!");
    }
}

// Başka bir somut sınıf: Kedi
class Kedi extends Hayvan {
    public Kedi(String ad) {
        super(ad);
    }

    @Override
    public void sesCikar() {
        System.out.println(getAd() + " diyor ki: Miyav!");
    }
}

// Ana sınıf
public class AbstractDemo {
    public static void main(String[] args) {
        // Hayvan hayvan = new Hayvan("Genel"); // HATA! Soyut sınıf doğrudan örneklenemez.

        Hayvan karabas = new Kopek("Karabaş");
        Hayvan pamuk = new Kedi("Pamuk");

        karabas.yemekYe();        // Somut metodu çağırır
        karabas.sesCikar();      // Override edilmiş soyut metodu çağırır

        pamuk.yemekYe();
        pamuk.sesCikar();
    }
}