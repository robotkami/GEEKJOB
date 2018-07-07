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
public class Date4 {
    public static void main(String[]args){
        SimpleDateFormat sdf;
        sdf = new SimpleDateFormat("yyyy時MM月dd日 HH時mm分ss秒");
        
        Calendar a = Calendar.getInstance();
        a.set(2015,0,1,0,0,0);
        System.out.println(sdf.format(a.getTime()));
        long A = a.getTime().getTime();
        System.out.println(A);
        
        Calendar b = Calendar.getInstance();
        b.set(2015,11,31,23,59,59);
        System.out.println(sdf.format(b.getTime().getTime()));
        long B = b.getTime().getTime();
        System.out.println(B);
        
        long C = B-A;
        System.out.println(C);
        Date date = new Date(C);
        System.out.print(sdf.format(date));
    }
}
