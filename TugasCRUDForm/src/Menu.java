import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;


public class Menu extends JFrame{
    JLabel ljudul;
    JButton create, read, delete, update, exit;
    
    public void Menuu (){
        
        setTitle("MENU");
        ljudul = new JLabel("MENU");
        create = new JButton("1. Input Data Mahasiswa");
        read = new JButton("2. Tampilkan seluruh Data");
        delete = new JButton("3. Hapus Data Mahasiswa");
        update = new JButton("4. Edit Data Mahasiswa");
        exit = new JButton("0. Exit");
        
        setLayout(null);
        add(ljudul);
        add(create);
        add(read);
        add(delete);
        add(update);
        add(exit);
        
        ljudul.setBounds(160, 20, 100, 20);
        create.setBounds(75, 50, 200, 20);
        read.setBounds(75, 75, 200, 20);
        delete.setBounds(75, 100, 200, 20);
        update.setBounds(75, 125, 200, 20);
        exit.setBounds(75, 150, 200, 20);
        setSize(370,300); //untuk luas jendela
        
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        create.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               FormMhs create = new FormMhs();
               create.tesformmhs();
            }
            
        });
        read.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               LihatData lihat = new LihatData();
               lihat.Lihatdata();
            }
            
        });
        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               HapusData hapus = new HapusData();
               hapus.HapusData();
            }
            
        });
        update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               EditData edit = new EditData();
               edit.EditData();
            }
            
        });
        exit.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
            
        });
    }

    
}