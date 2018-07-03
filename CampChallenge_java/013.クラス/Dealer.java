/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BlackJack;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author ak
 */

public class Dealer extends Human{
    protected ArrayList<Integer> cards;  //山札の作成
    
    public Dealer(){ //コンストラクタ
        cards= new ArrayList<Integer>();
        for(int i=0; i<4; i++){          
            for(int j=1; j<=13; j++){
                if(j > 10){
                    cards.add(10);
                }else{
                    cards.add(j);
                }
            }
        }
    } 
    public ArrayList<Integer> hit(){ //一枚引く
        ArrayList<Integer> oneCard = new ArrayList<Integer>();
        Random rand = new Random();
        Integer index = rand.nextInt(cards.size()); //size.lengthは使えない。
        oneCard.add(cards.get(index)); // card.add(index)は34行目のindexは要素番号だけど、35行目では単純に数値になる。cardsの要素番号をたすの意
        cards.remove(index);
        return oneCard;
    }
    
    public ArrayList<Integer> deal(){ //二枚引く
        ArrayList<Integer> twoCard = new ArrayList<Integer>();
        for(int i = 0; i < 2; i++ ){
        Random rand = new Random();
        Integer index = rand.nextInt(cards.size());
        twoCard.add(cards.get(index));
        cards.remove(index);  
        }
        return twoCard; 
    }
    
    public int open(){
        int total = 0;
        for(int i=0; i<myCards.size(); i++){
            total += myCards.get(i);
        }
        return total;
    }
    
    public void setCard(ArrayList<Integer> cards){
         for(int i = 0; i < cards.size(); i++){
             myCards.add(cards.get(i));
         }
         
    }
   
    public boolean checkSum(){
       if(open() < 17){
           return true;
       }else{
           return false;
       }
    }
}
        
        
    
    
    
   

 
    

