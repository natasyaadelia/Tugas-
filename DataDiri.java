
package latihan;

public class DataDiri {
    public static void main(String[] args) {
        DataDiri tata = new DataDiri();
        
        tata.setNama("");
        tata.setNIS("");
        tata.setTempatLahir("");
        tata.setTanggalLahir("");
        tata.setJenisKelamin("");
        tata.setAlamatDiMalang("");
        tata.setMottoHidup("");
    }
    private void setNama(String nama){
        nama = "Natasya Adelia Ramahanti";
        System.out.println("Nama : " + nama);
    }
    private void setNIS(String nis){
        nis = "6276/2539.065";
         System.out.println("NIS : " + nis);
    }
    private void setTempatLahir(String tempatlahir){
        tempatlahir = "Blitar";
        System.out.println("Tempat Lahir : " + tempatlahir);
    }
    private void setTanggalLahir(String tanggallahir){
        tanggallahir = "14 November";        
        System.out.println("Tanggal Lahir : " + tanggallahir);
    }
    private void setJenisKelamin(String jeniskelamin){
        jeniskelamin = "Perempuan";
        System.out.println("Jenis Kelamin : " + jeniskelamin);
    }
    private void setAlamatDiMalang(String alamat){
        alamat = "Jalan Danau Bratan G5 C6";
        System.out.println("Alamat Di Malang : " + alamat);
    }
    private void setMottoHidup(String motto){
        motto = "Udah tau bodoh. Jangan males belajar";
        System.out.println("Motto Hidup : " + motto);
    }
}
