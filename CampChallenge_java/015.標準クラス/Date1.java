/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kadai;
import java.util.Date;
import java.util.Calendar;
/**
 *
 * @author ak
 */
public class Date1 {
    public static void main(String[]args){
        Calendar c = Calendar.getInstance();
        c.set(2016,0,1,0,0,0);
        System.out.println(c.getTime().getTime());
    }
}
