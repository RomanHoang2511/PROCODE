/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop5.DTO;

/**
 *
 * @author Admin
 */
public class University extends Organization{
    private String name;

    public University(String name) {
        this.name = name;
    }

    public University(String name, int size) {
        super(size);
        this.name = name;
    }
    
    @Override
    public void communicateByTool() {
        System.out.println("In the university, people communicate by voice");
    }
    public void enroll(){
        System.out.println("The registration for enrollment is only valid when the University has received all enrollment documents and enrollment fees");

    }
    public void educate(){
        System.out.println("Provide education at university standard");
    }
    public String toString(){
        return "Encoutage the advancement and development of knowledge";
    }
    
}
