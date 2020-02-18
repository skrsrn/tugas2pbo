package tugas2;

public class persegi 
{
    private int sisi;
    persegi()
    {
       sisi = 0;
    }
    
    private double hitungluas(int s)
    {
        return s*s;
    } 
    
    public void setSisi(int sisi)
    {
        this.sisi = sisi;
    }
    
    public double getluas()
    {
        return hitungluas(sisi);
    }
}
