
package latihan;
import java.util.Scanner;
public class Tugas2 {
    public static void tugas(int r) {
        System.out.println("Luas : " + (4*22/7*r*r));
    }
    public static void main(String[] args) {
    int r;
    Scanner ku = new Scanner(System.in);
        System.out.print("Masukkan jari - jari : ");
        r = ku.nextInt();
        tugas(r);
}
}