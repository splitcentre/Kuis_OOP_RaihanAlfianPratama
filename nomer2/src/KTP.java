public class KTP {
    private String nama;
    private String nik;
    private String nomertelefon;
    private String[] tanggallahir;

    public KTP(String nama, String nik, String nomor_telefon, String[] tanggal_lahir) {
        this.nama = nama;
        this.nik = nik;
        this.nomertelefon = nomertelefon;
        this.tanggallahir = tanggal_lahir;
    }
    public void settelefon(String nomor_telefon){
        if(nomor_telefon.length()>=12){
            this.nomertelefon=nomertelefon;
        }
        else {
            System.out.println("tidak valid");
        }
    public void setTGl_lhr(String[]tanggallahir){
            int hari,bulan,tahun;
            this.tanggallahir=
        }
    }
}
