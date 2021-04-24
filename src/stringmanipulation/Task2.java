/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringmanipulation;
import java.util.Scanner;

/**
 *
 * @author Munawar Ali
 */
public class Task2 {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        
        System.out.println("Please Enter a sentence.");
        String s=obj.nextLine();
        
        System.out.println("Your sentence printed verticaly is:");
        System.out.print(displayVertical(s));
    }
    
    static String displayVertical(String s){
        
        String temp="";
        int length=s.length();
        
        for(int i=0;i<length;i++)
        {
            if(s.charAt(i)!=' '){
                temp=temp+s.charAt(i)+"\n";
            }
        }
    
        return temp;
    }
    
}
