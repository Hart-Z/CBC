import java.util.Arrays;

/* 
    Is Unique: Implement an algorithm to determine if a string has all unique characters.
    What if you cannot use additional data structures? 
*/

public class Q1{
    public static void main (String[] arg)
    {
        String a = "abcddop";
        String b = "abrtppo";
        System.out.println(isUnique3(a));
        System.out.println(isUnique3(b));

    }

    // Solution1 : Sort first
    public static boolean isUnique1(String str){
        char[] s = str.toCharArray();
        Arrays.sort(s);
        for(int i=1 ;i<s.length ; i++)
        {
            if(s[i]==s[i-1])
                return false;
        }      
        return true;
    }

    // Solution2 : ASCII pool
    public static boolean isUnique2(String str)
    {
        int[] pool = new int[128];
        for(char c : str.toCharArray())
        {
            if(pool[c]>0)
                return false;
            else
                pool[c]++;
        }
        return true;
    }

    // Solution 3 : Bit Manipulation (work for [a-z])
    public static boolean isUnique3(String str)
    {
        int pool = 0;
        for (char c : str.toCharArray())
        {
            int offset = c-'a';
            if((pool&(1<<offset))>0)
                return false;
            else
                pool|=1<<offset;
        }
        return true;
    }
}   