// Arac arabirimi
interface Arac {
    void setMaksHiz(int maksHiz);
    void setFrenKatsayisi(int frenKapasitesi);
    void setHizlanmaKatsayisi(int hizlanmaKapasitesi);
    void calistir();
    void hizlandir();
    void fren();
    void dur();
    int mevcutHiz();
}

// Bisiklet sınıfı
class Bisiklet implements Arac {
    private int mevcutHiz;
    private int maksHiz;
    private int frenKapasitesi;
    private int hizlanmaKapasitesi;

    public void setMaksHiz(int maksHiz) {
        this.maksHiz = maksHiz;
    }

    public void setFrenKatsayisi(int frenKapasitesi) {
        this.frenKapasitesi = frenKapasitesi;
    }

    public void setHizlanmaKatsayisi(int hizlanmaKapasitesi) {
        this.hizlanmaKapasitesi = hizlanmaKapasitesi;
    }

    public void calistir() {
        System.out.println("Bisiklet çalıştırıldı.");
    }

    public void hizlandir() {
        if (mevcutHiz + hizlanmaKapasitesi <= maksHiz) {
            mevcutHiz += hizlanmaKapasitesi;
            System.out.println("Hızlandırıldı. Mevcut hız: " + mevcutHiz);
        } else {
            System.out.println("Maksimum hıza ulaşıldı.");
            mevcutHiz = maksHiz;
        }
    }

    public void fren() {
        if (mevcutHiz - frenKapasitesi >= 0) {
            mevcutHiz -= frenKapasitesi;
            System.out.println("Fren yapıldı. Mevcut hız: " + mevcutHiz);
        } else {
            System.out.println("Bisiklet durdu.");
            mevcutHiz = 0;
        }
    }

    public void dur() {
        System.out.println("Bisiklet durdu.");
        mevcutHiz = 0;
    }

    public int mevcutHiz() {
        return mevcutHiz;
    }
}




public class Main {
    public static void main(String[] args) {
        Bisiklet bisiklet = new Bisiklet();
        bisiklet.setMaksHiz(30);
        bisiklet.setFrenKatsayisi(5);
        bisiklet.setHizlanmaKatsayisi(10);

        bisiklet.calistir();
        bisiklet.hizlandir();
        bisiklet.fren();
        bisiklet.hizlandir();
        bisiklet.dur();

        System.out.println("Mevcut hız: " + bisiklet.mevcutHiz());
    }
}

