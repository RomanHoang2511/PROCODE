/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

/**
 *
 * @author Admin
 */
public class Hashset {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();
        HashSet myset = new HashSet();
        for (int i = 0; i < 10; i++) {
            int number = r.nextInt(100);
           myset.add(number);
           
            
        }
        
    Iterator iter = myset.iterator();
    while(iter.hasNext()){
            System.out.println(iter.next());
    }
    
}
}
