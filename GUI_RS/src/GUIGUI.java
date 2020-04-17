import javax.swing.*;
public class GUIGUI {
    public static void main(String[] args) 
    {
        GUI g = new GUI();
    }}

class GUI extends JFrame {
    JLabel ljenispasien = new JLabel ("Jenis Pasien");
    JCheckBox cbumum = new JCheckBox ("Umum");
    JCheckBox cbasuransi = new JCheckBox ("Asuransi");
    final JTextField fid = new JTextField(200);
    JLabel lid = new JLabel("ID Pasien"); 
    JLabel lJenis = new JLabel ("Jenis Asuransi");
    String[] namaAsuransi = {"Asuransi","BPJS","Perusahaan", "Tidak Ada"};
    JComboBox cmbjenis = new JComboBox (namaAsuransi);
    final JTextField fnama = new JTextField(200);
    JLabel lnama = new JLabel ("Nama Pasien");
    JLabel ljeniskelamin = new JLabel ("Jenis Kelamin");
    JRadioButton rbPria = new JRadioButton ("Laki-laki");
    JRadioButton rbWanita = new JRadioButton ("Perempuan");
    JLabel lTanggalLahir = new JLabel ("Tanggal Lahir");
    String[] tgl = {"tgl","1","2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", 
          "17", "18", "19", "20", "21", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
    JComboBox cmbTgl = new JComboBox (tgl);
    String[] bln = {"Bln","Januari","Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September",
                    "Oktober", "November", "Desember"};
    JComboBox cmbBln = new JComboBox (bln);
    String[] thn = {"thn", "2016", "2015","2014","2013","2012","2011","2010","2009","2008","2007","2006","2005",
        "2004","2003","2002","2001","2000","1999","1998","1997","1996","1995","1994","1993","1992","1991","1990","1989"};
    JComboBox cmbThn = new JComboBox (thn);
    final JTextField fumur = new JTextField(200);
    JLabel lumur = new JLabel ("Umur");
    final JTextField fdiagnosa = new JTextField(200);
    JLabel ldiagnosa = new JLabel ("Diagnosa");
    JCheckBox cbUmum = new JCheckBox ("umum");
    JCheckBox cbkulit = new JCheckBox ("kulit");
    JCheckBox cbdalam = new JCheckBox ("dalam");
    JCheckBox cbtht = new JCheckBox ("THT");
    JCheckBox cbgigi = new JCheckBox ("gigi");
    JCheckBox cblain = new JCheckBox ();
    final JTextField flain = new JTextField(20);
    JButton btnbaru = new JButton ("Buat Baru");
    JButton btnhapus = new JButton ("Hapus");
    JButton btntutup = new JButton ("Tutup");
    
    public GUI() {
        setTitle ("SISTEM PENDAFTARAN PASIEN RS. SEHAT");
        setDefaultCloseOperation(3);
        setSize (700,500);
        ButtonGroup group = new ButtonGroup ();
        group.add(rbPria);
        group.add(rbWanita);
        
        setLayout(null);
        add(ljenispasien);  add(cbumum);        add(cbasuransi); 
        add(lid);           add(fid);           add(lJenis);
        add(cmbjenis);      add(lnama);         add(fnama);
        add(ljeniskelamin); add(rbPria);        add(rbWanita);
        add(lTanggalLahir); add(cmbTgl);        add(cmbBln);
        add(cmbThn);        add(lumur);         add(fumur);
        add(ldiagnosa);     add(fdiagnosa);     add(cbUmum);
        add(cbkulit);       add(cbdalam);       add(cbtht); 
        add(cbgigi);        add(cblain);        add(flain);
        add(btnbaru);       add(btnhapus);      add(btntutup);

        ljenispasien.setBounds(10, 10, 120, 20);
        cbumum.setBounds(130,10,100,20);
        cbasuransi.setBounds(250, 10, 100, 20);
        lid.setBounds(10, 35, 120, 20);
        fid.setBounds(130, 35, 200, 20);
        lJenis.setBounds(10, 60, 120, 20);
        cmbjenis.setBounds(130, 60, 100, 20);
        lnama.setBounds(10, 85, 120, 20);
        fnama.setBounds(130, 85, 200, 20);
	  ljeniskelamin.setBounds(10, 105, 120, 20);
        rbPria.setBounds(130, 105, 100, 20);
        rbWanita.setBounds(250, 105, 100, 20);
        lTanggalLahir.setBounds(10, 130, 120, 20);
        cmbTgl.setBounds(130, 130, 100, 20);
        cmbBln.setBounds(250, 130, 100, 20);
        cmbThn.setBounds(370, 130, 100, 20);
        lumur.setBounds(10, 155, 120, 20);
        fumur.setBounds(130, 155, 200, 20);
        ldiagnosa.setBounds(10, 180, 120, 20);
        fdiagnosa.setBounds(130, 180, 250, 100);
        cbUmum.setBounds(380,180,100,20);
        cbkulit.setBounds(380, 210, 100, 20);
        cbdalam.setBounds(380,240,100,20);
        cbtht.setBounds(480, 180, 100, 20);
        cbgigi.setBounds(480, 210, 100, 20);
        cblain.setBounds(480, 240, 100, 20);
        flain.setBounds(510, 240, 150, 20);
        btnbaru.setBounds(10,300,120,20);
        btnhapus.setBounds(180,300,120,20);
        btntutup.setBounds(350,300,120,20);
        setVisible(true);
    }}


