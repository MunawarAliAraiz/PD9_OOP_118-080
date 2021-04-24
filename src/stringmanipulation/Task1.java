/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringmanipulation;

/**
 *
 * @author Munawar Ali
 */
public class Task1 {
    
    public static int wordCounter(String s)
    {
       s = Task3.ridMultipleBlank(s);
       int j = 1;
       for(int i=0; i<s.length();i++)
       {
           if(s.charAt(i) == ' ')
           {
               j += 1;
           }
       }
       return j;
    }
    
    public static int vowelCounter(String s)
    {
       int j = 0;
       for(int i=0; i<s.length();i++)
       {
           if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'
              || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U')
           {
               j += 1;
           }
       }
       return j;
    }
    
    public static int puncCounter(String s)
    {
       int j = 0;
       for(int i=0; i<s.length();i++)
       {
           if(s.charAt(i) == ',' || s.charAt(i) == ';' || s.charAt(i) == ':' || s.charAt(i) == '.' || s.charAt(i) == '/'
              || s.charAt(i) == '!' || s.charAt(i) == '?' || s.charAt(i) == '\'' || s.charAt(i) == '\"' || s.charAt(i) == '-')
           {
               j += 1;
           }
       }
       return j;
    }
}
