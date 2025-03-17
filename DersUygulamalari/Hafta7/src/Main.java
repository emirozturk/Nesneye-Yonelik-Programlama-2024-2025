class Sekil{
    protected String renk;
    public Sekil(){

    }
    int cevreHesapla(){
        return -1;
    }
}

class Dortgen extends Sekil{
    protected int kenar1;
    protected int kenar2;
    protected int kenar3;
    protected int kenar4;

    public Dortgen(int kenar1,int kenar2,int kenar3,int kenar4){
        this.kenar1 = kenar1;
        this.kenar2 = kenar2;
        this.kenar3 = kenar3;
        this.kenar4 = kenar4;
    }
    int cevreHesapla(){
        return kenar1+kenar2+kenar3+kenar4;
    }
}
class Dikdortgen extends Dortgen{
    public Dikdortgen(int kisaKenar,int uzunKenar){
        super(kisaKenar,kisaKenar,uzunKenar,uzunKenar);
    }
}
class Kare extends Dikdortgen{
    public Kare(int kenar){
        super(kenar,kenar);
    }
    public int getKenar(){
        return kenar1;
    }
    public String getType(){
        return "Kare";
    }
}
class Daire extends Sekil{
    private double yaricap;
    public Daire(int yaricap){
        this.yaricap = yaricap;
    }
    @Override
    int cevreHesapla(){
        return (int)(2*Math.PI*yaricap);
    }
}
public class Main {
    public static void cevreGoster(Sekil sekil){
        System.out.println(sekil.cevreHesapla());
        if(sekil.getClass() == Kare.class){
            var kareOlarakSekil = ((Kare)sekil);
            System.out.println(kareOlarakSekil.getType());
        }
    }
    public static void main(String[] args) {
        var dikdortgen = new Dikdortgen(3,5);
        cevreGoster(dikdortgen);
        var kare = new Kare(12);
        cevreGoster(kare);
        var daire = new Daire(5);
        cevreGoster(daire);
    }
}