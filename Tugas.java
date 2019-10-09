
package latihan;
import java.util.Scanner;
public class Tugas {
    public static void latihan(int p, int l, int t) {
        System.out.println("Luas : " + ((p*l*2) + (p*t*2) + (l*t*2)) + "cm");
    }
    public static void main(String[] args) {
        int panjang;
        int lebar;
        int tinggi;
        Scanner tata = new Scanner(System.in);
        System.out.print("Masukkan panjang : ");
        panjang = tata.nextInt();
        System.out.print("Masukkan lebar : ");
        lebar = tata.nextInt();
        System.out.print("Masukkan tinggi : ");
        tinggi = tata.nextInt();
        latihan(panjang,lebar,tinggi);
    }
    
}
