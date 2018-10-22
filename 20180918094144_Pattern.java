/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern;
import java.util.Scanner;

/**
 *
 * @author 1794147
 */
public class Pattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Scanner console = new Scanner(System.in);
       int num;
      
       System.out.print("Enter number of lines you want to print :");
       num = console.nextInt();
       for(int i=0;i<num;i++){
           for(int j=num;j>i;j--){
               System.out.print(" *");
           }
           System.out.println(" ");
            for(int k=0;k<=i;k++){
                System.out.print(" ");
            }
           
       }
       console.close();
    }
    
}
