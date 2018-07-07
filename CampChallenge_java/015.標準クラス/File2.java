/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kadai;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.io.*;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author ak
 */
public class File2 {
    public static void main(String[]args){
        
        try {
            Date d = new Date();
            SimpleDateFormat sdf;
            sdf = new SimpleDateFormat("yyyy年MM月dd日 HH時mm分ss秒");
            String now = sdf.format(d);
            
            Calendar gantan = Calendar.getInstance();
            gantan.set(2018,0,1,0,0,0);
            Date dateGantan = gantan.getTime();
      
            File kadai = new File("kadai.txt");  
            FileWriter fw = new FileWriter(kadai,true);
            fw.write(now + " 処理を開始します\n");
            if(dateGantan.after(d)){
                fw.write("2018元旦は今より未来です\n");
            }else{
                fw.write("2018元旦は今より過去です\n");

            }
            fw.write(now + " 処理を終了しました");
            fw.close();
            
            FileReader fr = new FileReader(kadai);
            BufferedReader br = new BufferedReader(fr);
            String str = br.readLine();    //一行目を読む
            while(str != null){
                System.out.println(str);   //一行目を表示 
                str = br.readLine();       //次の行を表示
            }
//            System.out.println(str);
//            System.out.println(str);
            br.close();
        } catch (IOException ex) {
            Logger.getLogger(File2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
