class BankaHesabi{
    private String isim;
    private double bakiye;
    private static int hesapSayisi=0;
    public static double toplamPara=0;
    public BankaHesabi(String isim, double bakiye){
        this.isim = isim;
        this.bakiye = bakiye;
        hesapSayisi++;
        toplamPara+=bakiye;
    }
    public static int getHesapSayisi(){
        return hesapSayisi;
    }
}

public class Main {
    public static void main(String[] args) {
        BankaHesabi hesap1=new BankaHesabi("Ali",1000);
        BankaHesabi hesap2=new BankaHesabi("Ayse",500);
        System.out.println(BankaHesabi.getHesapSayisi());
        System.out.println(BankaHesabi.toplamPara);
    }
}