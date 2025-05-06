// Uçabilme yeteneğini tanımlayan bir arayüz
interface Ucabilir {
    // Arayüzler sabitler içerebilir (örtülü olarak public static final)
    int MAKSIMUM_IRTIFA = 10000; // Metre

    // Soyut metot (örtülü olarak public abstract)
    // Bu arayüzü uygulayan her sınıf bu metodu sağlamalıdır
    void uc();

    // Varsayılan metot (Java 8+) - Gövdeli metot, isteğe bağlı olarak override edilebilir
    default void inisYap() {
        System.out.println("Yumuşak bir iniş yapılıyor.");
    }

    // Statik metot (Java 8+) - Arayüze ait olup, nesne oluşturmadan çağrılabilir
    static void kanatlariKontrolEt() {
        System.out.println("Kanatların durumu kontrol ediliyor.");
    }
}

// Sürülebilme yeteneğini tanımlayan başka bir arayüz
interface Surulebilir {
    void sur();
}

// Hem uçabilen hem sürülebilen bir araç sınıfı
class UcanAraba implements Ucabilir, Surulebilir { // Birden fazla arayüz uygulanabilir

    @Override
    public void uc() {
        System.out.println("Uçan araba uçuyor!");
    }

    // Varsayılan metodu override etmek isteğe bağlıdır.
    @Override
    public void inisYap() {
        System.out.println("Uçan araba yola iniş yapıyor.");
    }

    @Override
    public void sur() {
        System.out.println("Uçan araba yolda sürülüyor!");
    }
}

// Sadece uçabilen bir sınıf
class Kus implements Ucabilir {
    @Override
    public void uc() {
        System.out.println("Kuş kanat çırparak uçuyor.");
    }
    // inisYap() metodu için varsayılan implementasyonu kullanır.
}

public class InterfaceDemo {
    public static void main(String[] args) {
        // Ucabilir ucucu = new Ucabilir(); // HATA! Arayüz doğrudan örneklenemez.

        Ucabilir kus = new Kus();
        kus.uc();
        kus.inisYap(); // Varsayılan metot çağrılıyor

        System.out.println("-----");

        UcanAraba arabam = new UcanAraba();
        arabam.sur();
        arabam.uc();
        arabam.inisYap(); // Override edilmiş varsayılan metot çağrılıyor

        System.out.println("-----");

        // Statik metot arayüz adı üzerinden çağrılır
        Ucabilir.kanatlariKontrolEt();

        System.out.println("Maksimum irtifa: " + Ucabilir.MAKSIMUM_IRTIFA); // Sabit değere erişim
    }
}
