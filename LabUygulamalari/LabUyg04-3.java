// Kullanıcı sınıfı
class Kullanici {
    private String isim;
    private String rol;

    // Constructor private: Nesne doğrudan oluşturulamaz!
    private Kullanici(String isim, String rol) {
        this.isim = isim;
        this.rol = rol;
    }

    public void kullaniciBilgileriniGoster() {
        System.out.println(isim + " ==> Kullanıcı Türü: " + rol );
    }

    // Üretici metodları içeren sınıf
    public static class KullaniciFabrikasi {
        public static Kullanici yoneticiOlustur(String isim) {
            return new Kullanici(isim, "Yönetici");
        }

        public static Kullanici standartKullaniciOlustur(String isim) {
            return new Kullanici(isim, "Standart");
        }
    }
}

// Kullanım Örneği
public class Main {
    public static void main(String[] args) {
        // Kullanıcıları fabrika metodları ile oluşturuyoruz
        Kullanici yonetici = Kullanici.KullaniciFabrikasi.yoneticiOlustur("Ahmet");
        Kullanici standartKullanici = Kullanici.KullaniciFabrikasi.standartKullaniciOlustur("Mehmet");

        // Kullanıcı bilgilerini gösterme
        yonetici.kullaniciBilgileriniGoster();
        standartKullanici.kullaniciBilgileriniGoster();
    }
}
