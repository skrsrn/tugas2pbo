import java.awt.Font;
import javax.swing.*;
public class Biomhs {
    public static void main(String[] args) 
    {
        GUI g = new GUI();
    }}

class GUI extends JFrame {
    final JTextField fnama = new JTextField(200);
    JLabel lnama = new JLabel ("Nama ");
    final JTextField fnim = new JTextField(150);
    JLabel lnim = new JLabel ("NIM ");
    JLabel ljeniskelamin = new JLabel ("Jenis Kelamin");
    JRadioButton rbPria = new JRadioButton ("Laki-laki");
    JRadioButton rbWanita = new JRadioButton ("Perempuan");
    JLabel lagama = new JLabel ("Agama");
    String[] agm = {"---pilih---", "Islam", "Hiindu", "Kristen", "Katolik"};
    JComboBox cmbagama = new JComboBox (agm);
    final JTextField falamat = new JTextField(200);
    JLabel lalamat = new JLabel ("Alamat");
    JButton btnoke = new JButton ("OK");
    
    public GUI() {
        setTitle ("Data Dori Mahasiswa");
        setDefaultCloseOperation(3);
        setSize (450,450);
        ButtonGroup group = new ButtonGroup ();
        group.add(rbPria);
        group.add(rbWanita);
        
        setLayout(null);
        add(lnama);         add(fnama);   
        add(lnim);          add(fnim);
        add(ljeniskelamin); add(rbPria);        add(rbWanita);
        add(lagama);        add(cmbagama);
        add(lalamat);       add(falamat);
        add(btnoke);

        lnama.setBounds         (10, 35, 120, 20);
        fnama.setBounds         (130, 35, 200, 20);
        
        lnim.setBounds          (10, 65, 120, 20);
        fnim.setBounds          (130, 65, 200, 20);
        
	ljeniskelamin.setBounds (10, 95, 120, 20);
        rbPria.setBounds        (130, 95, 100, 20);
        rbWanita.setBounds      (250, 95, 100, 20);
        
        lagama.setBounds        (10, 125, 120, 20);
        cmbagama.setBounds      (130, 125, 100, 20);
        
        lalamat.setBounds       (10, 160, 120, 20);
        falamat.setBounds       (130, 160, 250, 150);
        
        btnoke.setBounds        (350,350,80,20);
        setVisible(true);
    }}


