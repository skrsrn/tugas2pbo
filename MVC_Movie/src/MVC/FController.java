package MVC;

import java.awt.event.*;
import javax.swing.*;

public class FController {
    Model1 model1;
    View1 view1; 
    DAO1 dao1; 
    String idfilm, judul, tipe, episode, genre, status, rating;
    
    public FController(Model1 model1, View1 view1, DAO1 dao1){
        this.model1 = model1;
        this.view1 = view1;
        this.dao1 = dao1;
        
        if(dao1.getJmldata() != 0){
            String dataMahasiswa[][] = dao1.readFilm();
            view1.tabel.setModel((new JTable(dataMahasiswa, view1.namaKolom)).getModel());
        } else { 
            JOptionPane.showMessageDialog(null, "Data tidak ada!");
        }
        
        view1.refresh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                 String dataMahasiswa[][] = dao1.readFilm();
                 view1.tabel.setModel((new JTable (dataMahasiswa, view1.namaKolom)).getModel());
                
                 view1.txjudul.setText(null);
                 view1.txtipe.setText(null);
                 view1.txepisode.setText(null);
                 view1.txgenre.setText(null);
                 view1.txrating.setText(null);
            }
        });
        
        view1.simpan.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String judul = view1.getJudul();
                String tipe = view1.getTipe();
                String episode = view1.getEpisode();
                String genre = view1.getGenre();
                String status = view1.getStatus();
                String rating = view1.getRating();
                
                if(judul.isEmpty() || tipe.isEmpty() || episode.isEmpty()
                    ||genre.isEmpty() || status.isEmpty() || rating.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Harap isi semua field");
                } else {
                   
                    model1.setModel1(judul, tipe, episode, genre, status, rating);
                    dao1.Insert(model1);
                }
            }
        });
        
        view1.tabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                super.mouseClicked(e);
                int baris = view1.tabel.getSelectedRow();
                int kolom = view1.tabel.getSelectedColumn();
                
                idfilm = view1.tabel.getValueAt(baris,1).toString();
                judul = view1.tabel.getValueAt(baris,2).toString();
                tipe = view1.tabel.getValueAt(baris,3).toString();
                episode = view1.tabel.getValueAt(baris,4).toString();
                genre = view1.tabel.getValueAt(baris,5).toString();
                status = view1.tabel.getValueAt(baris,6).toString();
                rating = view1.tabel.getValueAt(baris,7).toString();
                
                view1.txjudul.setText(judul);
                view1.txtipe.setText(tipe);
                view1.txepisode.setText(episode);
                view1.txgenre.setText(genre);
                view1.status.setSelectedItem(status);
                view1.txrating.setText(rating);
            }
        });
        
        view1.update.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String judul = view1.getJudul();
                String tipe = view1.getTipe();
                String episode = view1.getEpisode();
                String genre = view1.getGenre();
                String status = view1.getStatus();
                String rating = view1.getRating();
                
                if(judul.isEmpty() || tipe.isEmpty() || episode.isEmpty()
                    ||genre.isEmpty() || status.isEmpty() || rating.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Harap isi semua field");
                } else {
                    model1.setIdfilm(idfilm);
                    model1.setModel1(judul, tipe, episode, genre, status, rating);
                    dao1.Update(model1);
                }
            }
        });
                
        view1.delete.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                
                int del = JOptionPane.showConfirmDialog(null, "Anda yakin ingin menghapus data ini? ","",JOptionPane.YES_NO_OPTION);

                if (del == 0){
                    model1.setIdfilm(idfilm);
                    dao1.Delete(model1);
                }
            }
        });
        
        view1.cari.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String cari = view1.getSearch();
                if(cari.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Harap isi field search");
                } else {
                    model1.setSearch(cari);
                    String dataMahasiswa[][] = dao1.Search(model1);
                    view1.tabel.setModel((new JTable (dataMahasiswa, view1.namaKolom)).getModel());
                
                }
                
            }
        });
        
        view1.exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                view1.setVisible(false);
            }
        });
    }
}