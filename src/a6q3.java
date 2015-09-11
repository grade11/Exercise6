
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author muirw5809
 */
public class a6q3 {
    static void factors1 (int number){
    int n = 0;    
    for(n=1;n<=number;n++){
    if(number%n==0){
        System.out.println(n);  
    }
        
    }      
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);
        
        
         System.out.println("the factors are ");
         factors1(9);
        
        
       
    }
}
