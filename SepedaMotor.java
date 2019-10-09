
package latihan;
public class SepedaMotor {
    public static void main(String[] args) {
        
        SepedaMotor motor = new SepedaMotor();
        motor.setMerk("");
        motor.setNama("");
    }
    private void setMerk(String merk) {
        merk = "honda";
        System.out.println("Merk motor adalah :" + merk);
    }
    private void setNama(String nama) {
        nama = "beat";
        System.out.println("Nama motor adalah :" + nama);
    }
    
}
