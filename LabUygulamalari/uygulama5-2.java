import java.util.ArrayList;
import java.util.List;
import java.lang.Math;
class DiziIslemleri{
    private static boolean isArmstrong(int a){
        String s = String.valueOf(a);
        int k=s.length();
        int toplam=0;
        for(char c:s.toCharArray()){
            int n;
            n = (int) Math.pow(Integer.parseInt(String.valueOf(c)),k);
            toplam+=n;

        }
        return toplam == a;
    }
    static int enbuyuk(int[] dizi){
        int enbuyuk = dizi[0];
        for (int j : dizi) {
            if (j > enbuyuk) {
                enbuyuk = j;
            }
        }
        return enbuyuk;
    }
    static List<Integer> teksayilar(int[] dizi){
        List<Integer> tek = new ArrayList<>();
        for (int j : dizi) {
            if (j%2!=0) {
                tek.add(j);
            }
        }
        return tek;
    }
    static List<Integer> armstrong(int[] dizi){
        List<Integer> armstrongd = new ArrayList<>();
        for (int j : dizi) {
            if (isArmstrong(j)) {
                armstrongd.add(j);
            }
        }

        return armstrongd;
    }

}


public class Main {
    public static void main(String[] args) {

        int[] dizi={1,8,30,124,67,9778,407,1634};
        System.out.println(DiziIslemleri.enbuyuk(dizi));
        System.out.println(DiziIslemleri.teksayilar(dizi));
        System.out.println(DiziIslemleri.armstrong(dizi));
    }
}
