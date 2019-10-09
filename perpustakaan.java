
package pbo;

class perpustakaan {
     private void setBukujudul(int bukujudul) {
        bukujudul = (1600);
        System.out.println("jumlah rak buku adalah : " + bukujudul);
    }
    
     private void setBuku(int buku) {
        buku = (9445);
        System.out.println("jumlah rak buku adalah : " + buku);
    }
    private void setRakbuku(int rakbuku) {
        rakbuku = (12);
        System.out.println("jumlah rak buku adalah : " + rakbuku);
    }

    private void setMeja(int meja) {
        meja = (10);
        System.out.println("jumlah meja adalah : " + meja);
    }

    private void setKursi(int kursi) {
        kursi = (25);
        System.out.println("jumlah kursi adalah : " + kursi);
        
    }
        private void setTelevisi(int tv){
            tv = (1);
            System.out.println("jumlah Televisi adalah : "+ tv);
        }

         private void setJam(int jam){
             jam = (1);
            System.out.println("jumlah Jam adalah : "+ jam);
        }
         
          private void setCctv(int cctv ){
             cctv = (1);
            System.out.println("jumlah CCTV adalah : "+ cctv );
        }
          
           private void setAc(int ac){
            ac = (2);
            System.out.println("jumlah AC adalah : "+ ac);
        }
           
            private void setPc(int pc){
            pc = (2);
            System.out.println("jumlah PC adalah : "+ pc);
        }
             private void setSpeaker(int speaker){
            speaker = (6);
            System.out.println("jumlah Speaker adalah : "+ 6);
        }
    public static void main(String[] args) {
        perpustakaan barang = new perpustakaan();
        barang.setBukujudul(0);
        barang.setBuku(0);
        barang.setRakbuku(0);
        barang.setMeja(0);
        barang.setKursi(0);
        barang.setTelevisi(0);
        barang.setJam(0);
        barang.setCctv(0);
        barang.setAc(0);
        barang.setPc(0);
        barang.setSpeaker(0);
    
}

    void setRakbuku(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setMeja(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setKursi(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
