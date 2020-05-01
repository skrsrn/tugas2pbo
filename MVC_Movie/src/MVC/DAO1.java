package MVC;

import java.sql.*;
import javax.swing.JOptionPane;

public class DAO1 {
    private int jmlData;
    private Connection koneksi;
    private Statement statement;
    public DAO1(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/film";
            koneksi = DriverManager.getConnection(url, "root", "");
            statement = koneksi.createStatement();
            JOptionPane.showMessageDialog(null, "Koneksi Berhasil");
        } catch (ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Class Not Found : " + ex);
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "SQL Exception : " + ex);
        }
    }
    
    public void Insert(Model1 Model){
        try{
            String query = "INSERT INTO list VALUES (NULL,'"+Model.getJudul()+"','"+Model.getTipe()+"',"
                    + "'"+Model.getEpisode()+"','"+Model.getGenre()+"','"+Model.getStatus()+"','"+Model.getRating()+"')";
            statement.executeUpdate(query); 
            JOptionPane.showMessageDialog(null, "Data disimpan");
        } catch (Exception sql){
            JOptionPane.showMessageDialog(null, sql.getMessage());
        }
    }
    
    public void Update(Model1 Model) {
        try{
            String query = "UPDATE list SET judul = '"+Model.getJudul()+"', tipe = '"+Model.getTipe()+"',"
                +" episode = '"+Model.getEpisode()+"', genre = '"+Model.getGenre()
                +"', status = '"+Model.getStatus()+"', rating = '"+Model.getRating()
                +"' WHERE idFilm = '"+Model.getIdfilm()+"'";
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Berhasil di Update");
        } catch (SQLException sql){
            System.out.println(sql.getMessage());
        }
    }
    
    public void Delete(Model1 Model) {
        try{
            String query = "DELETE FROM list WHERE idFilm = '"+Model.getIdfilm()+"'";
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Berhasil di Hapus");
        } catch (SQLException sql){
            System.out.println(sql.getMessage());
        }
    }
    
    public String[][] readFilm(){
        try{
            int jmlData = 0; 
            String data[][] = new String[getJmldata()][8];
            String query = "SELECT * FROM list";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){ 
                data[jmlData][0] = String.valueOf(jmlData+1); 
                data[jmlData][1] = resultSet.getString("idFilm");
                data[jmlData][2] = resultSet.getString("judul");
                data[jmlData][3] = resultSet.getString("tipe");
                data[jmlData][4] = resultSet.getString("episode");
                data[jmlData][5] = resultSet.getString("genre");
                data[jmlData][6] = resultSet.getString("status");
                data[jmlData][7] = resultSet.getString("rating");
                jmlData++; 
            }
            return data;
        } catch (SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return null;
        }
    }
    
    public String[][] Search(Model1 Model){
        try{
            int jmlData = 0; 
            String judul = Model.getSearch();
            String data[][] = new String[getJmlData(judul)][8];
            String query = "SELECT * FROM list WHERE judul LIKE '%" + Model.getSearch() + "%'";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                data[jmlData][0] = String.valueOf(jmlData+1);
                data[jmlData][1] = resultSet.getString("idFilm");
                data[jmlData][2] = resultSet.getString("judul");
                data[jmlData][3] = resultSet.getString("tipe");
                data[jmlData][4] = resultSet.getString("episode");
                data[jmlData][5] = resultSet.getString("genre");
                data[jmlData][6] = resultSet.getString("status");
                data[jmlData][7] = resultSet.getString("rating");
                jmlData++; 
            }
            return data;
        } catch (SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return null;
        }
    }
    
    public int getJmldata(){
        int jmlData = 0;
        try{
            String query = "SELECT * FROM list";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                jmlData++;
            }
            return jmlData;
        } catch (SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return 0;
        }
    }

    private int getJmlData(String judul) { 
        int jmlData = 0;
        try{
            String query = "SELECT * FROM list WHERE judul LIKE '%" + judul + "%'";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                jmlData++;
            }
            return jmlData;
        } catch (SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return 0;
        }
    }
}