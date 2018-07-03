/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BlackJack;

import java.util.ArrayList;

/**
 *
 * @author ak
 */
class User extends Human{
    public int open(){
        int total = 0;
        for(int i=0; i<myCards.size(); i++){
            total += myCards.get(i);
        }
        return total;
    }
    
    public void setCard(ArrayList<Integer> cards){
        for(int i=0; i<cards.size(); i++){
            myCards.add(cards.get(i));
        }
    }
    
    public boolean checkSum(){
        if(open() < 21){
            return true;
        }else{
            return false;
        }
    }
    
    
    
}
    

