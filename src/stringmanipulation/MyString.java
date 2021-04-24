/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringmanipulation;

/**
 *
 * @author hussa
 */
public class MyString {
    
    public static boolean numericValidator(String s){
        
        boolean flag = false;
        
            for(int i=0;i<s.length();i++)
            {
                if(!(s.charAt(i)>='0' && s.charAt(i)<='9')){
                
                    flag=false;
                    break;
                }
            }
        
        return flag;
    }
    
    public static boolean alphabetValidator(String s){
        
        boolean flag=false;
        int length=s.length();
        
        for(int i=0;i<length;i++)
         {
          if (!(s.charAt(i)>='A'&& s.charAt(i)<='Z' || s.charAt(i)>='a' && s.charAt(i)<='z' ||s.charAt(i)==' '))
             {
              flag=false;
             }
         }
        return flag;
    }
    
    public static boolean isPalindrome(String s){
        
        boolean flag=true;
        int length=s.length();
        int j=length-1;
        
        for(int i=0;i<length;i++){
        
            if(!(s.charAt(i) == s.charAt(j) )){
                flag=false;
                break;
            }
            j--;
        }
        
        return flag;
    }
    
    public static String toLower(String s)
    {
        String ss = "";
        for(int i=0; i<s.length(); i++)
        {
            if((int)s.charAt(i) >= 65 && (int)s.charAt(i) <= 90)
            {
                int a = (int)s.charAt(i)+32;
                char b = (char)a;
                ss = ss + b;
            }
            else
                ss = ss + s.charAt(i);
        }
        return ss;
    }
    
    public static String toUpper(String s)
    {
        String ss = "";
        for(int i=0; i<s.length(); i++)
        {
            if((int)s.charAt(i) >= 97 && (int)s.charAt(i) <= 122)
            {
                int a = (int)s.charAt(i)-32;
                char b = (char)a;
                ss = ss + b;
            }
            else
                ss = ss + s.charAt(i);
        }
        return ss;
    }
}

