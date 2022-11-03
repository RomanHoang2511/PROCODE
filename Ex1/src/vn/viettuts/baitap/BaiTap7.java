package vn.viettuts.baitap;
 
import java.util.Scanner;
 
/**
 * Chương trình liệt kê n số nguyên tố đầu tiên.
 * 
 * @author viettuts.vn
 */
public class BaiTap7 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Nhập a = ");
        double a = scanner.nextDouble();
        System.out.print("Nhập b = ");
        double b = scanner.nextDouble();
        double c = -b/a;
        System.out.printf("X: %.2f",c);    
    }   
}