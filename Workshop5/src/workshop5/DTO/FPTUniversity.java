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
public class FPTUniversity extends University implements Role{
    private String address;

    public FPTUniversity(String address, String name) {
        super(name);
        this.address = address;
    }

    public FPTUniversity(int size, String address, String name ) {
        super(name, size);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public String toString(){
        return "FPTU has five campuses HaNoi, HCM, DaNang, CanTho, QuyNhon";
    }
    
    @Override
    public void createWorker() {
        System.out.println("Providing human resources");
    }
}
