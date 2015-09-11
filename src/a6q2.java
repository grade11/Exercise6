
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author muirw5809
 */
public class a6q2 {
    
    static void ExamGrade (double percentage1 )
    {
        if((percentage1) >= 80){
            System.out.println("you recieved an A");            
        }
        if((percentage1)<=50 ){
            System.out.println("you recieved a F");
        }
        if((percentage1)>=50)
        {
            if((percentage1) <=59){
                System.out.println("you recieved a D");
            }     
        }
        if((percentage1) >=60)
        {
            if((percentage1) <=69)
            {
                System.out.println("you recieved a C"); 
            }
        }
        if((percentage1) >=70)
        {
            if((percentage1) >=79)
            {
                System.out.println("you recieved a B");
            } 
               
        }
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter grade percentage here");
        double percentage1 = input.nextDouble();
        
        ExamGrade(percentage1);
        
        
        
        
    }
}
