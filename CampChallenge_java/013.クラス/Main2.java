/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kadai;

/**
 *
 * @author ak
 */
public class Main2 {
    public static void main (String[]args){
        Class2 first = new Class2();
        first.setProfile("上村",26,"東京都");
        first.printProfile();
        first.clearProfile();
        first.printProfile();
        
    }
}
