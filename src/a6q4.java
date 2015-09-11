
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author muirw5809
 */
public class a6q4 {
     static double compoundinterest (double p, double r, int n)
     {
      
   
            
         double balance = p *(Math.pow(1 + r, n));
         balance = Math.round(balance * 100.0) / 100.0;
         return balance;
         
  
         
         
     }   
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double ans = compoundinterest(100, 0.02, 10);
        System.out.println(ans);
        
        
        
    }
}
