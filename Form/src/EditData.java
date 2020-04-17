
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;


public class EditData extends JFrame {
    JLabel lnim,lnama,lalamat,ljudul;
    JTextField txnim,txnama,txalamat;
    JButton btnup,btnkem;
    ResultSet resultSet;
      Statement statement;
      
    public void EditData(){
        ljudul=new JLabel("Masukkan Nim yang akan diupdate ");
        lnim = new JLabel("NIM");
        lnama = new JLabel("Nama");        
        lalamat = new JLabel("Alamat");
        
        txnim = new JTextField("");
        txnama = new JTextField("");
        txalamat = new JTextField("");
        
        btnup=new JButton("Update");
        btnkem=new JButton("Kembali");
        
        setTitle("Update Data Mhs");
        setSize(300,370);
        ljudul.setHorizontalAlignment(SwingConstants.CENTER);
         setDefaultCloseOperation(EXIT_ON_CLOSE);
            setVisible(true);
       setLayout(null);
       add(lnim);
        add(lnama);
      
        add(lalamat);
        add(txnim);
        add(txnama);
        add(txalamat);
        add(btnup);
        add(btnkem);
       ljudul.setBounds(0,10,300,25);
        lnim.setBounds(50,50,100,25);
         txnim.setBounds(100,50,100,25);
          lnama.setBounds(50,90,100,25);
           txnama.setBounds(100,90,100,25);
            lalamat.setBounds(50,210,100,25);
            txalamat.setBounds(100,210,100,25);
             btnkem.setBounds(30,290,100,25);
              btnup.setBounds(140,290,100,25);
              
              btnkem.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e){
              setVisible(false);
              new FormMhs();
          }
    });
               btnup.addActionListener(new ActionListener() {
                    @Override
          public void actionPerformed(ActionEvent e){
              
              btnupactionListener();
          }

            private void btnupactionListener() {
               Conn koneksi = new Conn();
                    try {
                        statement=koneksi.getKoneksi().createStatement();
                        statement.executeUpdate("UPDATE data_mhs SET nama='"+ txnama.getText()+"',"+"alamat='"+
                                txalamat.getText()+"'WHERE nim='"+txnim.getText()+"'");
                         JOptionPane.showMessageDialog(null,"Data Tersimpan","Hasil",JOptionPane.INFORMATION_MESSAGE);
                         statement.close();
                          }catch (SQLException ex){
                        JOptionPane.showMessageDialog(null,"gagal tampil!","Hasil",JOptionPane.ERROR_MESSAGE);
                    }catch (ClassNotFoundException ex) {
                        JOptionPane.showMessageDialog(null,"gagal Drive!","Hasil",JOptionPane.ERROR_MESSAGE);
                    }
            }
                   
               });
               }
}



