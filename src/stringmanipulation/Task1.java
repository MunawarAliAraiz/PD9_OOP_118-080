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
public class Task1 {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        
        System.out.println("Enter String:");
        String s=obj.nextLine();
        
        System.out.println("Enter sub String to find:");
        String sub=obj.next();
        
        System.out.println("Number of words: "+wordCounter(s));
        System.out.println("Number of vowels: "+vowelCounter(s));
        System.out.println("Number of Punctuations: "+puncCounter(s));
        if(findSubString(s,sub)==true )
        {
            System.out.println("\" "+sub+"\" "+"is part of this string.");
        }else{
            System.out.println("\" "+sub+"\" "+"is not part of this string.");
        }
    }
    
    public static int wordCounter(String s)
    {
        int count=0;
        
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                count++;
            }
        }
        
        return count+1;
    }
    
    public static int vowelCounter(String s)
    {
        int count=0;
        
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U')
            {
                count++;
            }
        }
        
        return count;
    }
    
    public static int puncCounter(String s)
    {
        int count=0;
        
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='.' || s.charAt(i)==',' || s.charAt(i)=='?' || s.charAt(i)==';' || s.charAt(i)==':' || s.charAt(i)=='"')
            {
                count++;
            }
        }
        
        return count;
    }
    
    public static boolean findSubString(String s,String sub)
    {
        boolean flag=false;
        String[] temp = s.split(" ");
        int size=temp.length;
        
        for(int i=0;i<size;i++)
        {
            if (temp[i].equals(sub) ){
                flag=true;
                break;
            }
        }
        
        return flag;
    }
    
}
