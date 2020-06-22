
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sadwi
 */
public class fileDao {
    public static ArrayList<Words> LoadFile(String filename){
        ArrayList<Words> list = new ArrayList<>();
        File file = new File(filename);
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(fileDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        FileReader f=null;
        BufferedReader bf=null;
        try {
            f=new FileReader(filename);
            bf= new BufferedReader(f);
            while (bf.ready()) {                
                String s = bf.readLine();
                String[] arr = s.split(";");
                if(arr.length == 2){
                    Words p = new Words(arr[0],arr[1]);
                    list.add(p);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            try {
                if(f!=null)f.close();
                if(bf!=null)bf.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return list;
    }
    public static void WriteFile(String filename,ArrayList<Words> list){
        if(list==null) return;
        PrintWriter w = null;
        try {
            w=new PrintWriter(filename);
            for (Words words : list) {
                w.println(words.toString());
            }
        } catch (Exception ex) {
            ex.getStackTrace();
        }
        finally{
            try {
                if(w!=null) w.close();
            } catch (Exception e) {
                e.printStackTrace();
            }           
        }
    }
    
}
