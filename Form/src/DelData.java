
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;


public class DelData extends JFrame {
     ResultSet resultSet;
      Statement statement;
      JButton btnDel,btnKembali;
      JLabel ljudul,lnim;
      JTextField txnim;
      
      
      public void DelData(){
          
      ljudul=new JLabel("Hapus Data Mhs");
        lnim = new JLabel("NIM");
        btnDel=new JButton("Hapus");
        btnKembali=new JButton("Kembali");
        
        setTitle("Hapus Data Mhs");
        setSize(300,200);
       ljudul.setHorizontalAlignment(SwingConstants.CENTER);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
            setVisible(true);
            
            setLayout(null);
            add(ljudul);
            add(lnim);
            add(txnim);
            add(btnDel);
            add(btnKembali);
            
            ljudul.setBounds(50,10,150,25);
            lnim.setBounds(50,50,100,25);
            txnim.setBounds(100,50,100,25);
            btnKembali.setBounds(30,90,100,25);
            btnDel.setBounds(140,90,100,25);
            
             btnKembali.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e){
              setVisible(false);
              new FormMhs();
          }
         
         }); 
             btnDel.addActionListener(new ActionListener() {
                    @Override
          public void actionPerformed(ActionEvent e){
              
              btnBuatactionListener();
              
          }

          private void btnBuatactionListener() {
               Conn koneksi = new Conn();
                    try {
                        statement=koneksi.getKoneksi().createStatement();
                        statement.executeUpdate("DELETE FROM data_mhs WHERE nim='"+txnim.getText()+"'" );
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
      };
             
