package workshop5.DTO;


import workshop5.DTO.Organization;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Colony extends Organization{
    private String place;

    @Override
    public void communicateByTool() {
        System.out.println("The colony communicate by sound.");
    }

    public Colony(String place) {
        this.place = place;
    }

    public Colony( int size, String  place) {
        super(size);
        this.place = place;
    }

    public void grow(){
        System.out.println("An annual cycle of growth that begins in spring");
    }
    public void reproduce(){
            System.out.println("Colony can reproduce itself through a process");
    }
    @Override
    public String toString(){
        return "The colony size is" + super.size + "The colony's place is" + this.place;
    }
    }
    
