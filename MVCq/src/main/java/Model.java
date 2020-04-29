
public class Model {
    private String nim,nama,alamat;
    
    public void setModel(String nim1, String nama1, String alamat1){
        this.nim = nim1;
        this.nama = nama1;
        this.alamat = alamat1;
    }
    
    public String getNim(){
        return nim;
    }
    public void setNim(String nim){
        this.nim = nim;
    }
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getAlamat(){
        return alamat;
    }
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
}
