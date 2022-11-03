/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import workshop5.DTO.BeeColony;
import workshop5.DTO.Colony;
import workshop5.DTO.FPTUniversity;
import workshop5.DTO.Role;
import workshop5.DTO.University;

/**
 *
 * @author Admin
 */
public class Tester {

   public static void main(String[] args){

        Colony obj1=new BeeColony(2000,"honey", "land");
        System.out.println(obj1);
        obj1.grow();
        obj1. reproduce();

        University obj2=new FPTUniversity(100000,"FPT","HaNoi");
        System.out.println(obj2);
        obj2.enroll();
        obj2.educate();
        
        Role df= new BeeColony(3000,"wasp","land");
        System.out.println(df);
        df.createWorker();
    
        df= new FPTUniversity(100000,"FPT","HaNoi");
        System.out.println(df);
        df. createWorker ();
            
   }
}


