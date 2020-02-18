package tugas2;

public class limas extends persegi
{
    private int alas, tinggilimas;
    limas()
    {
       alas = 0;
       tinggilimas = 0;
    }
    
    private double hitungvolume(int a, int t)
    {
        return ((a*t)/3);
    }
    
    public void settinggi(int tinggilimas)
    {
        this.tinggilimas = tinggilimas;
    }
   
    public double getvolume()
    {
       return hitungvolume(alas, tinggilimas);
    }
}
