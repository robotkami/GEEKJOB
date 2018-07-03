/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BlackJack;


/**
 *
 * @author ak
 */

public class BlackJack{
    public static void main(String[]args){
        Dealer dealer = new Dealer();
        User user = new User();
        
        dealer.setCard(dealer.deal());
        user.setCard(dealer.deal()); 
        
        while(user.checkSum()){
            user.setCard(dealer.hit());
        }
        while(dealer.checkSum()){
            dealer.setCard(dealer.hit());
        }
        
        int userTotal = user.open();
        int dealerTotal = dealer.open();
        
        if(userTotal >21 && dealerTotal >21){
            System.out.println("draw");
        }else if(userTotal > 21){
            System.out.println("Dealer win");
        }else if(dealerTotal > 21){
            System.out.println("user win");
        }else if(userTotal > dealerTotal){
            System.out.println("user win");
        }else if(dealerTotal > userTotal){
            System.out.println("dealer win");
        }else{
            System.out.println("draw");
        }
        System.out.println("userTotal =" + userTotal);
        System.out.println("dealerTotal =" + dealerTotal);   
        
    }
        
}