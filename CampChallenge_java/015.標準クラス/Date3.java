/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kadai;
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
/**
 *
 * @author ak
 */
public class Date3 {
    public static void main(String[]args){
        Calendar c = Calendar.getInstance();
        c.set(2016,10,4,10,0,0);
        long Tsp = c.getTime().getTime();
        System.out.println(Tsp);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println(sdf.format(Tsp));
    }
   
    
    
}

