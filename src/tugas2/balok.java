package tugas2;

public class balok extends persegi 
{
    private int panjang, lebar, tinggibalok;
    balok()
    {
       panjang = 0;
       lebar = 0;
       tinggibalok = 0;
    }
    
    private double hitungvolume(int p, int l, int t){
        return p*l*t;
    }
    
    	public void setPanjang(int panjang)
    {
        this.panjang = panjang;
    }
    
    public void setLebar(int lebar)
          {
              this.lebar = lebar;
    }
    
    public void setTinggibalok(int tinggibalok)
    {
        this.tinggibalok = tinggibalok;
    }
    
    public double getvolume()
    {
       return hitungvolume(panjang, lebar, tinggibalok);
    }
}
