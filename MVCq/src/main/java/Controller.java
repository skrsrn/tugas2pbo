
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class Controller {

    Model model1; 
    View view1; 
    DAO dao1;

    public Controller(final Model model1, final View view1, final DAO dao1) {
        this.model1 = model1;
        this.view1 = view1;
        this.dao1 = dao1;

        if (dao1.getJmldata() != 0) {
            String dataMahasiswa[][] = dao1.readMahasiswa();
            view1.tabel.setModel((new JTable(dataMahasiswa, view1.namaKolom)).getModel());
        } else {
            
            JOptionPane.showMessageDialog(null, "Data Tidak Ada");
        }
        
        view1.save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nim = view1.getNim();
                String nama = view1.getNama();
                String alamat = view1.getAlamat();
                if (nim.isEmpty() || alamat.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Harap Mengisi Semua Field");
                } else {
                    model1.setModel(nim, nama, alamat);
                    dao1.Insert(model1);

                    String dataMahasiswa[][] = dao1.readMahasiswa();
                    view1.tabel.setModel((new JTable(dataMahasiswa, view1.namaKolom)).getModel());
                }
            }
        });
        
        view1.delete.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                String nim = view1.getNim();
                String nama = view1.getNama();
                String alamat = view1.getAlamat();
                if(nim.isEmpty() || alamat.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Field Tidak Boleh Kosong");                   
                }else{
                    int input = JOptionPane.showConfirmDialog(null, "Apakah anda ingin menghapus Data "+nim+"?","Pilih Opsi...",JOptionPane.YES_NO_OPTION);
          
                    if(input==0){
                    model1.setModel(nim, nama, alamat);
                    dao1.Delete(model1);
                    
                    String dataMahasiswa[][]= dao1.readMahasiswa();
                    view1.tabel.setModel((new JTable(dataMahasiswa , view1.namaKolom)).getModel());
                    
                    }
                    else JOptionPane.showMessageDialog(null, "Tidak Jadi Dihapus");
                }
            }
        });
    }
}
