import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author Lab Informatika
 */
public class FormMhs extends JFrame{
    JLabel lnim,lnama,lalamat;
    JTextField txnim,txnama,txalamat;
    JButton cetak,lihat,update,delete;
   
    Statement statement;
    
    public void tesformmhs (){
        
        setTitle("From Pengisian Mahasiswa");
        
        lnim = new JLabel("NIM");
        lnama = new JLabel("Nama");        
      
        lalamat = new JLabel("Alamat");
        
        txnim = new JTextField("");
        txnama = new JTextField("");
        txalamat = new JTextField("");
        
        cetak = new JButton("Cetak");
        lihat = new JButton("Lihat");
        update= new JButton("Update");
        delete=new JButton("Delete");
        
        setLayout(null);
        add(lnim);
        add(lnama);
      
        add(lalamat);
        add(txnim);
        add(txnama);
        add(txalamat);
        add(cetak);
        add(lihat);
        add(update);
        add(delete);
        
        lnim.setBounds(75, 50, 30, 20);
        lnama.setBounds(75, 75, 50, 20);
      
        lalamat.setBounds(75, 125, 50, 20);
        txnim.setBounds(150, 50, 150, 20);
        txnama.setBounds(150, 75, 150, 20);
        txalamat.setBounds(150, 125, 150, 100);
        cetak.setBounds(75, 230, 75, 20);
        lihat.setBounds(155, 230, 75, 20);
        update.setBounds(235, 230, 75, 20);
        delete.setBounds(315, 230, 75, 20);
       
        
        setSize(500,500);
        
        
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        cetak.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                int x1=  Integer.parseInt(txnim.getText());
                String x2 = txnama.getText();
                String x3 = txalamat.getText();
      
                        
                Conn koneksi = new Conn();
                    try {
                        statement = koneksi.getKoneksi().createStatement();
                        String sql = "INSERT INTO data_mhs VALUES ('"
                                + x2 + "','" + x1 + "','" + x3 + "','"+ "')";
                        statement.executeUpdate(sql);
                        JOptionPane.showMessageDialog(rootPane, "Data Tersimpan");
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(FormMhs.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (SQLException ex) {
                        Logger.getLogger(FormMhs.class.getName()).log(Level.SEVERE, null, ex);
                    }
                
               
                System.out.println("NIM = "+x1);
                System.out.println("Nama = "+x2);
                System.out.println("Alamat"+x3);
                    
                } catch (NumberFormatException ex) {
                 JOptionPane.showMessageDialog(rootPane,"TIPE DATA SALAH");
                } catch (Error ext){
                 JOptionPane.showMessageDialog(rootPane,"SALAH");
                 
                }
            }

          
        });
        lihat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
               LihatData lihat = new LihatData();
               lihat.Lihatdata();
            }
            
        });
        
        update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
               EditData edit = new EditData();
               edit.EditData();
            }
            
        });
        
        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
               DelData delete = new DelData();
               delete.DelData();
            }
            
        });
    }
}
        
    


