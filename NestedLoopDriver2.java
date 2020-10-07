
/**
 * Demonstration of nested loop patterns
 * 
 * @author GrayKnight CPM 2017 
 * @version 1/2/17
 */

import java.util.Scanner;
public class NestedLoopDriver2
{
    private Scanner grab = new Scanner(System.in);
    private NestedLoopModeler2 nlm = new NestedLoopModeler2();
    
    public void userInput() 
    {
       
       int x = 0, sentinelValue= 1;

       while (sentinelValue > 0 )
       {

           System.out.println("Nested Loops Assignment");

           System.out.print( "Enter an integer. I'll make a square and some triangles.\n" +
                          "(enter zero to quit) : ");
           x=grab.nextInt();
    
           sentinelValue = x;

               
        
        System.out.print(nlm.triangle_b(x));
        System.out.println(nlm.triangle_d(x));
        System.out.println(nlm.drawEmptySquare(x));
        System.out.print(nlm.drawRhombus(x));
       
       }//end of while loop
}//end of method

}
