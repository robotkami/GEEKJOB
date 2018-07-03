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
public abstract class Human {
    protected ArrayList<Integer> myCards = new ArrayList<Integer>(); // 手札の情報
    
    public abstract int open(); //手札の合計値
    public abstract void setCard(ArrayList<Integer> cards); //引いたカードを山札にセットする
    public abstract boolean checkSum(); //引くかどうかを判断する
      
}

