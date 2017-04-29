/*
    Question:
    Is Unique: Implement an algorithm to determine if a string has all unique 
    characters. What if you cannot use additional data structures?

    Answer:
    If additional data structure cannot be used then simply sort the string and 
    compare adjacent values. If they are same return false. It will take O(n Log n)
    time.
 */
package cci_chap1_isunique;

import java.util.HashMap;

/**
 *
 * @author Ali
 */
public class CCI_Chap1_isUnique {

 
    public static void main(String[] args) 
    {
        System.out.println(isUnique("Ali Hsn"));
    }
    
    private static boolean isUnique(String str)
    {
        if(str.length() == 0)
            return true;
        
        HashMap<Character, Integer> map = new HashMap<>();
        str = str.replaceAll("[^A-Za-z]+", "").toLowerCase();
        for(int i=0; i<str.length(); i++)
        {
            if(map.get(str.charAt(i)) != null)
                return false;
            map.put(str.charAt(i), 1);
        }
        return true;
    }
    
}
