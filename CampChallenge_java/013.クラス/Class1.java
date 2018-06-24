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
public class Class1 {
    String name = "";
    int age = 0;
    String adress = "";
    
    public void setProfile(String n, int a, String A){
      this.name = n;
      this.age = a;
      this.adress = A;
    }
    
    public void printProfile(){
        System.out.print(this.name);
        System.out.print(this.age);
        System.out.print(this.adress);
    } 
}
