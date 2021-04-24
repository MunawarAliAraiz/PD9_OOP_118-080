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
    
    boolean numericValidator(String s,int size){
        
        boolean flag=true;
        int length=s.length();
        
        if(length==size){
            
            for(int i=0;i<length;i++)
            {
                if(!(s.charAt(i)>='0' && s.charAt(i)<='9')){
                
                    flag=false;
                    break;
                }
            }
        
        }else{
            flag=false;
        }
        
        return flag;
    }
    
    boolean alphabetValidator(String s){
        
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
    
    boolean isPalindrome(String s){
        
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
    
}

