
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author muirw5809
 */
public class a6q1 {
    
    static double circleArea (int radius)
    {
        double CircleArea = Math.PI*(radius * radius);
        return CircleArea;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please input radius");
        int radius = input.nextInt();
        double CircleArea = circleArea(radius);
        System.out.println("The circles area is " + CircleArea );
    }
}
