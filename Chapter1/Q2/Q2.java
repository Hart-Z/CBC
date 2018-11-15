import java.util.Arrays;

class Q2{
    public static void main(String[] arg)
    {
        String a = "abcdef";
        String b = "fcdbae";
        System.out.println(CheckP2(a,b));
    }

    public static boolean CheckP1(String a, String b)
    {
        char[] array_a = a.toCharArray();
        char[] array_b = b.toCharArray();
        Arrays.sort(array_a);
        Arrays.sort(array_b);
        // System.out.println(String.valueOf(array_a));
        // System.out.println(String.valueOf(array_b));
        return new String(array_a).equals(new String(array_b));
    }
    public static boolean CheckP2(String a, String b)
    {
        int[] pool = new int[128];
        for(char c : a.toCharArray())
            pool[c]++;
        
        for(char c : b.toCharArray())
        {
            pool[c]--;
            if(pool[c]<0)   return false;
        }

        return true;
    }
}