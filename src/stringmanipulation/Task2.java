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
