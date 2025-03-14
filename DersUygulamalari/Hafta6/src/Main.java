import com.sun.net.httpserver.Authenticator;

import java.util.Dictionary;

class Ekran{
    void goster(String cikti){
        System.out.println(cikti);
    }
    void goster (int cikti){
        System.out.println(cikti);
    }
}
class EkranGeneric<E>{
    void goster(E cikti){
        System.out.println(cikti);
    }
}
public class Main {
    public static void main(String[] args) {
        var ekran = new EkranGeneric();
        ekran.goster(1);
        ekran.goster("Deneme");
        ekran.goster(3.23948);

        //var ekran = new Ekran();
        //ekran.goster(1);
        //ekran.goster("Deneme");
        //ekran.goster(3.756); //HATA VERİR
    }
}

/*
class Islem{
    int a;
    int b;
    public Islem(){

    }
    public Islem(int a, int b){
        this.a = a;
        this.b = b;
    }
    public int topla(int a,int b){
        return a+b;
    }
    public int topla(double a,int b){
        return (int)a+b;
    }
    public int topla(int b, double a){
        return (int)a+b;
    }
    public int topla(int a,int b,int c){
        return a+b+c;
    }
    /*
    OLMAZ OLMAZ OLMAZ OLMAZ OLMAZ OLMAZ OLMAZ OLMAZ
    public int topla(int c,int d,int f){

    }
    OLMAZ OLMAZ OLMAZ OLMAZ OLMAZ OLMAZ OLMAZ OLMAZ

}

/*
class Response{
    boolean success;
    String message;
    int data;
    Response(int data){
        this.data = data;
        this.success = true;
        this.message = "";
    }
    Response(String message){
        this.success = false;
        this.message = message;
        this.data = -1;
    }
}
public class Main {
    public static void main(String[] args) {
        var islem = new Islem();
        var sonuc = islem.topla(1,2);
        var doubleSonuc = islem.topla(2.0,3);
    }
}

 */