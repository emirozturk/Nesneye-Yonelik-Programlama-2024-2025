import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    int EGER_SABITSE = 23;
    public static void main(String[] args) {
        //int a-b; OLMAZ
        //int 16f = 23; OLMAZ
        //int int = 3; OLMAZ
        //String birDegiskenBoyleOlmali ="";
        //int pythonda_ise_boyle = 3;
        //double baskaBirDeger=23.13;
        //pythonda_ise_boyle = baskaBirDeger; OLMAZ
        //baskaBirDeger = pythonda_ise_boyle;
        //pythonda_ise_boyle = (int)baskaBirDeger;
        //pythonda_ise_boyle = Integer.parseInt(birDegiskenBoyleOlmali);
        var scanner = new Scanner(System.in);
        var degisken = scanner.nextInt();
        System.out.println(degisken);
        /*
        if(){

        }else if(){}
        else{}
        */
        for(int i=0;i<10;i++){
            System.out.println(degisken);
        }
        var d = 0;
        while(d<10){
            System.out.println(d);
            d++;
        }
        var liste = new ArrayList<Integer>();
        liste.add(1);
        liste.add(2);
        liste.add(3);
        for(int i=0;i<liste.size();i++){
            System.out.println(liste.get(i));
        }
        for(var eleman : liste){
            System.out.println(eleman);
        }
    }
}