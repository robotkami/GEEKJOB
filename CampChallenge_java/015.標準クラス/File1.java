/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kadai;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author ak
 */
public class File1 {
    public static void main(String[]args){
        
        try {
            File fp = new File("test.txt");     //ファイルの作成と書き込み
            FileWriter fw = new FileWriter(fp);
            fw.write("よろしくお願いします");
            fw.close();
            
            FileReader fr = new FileReader(fp); //ファイルの読み出しと表示
            BufferedReader br = new BufferedReader(fr);
            System.out.print(br.readLine());
            br.close();
            
        } catch (IOException ex) {
            Logger.getLogger(File1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
